package com.example.android.allahabadtourism.abstract_type;


public class Activities {
    private String getmActivityName;
    private String mActivityShortDesc;
    private int mImageResourceId;

    public Activities(String mActivityName, String mActivityShortDesc, int imageResourceId) {
        this.getmActivityName = mActivityName;
        this.mActivityShortDesc = mActivityShortDesc;
        this.mImageResourceId = imageResourceId;
    }

    public String getGetActivityName() {
        return getmActivityName;
    }

    public String getActivityShortDesc() {
        return mActivityShortDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}
