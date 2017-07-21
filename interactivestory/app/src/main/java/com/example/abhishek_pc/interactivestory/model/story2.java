package com.example.abhishek_pc.interactivestory.model;

import com.example.abhishek_pc.interactivestory.R;

/**
 * Created by Abhishek-Pc on 22-09-2015.
 */
public class story2 {private ststory1page[] mpages;
    public story2(){
        mpages = new ststory1page[14];

        mpages[0] = new ststory1page(
                R.mipmap.page200,
                "Welcome aboard Captain %1$s! You are in a space shuttle with three other astronauts. Your mission is to retrieve asteroid debris from a recent \n" +
                        "collision. Suddenly, you hear a knock on the cabin door. You see someone floating outside the west window, but wait a minute, Isn't your entire crew" +
                        "in the shuttle itself.",
                new story1choice("Open the door to the stranger", 1),
                new story1choice("Move crew into a secluded cabin", 2));

        mpages[1] = new ststory1page(
                R.mipmap.page201,
                "The 5th astronaut enters the shuttle and says he is Harry, but Harry is sitting right next to you.\n" +
                        "As the captain, they look to you to make the decision.",
                new story1choice("Tie both the men to find the imposter", 3),
                new story1choice("Begin to inspect  the new astronaut", 4));

        mpages[2] = new ststory1page(
                R.mipmap.page202,
                "You notice the knocks begin to get louder. A stray asteroid piece hits the window nearby, cracking it. The imposter " +
                        "begins to hit the window and breaks in.",
                new story1choice("Eject and travel back to Earth safely with your crew", 8),
                new story1choice("Question the imposter from the safety of the secluded cabin", 9));

        mpages[3] = new ststory1page(
                R.mipmap.page203,
                "You begin to ask questions to both men to find the imposter, very soon one of them can't keep up with questions. \n" +
                        "The imposter tears open his restraints and reveals his alien form, devouring harry who was helplessly tied up.",
                new story1choice("Move crew to the secluded cabin", 7),
                new story1choice("Fight the alien", 6));

        mpages[4] = new ststory1page(
                R.mipmap.page204,
                " You begin to check the astronaut only to find strange green like substances oozing from his back",
                new story1choice("You realize the threat and decide to take him outside", 5),
                new story1choice("Move to secluded cabin", 2));

        mpages[5] = new ststory1page(
                R.mipmap.page205,
                "You talk to the imposter and he points at the debris, you see a battered yet functioning UFO. A beam now spreads\n" +
                        "towards you and pulls you in. The last thing you see is the alien move towards your crew.");

        mpages[6] = new ststory1page(
                R.mipmap.page206,
                "Your brave attempt at fighting the alien leads you to being devoured as well, what happened to your crew, you will never know.");
        mpages[7] = new ststory1page(
                R.mipmap.page207,
                "You move the crew to the secluded cabin and blast off towards earth. you are ridden with guilt for tying \n" +
                        "up Harry, now you have to answer his wife when you get back on Earth. The ride back is a silent one");
        mpages[8] = new ststory1page(
                R.mipmap.page208,
                "You continue to lead your life not knowing what truly happened ");
        mpages[9] = new ststory1page(
                R.mipmap.page209,
                "The imposter tries to convince you that he is Harry. Worried for your safety you have 2 options.",
                new story1choice("You realize the threat and decide to take him outside", 10),
                new story1choice("You go out to confront the imposter", 11));
        mpages[10] = new ststory1page(
                R.mipmap.page210,
                "Harry is taken by the imposter and you notice a UFO take them both away. " +
                        "You move the crew to the secluded cabin and blast off towards Earth. you are ridden with guilt for tying up Harry,\n" +
                        " now you have to answer his wife when you get back on Earth. The ride back is a silent one");
        mpages[11] = new ststory1page(
                R.mipmap.page211,
                " The man convinces you that he is Harry, you now have 2 options",
                new story1choice("The thought that there could be more aliens among the crew other than Harry, you decide it is on to you to save humanity!\n" +
                        "...by destroying the entire ship", 12),
                new story1choice("You take Harry from inside the cabin and throw him out of the ship", 13));
        mpages[12] = new ststory1page(
                R.mipmap.page212,
                "You are engulfed by flames visible all the way from your home down on Earth.");
        mpages[13] = new ststory1page(
                R.mipmap.page213,
                "A beam from a UFO sucks in Harry and now you realize that the imposter is not one you just sent out.\n" +
                        "Due to your mistake the alien gets in the ship and the last thing you see is its fangs reaching out for your neck.");


    }
    public ststory1page getPage(int pageNumber) {
        return mpages[pageNumber];
    }
}
