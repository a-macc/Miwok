package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId,
                int audioId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioId;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != -1;
    }
}
