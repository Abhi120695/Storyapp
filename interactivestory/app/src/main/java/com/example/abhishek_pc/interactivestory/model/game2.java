package com.example.abhishek_pc.interactivestory.model;

import com.example.abhishek_pc.interactivestory.R;

/**
 * Created by Abhishek-Pc on 31-08-2015.
 */
public class game2 {
    private ststory1page[] mpages;
    public game2(){
        mpages = new ststory1page[12];

        mpages[0] = new ststory1page(
                R.mipmap.p00,
                "39-9-45-63-18-108-54-72-36\n" +
                        "\n" +
                        "        Hey %1$s, sort this array using INSERTION SORT",
                new story1choice("9-39-45-63-18-108-54-72-36 ", 1),
                new story1choice("9-39-18-63-72-108-54-45-36", 11));

        mpages[1] = new ststory1page(
                R.mipmap.p01,
                "Choose the the correct option for the next pass for the sort function .",
                new story1choice("9-39-45-63-18-108-54-72-36", 2),
                new story1choice("9-39-18-63-45-108-54-72-36", 11));

        mpages[2] = new ststory1page(
                R.mipmap.p02,
                "Choose the the correct option for the next pass for the sort function .",
                new story1choice("9-39-18-63-45-108-54-72-36", 11),
                new story1choice("9-39-45-63-18-108-54-72-36", 3));

        mpages[3] = new ststory1page(
                R.mipmap.p03,
                "Choose the the correct option for the next pass for the sort function .",
                new story1choice("9-39-18-63-45-108-54-72-36", 11),
                new story1choice("9-18-39-45-63-81-108-54-72-36", 4));

        mpages[4] = new ststory1page(
                R.mipmap.p04,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9-18-39-45-63-81-108-54-72-36  ", 5),
                new story1choice("9-18-36-39-45-54-63-72-81-108", 11));

        mpages[5] = new ststory1page(
                R.mipmap.p05,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9-18-39-45-63-81-108-54-72-36 ", 6),
                new story1choice("9-18-36-39-45-54-63-72-81-108 ", 11));
        mpages[6] = new ststory1page(
                R.mipmap.p06,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9-18-39-45-63-81-108-54-72-36 ", 7),
                new story1choice("9--18-36-39-45-54-63-72-81-108 ", 11));
        mpages[7] = new ststory1page(
                R.mipmap.p07,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9-18-39-45-54-63-81-108-72-36 ", 8),
                new story1choice("9--18-36-39-45-54-63-72-81-108 ", 11));
        mpages[8] = new ststory1page(
                R.mipmap.p08,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice("9 -18-36-39-45-54-63-72-81-108 ", 9),
                new story1choice("9-18-39-45-63-81-108-54-72-36 ", 11));
        mpages[9] = new ststory1page(
                R.mipmap.p09,
                " Choose the the correct option for the next pass for the sort function ",
                new story1choice(" 9-18-36-39-45-54-63-72-81-108 ", 10),
                new story1choice("9-18-39-45-63-81-108-54-72-36 ", 11));
        mpages[10] = new ststory1page(
                R.mipmap.happy,
                "Well done you have completed the task");
        mpages[11] = new ststory1page(
                R.mipmap.sad1,
                "Sorry incorrect choice try again ");


    }
    public ststory1page getPage(int pageNumber) {
        return mpages[pageNumber];
    }
}
