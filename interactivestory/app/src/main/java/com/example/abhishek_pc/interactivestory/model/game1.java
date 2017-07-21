package com.example.abhishek_pc.interactivestory.model;

import com.example.abhishek_pc.interactivestory.R;

/**
 * Created by Abhishek-Pc on 31-08-2015.
 */
public class game1 {
    private ststory1page[] mpages;
    public game1(){
        mpages = new ststory1page[8];

        mpages[0] = new ststory1page(
                R.mipmap.p0,
                "39-9-81-45-90-27-72-18\n" +
                        "\n" +
                        "        Hey %1$s, sort this array using SELECTION SORT.",
                new story1choice("9-39-81-45-90-27-72-18 ", 1),
                new story1choice("9-81-39-45-90-27-72-18", 7));

        mpages[1] = new ststory1page(
                R.mipmap.p1,
                "Choose the the correct option for the next pass for the sort function .",
                new story1choice("9-18-81-45-90-27-72-39", 2),
                new story1choice("39-9-81-45-90-27-72-18", 7));

        mpages[2] = new ststory1page(
                R.mipmap.p2,
                "Choose the the correct option for the next pass for the sort function .",
                new story1choice("39-9-81-45-90-27-72-18", 7),
                new story1choice("C 9-18-27-45-90-81-72-39", 3));

        mpages[3] = new ststory1page(
                R.mipmap.p3,
                "Choose the the correct option for the next pass for the sort function .",
                new story1choice("39-9-81-45-90-27-72-18", 7),
                new story1choice("9-18-27-39-90-81-72-45", 4));

        mpages[4] = new ststory1page(
                R.mipmap.p4,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9-18-27-39-45-81-72-90 ", 5),
                new story1choice("9-81-39-45-90-27-72-18", 7));

        mpages[5] = new ststory1page(
                R.mipmap.p5,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9-18-27-39-45-72-81-90 ", 6),
                new story1choice("9-18-27-39-45-81-72-90 ", 7));
        mpages[6] = new ststory1page(
                R.mipmap.happy,
                "Well done you have completed the task");
        mpages[7] = new ststory1page(
                R.mipmap.sad1,
                "Sorry incorrect choice try again ");


    }
    public ststory1page getPage(int pageNumber) {
        return mpages[pageNumber];
    }
}
