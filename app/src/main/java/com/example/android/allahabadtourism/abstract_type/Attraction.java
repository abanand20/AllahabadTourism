package com.example.android.allahabadtourism.abstract_type;

public class Attraction {

    private String getmAttractionName;
    private String mAttractionShortDesc;
    private int mImageResourceId;

    public Attraction(String mAttractionName, String mAttractionShortDesc, int imageResourceId) {
        this.getmAttractionName = mAttractionName;
        this.mAttractionShortDesc = mAttractionShortDesc;
        this.mImageResourceId = imageResourceId;
    }

    public String getGetAttractionName() {
        return getmAttractionName;
    }

    public String getAttractionShortDesc() {
        return mAttractionShortDesc;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
