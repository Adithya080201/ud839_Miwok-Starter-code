package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mRawResourceID;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int rawResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mRawResourceID = rawResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int rawResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mRawResourceID = rawResourceID;
    }

    /*
     **Gets the default translation
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /*
     **Gets the default translation
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /*
    **Gets the image resource ID
     */
    public int getImageResourceID(){
        return mImageResourceID;
    }

    /*
     **Gets the raw resource ID
     */
    public int getRawResourceID(){
        return mRawResourceID;
    }

    /*
    **returns if there is a valid image
     */
    public boolean hasImage(){
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
