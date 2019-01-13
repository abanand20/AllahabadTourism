package com.example.android.allahabadtourism.abstract_type;

public class HelpLine {
    private String mStaffPosition;
    private String mMobile;
    private int mImageResourceId;

    public HelpLine(String staffPosition, String mobile, int imageResourceId) {
        this.mStaffPosition = staffPosition;
        this.mMobile = mobile;
        this.mImageResourceId = imageResourceId;
    }

    public String getStaffPosition() {
        return mStaffPosition;
    }

    public String getMobile() {
        return mMobile;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }


}

