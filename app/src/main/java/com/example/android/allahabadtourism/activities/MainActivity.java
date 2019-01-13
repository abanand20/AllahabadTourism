package com.example.android.allahabadtourism.activities;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.VideoView;

import com.example.android.allahabadtourism.R;
import com.example.android.allahabadtourism.fragments.ActivityFragment;
import com.example.android.allahabadtourism.fragments.AttractionFragment;
import com.example.android.allahabadtourism.fragments.FragmentHelp;
import com.example.android.allahabadtourism.fragments.FragmentRestaurant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    VideoView videoView;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPager.OnPageChangeListener pageChangeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            image = (ImageView) findViewById(R.id.image_header);
            videoView = (VideoView) findViewById(R.id.videoView);
            switch (position) {
                case 0:
                    image.setVisibility(View.GONE);
                    String path = ("android.resource://" + getPackageName() + "/" + R.raw.videoplayback);
                    videoView.setVideoURI(Uri.parse(path));
                    videoView.setVisibility(View.VISIBLE);
                    videoView.start();
                    break;
                case 1:
                    videoView.setVisibility(View.GONE);
                    image.setImageResource(R.drawable.header_activity);
                    image.setVisibility(View.VISIBLE);
                    break;

                case 2:
                    videoView.setVisibility(View.GONE);
                    image.setImageResource(R.drawable.header_restaurant);
                    image.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    videoView.setVisibility(View.GONE);
                    image.setImageResource(R.drawable.header_help);
                    image.setVisibility(View.VISIBLE);
                    break;
            }
        }

        @Override
        public void onPageSelected(int position) {
        }

        @Override
        public void onPageScrollStateChanged(int state) {
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        viewPager.addOnPageChangeListener(pageChangeListener);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        String[] name = getResources().getStringArray(R.array.fragment_name);
        adapter.addFragment(new AttractionFragment(), name[0]);
        adapter.addFragment(new ActivityFragment(), name[1]);

        adapter.addFragment(new FragmentRestaurant(), name[2]);
        adapter.addFragment(new FragmentHelp(), name[3]);
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }
}