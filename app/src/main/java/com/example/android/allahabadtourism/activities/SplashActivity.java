package com.example.android.allahabadtourism.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.android.allahabadtourism.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    public Timer t;
    ImageView splash;

    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_splash);
        splash = (ImageView) findViewById(R.id.imgLogo);
        t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
            }
        }, 3000);
    }
}
