package com.example.abhishek_pc.interactivestory.model;



/**
 * Created by Abhishek-Pc on 24-10-2015.
 */
public class riddle1
{ private int mImageId;
    private String mText;
    private int  nextpage;
    private boolean mIsfinal = false;


    public riddle1(int imageId, String text, int Nextpage){
        mImageId=imageId;
        mText=text;
        nextpage = Nextpage;

    }
    public riddle1(int imageId, String text){
        mImageId=imageId;
        mText=text;
        mIsfinal = true;
    }


    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }


    public int getnextpage(){
        return  nextpage;
    }

    public boolean isfinal() {
        return mIsfinal;
    }

    public void setIsfinal(boolean isfinal) {
        mIsfinal = isfinal;
    }

    public void setmImageId(int id){
        mImageId=id;

    }
}
