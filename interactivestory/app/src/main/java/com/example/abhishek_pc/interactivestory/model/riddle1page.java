package com.example.abhishek_pc.interactivestory.model;


import com.example.abhishek_pc.interactivestory.R;

public class riddle1page
{
    private riddle1[] mpages;
    private int mNextPage;

    public riddle1page(){

        mpages = new riddle1[7];


        mpages[0] = new riddle1(
                R.mipmap.r6,
                "Gotham City faces crisis as mob wars and supervillains wreak havoc unchecked on the streets. One rainy night you find Batman injured and bleeding on your rooftop, you silently approach him but it seems he sensed your presence. \"" +
                        "Who are you?\", he asks as you draw closer. \"My name is %1$s, what happened to you? Are you alright?\". \"You, i know you," +
                        " you were the only person who could solve the Riddler's riddles and escape when he took hostages inside Wayne Tower a year ago. I may require your assisstance to rescue Commissioner Gordon from his clutches. He is vital to resotring peace to Gotham and getting the mob leaders under control.......Are you willing to risk your life to save Gotham?\" You take a deep breath and look down and the injured hero asking for help in front of you, and then suddenly all the hesitation dissappears from your mind. \"Yes. yes i am\". \"Just what i wanted to hear :D\".\n" +
                        "\n" +
                        "You reach The Riddler's hideout and are immediately presented with your first problem.\n" +
                        "--> \"I’m tall when I’m young and I’m short when I’m old. What am I?",1);


        mpages[1] = new riddle1(
                R.mipmap.r5,
                "Aha! You have answered the first riddle correctly, you are now one step closer to rescuing the soon to be dead Commissioner Gordon.\"\n" +
                        "\t\t--> \"\nIf I have it, I don’t share it. If I share it, I don’t have it. What is it?.",2
        );


        mpages[2] = new riddle1(
                R.mipmap.r3,
                "Correct! Just one more riddle until the brave commissioner can return home.\"\n" +
                        "\t\t\t\t\t--> \"You walk into a room with a match, a karosene lamp, a candle, and a fireplace. Which do you light first?.",3);


        mpages[3] = new riddle1(
                R.mipmap.r1,
                "only one step away from rescuing that bloody gordon.\n" +
                        "\t\t\t\t\t\t      ---> \"If you look at the number on my face you won't find thirteen anyplace..",6);


        mpages[4] = new riddle1(
                R.mipmap.r4,
                "Wrong answer. Maybe that was a little too hard for you. Fine, you have one last chance to save him\"\n" +
                        "\t\t\t\t\t--> \"If I drink, I die. If i eat, I am fine. What am I?",5);


        mpages[5] = new riddle1(
                R.mipmap.r2,
                "Wrong answer! And that's the end of the line for the commissioner. Batman should have come here himself..");

        mpages[6] = new riddle1(
                R.mipmap.r7,
                "Congratulations! You have successfully rescued Commissioner Gordon and given Gotham a ray of hope");


    }
    public riddle1 getPage(String manswer, int currentpage,int nextPager ) {
        switch (currentpage){
            case 0 : if (manswer.equals("candle")) {
                mNextPage = nextPager;
            }
            else
                mNextPage=5;
                break;
            case 1 : if (manswer.equals("secret")) {
                mNextPage = nextPager;
            }
            else
                mNextPage=4;
                break;
            case 2 : if (manswer.equals("match")) {
                mNextPage = nextPager;
            }
            else
                mNextPage=5;
                break;
            case 3 : if (manswer.equals("clock")) {
                mNextPage = nextPager;
            }
            else
                mNextPage=5;
                break;
            case 4 : if (manswer.equals("fire")) {
                mNextPage = 3;
            }
            else
                mNextPage=5;
                break;
            case 5 : if (manswer.equals("right5")) {
                mNextPage = nextPager;
            }
            else
                mNextPage=5;
                break;
        }
        return mpages[mNextPage];
    }


    public riddle1 getPage(int pagenumber) {
        return mpages[pagenumber];
    }
}


