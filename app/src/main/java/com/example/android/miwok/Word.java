package com.example.android.miwok;

import android.os.ParcelUuid;
import android.widget.ImageView;

/**
 * Created by Hp on 15-09-2017.
 */

public class Word {
    private static final int NO_IMAGE_PROVIDED=-1;
    private String mDefaultTranslation;
    private String mMiwokTransalation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTransalation=miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioResourceId)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTransalation=miwokTranslation;
        mImageResourceId=imageResourceId;
        mAudioResourceId=audioResourceId;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTransalation()
    {
        return mMiwokTransalation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    public boolean hasImage()
    {
        return mImageResourceId!=NO_IMAGE_PROVIDED;

    }
    public int getAudioResourceId()
    {
        return mAudioResourceId;
    }
}
