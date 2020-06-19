package com.singularity.thetranslator;

public class Word {

    private String mDefaultTranslation;
    private String mHindiTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    Word(String defaultTranslation, String HindiTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mHindiTranslation = HindiTranslation;
        mAudioResourceId= audioResourceId;
    }

    Word(String defaultTranslation, String HindiTranslation,int imageResourceId,int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mHindiTranslation = HindiTranslation;
        mAudioResourceId = audioResourceId;
    }

    public String getDefaultTranslation() { return mDefaultTranslation; }

    public String getHindiTranslation() {  return mHindiTranslation; }

    public int getImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getAudioResourceId() { return mAudioResourceId; }

}