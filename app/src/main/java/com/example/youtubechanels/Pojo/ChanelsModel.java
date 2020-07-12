package com.example.youtubechanels.Pojo;

public class ChanelsModel {
    String mName  ;
int mImage;
    public ChanelsModel(String mName,  int mImage) {
        this.mName = mName;

        this.mImage = mImage;
    }

    public ChanelsModel() {
    }

    public String getmName() {
        return mName;
    }



    public int getmImage() {
        return mImage;
    }
}
