package com.example.abhishek_pc.interactivestory.model;


public class ststory1page {
    private int mImageId;
    private String mText;
    private story1choice mchoice1;
    private story1choice mchoice2;
    private boolean mIsfinal = false;
    public ststory1page(int imageId, String text, story1choice choice1, story1choice choice2){
        mImageId=imageId;
        mText=text;
        mchoice1=choice1;
        mchoice2=choice2;

    }
    public ststory1page(int imageId, String text){
        mImageId=imageId;
        mText=text;
        mchoice1=null;
        mchoice2=null;
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

    public story1choice getMchoice1() {
        return mchoice1;
    }

    public void setMchoice1(story1choice mchoice1) {
        this.mchoice1 = mchoice1;
    }

    public story1choice getMchoice2() {
        return mchoice2;
    }

    public void setMchoice2(story1choice mchoice2) {
        this.mchoice2 = mchoice2;
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
