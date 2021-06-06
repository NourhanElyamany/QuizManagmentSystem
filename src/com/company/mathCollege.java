package com.company;

import java.util.ArrayList;
import java.util.List;
import java.io.*;


public abstract class mathCollege implements Questions{

    List<String> questions = new ArrayList<String>();

    public void mathsQuestions(){
        questions.add("Solve for q.\n" +
                "–8q = 3 − 11q\n" + "q = " );
        questions.add("Solve for d.\n" +

                "19d ≥ 20d + 3(14d + 1)\n" +
                "Write your answer with d first, followed by an inequality symbol.\n");
        questions.add("Solve for h.\n" +
                "–2|h| = –8\n" +
                "Write your answers as integers or as proper or improper fractions in simplest form.\n" +
                "h = \n" +
                "or h = \n");
        questions.add("Nolan's retirement party costs " + "£35 " + ",plus an additional" + "£1" + " for each guest he invites." +
                "What is the maximum number of guests there can be if Nolan can afford to spend a total of " + "£45" + " on his retirement party?\n");
        questions.add("–3w + 1 = –4w + 14\n" + "w = \n");
        return;
    }

}
