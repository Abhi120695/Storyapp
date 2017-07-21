package com.example.abhishek_pc.interactivestory.model;

/**
 * Created by Abhishek-Pc on 31-08-2015.
 */
public class story1choice {
private String mText;
    private int mNextPage;
    public story1choice(String text , int nextPage){
        mText=text;
        mNextPage=nextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
