package com.company;
import java.util.*;

public class Questions {
    List<String> questions = new ArrayList<String>();

    public void mathQuestions() {
        questions.add("Solve for q.\n" +
                "–8q = 3 − 11q\n" + "q = " );
        questions.add("Solve for d.\n" +

                "19d ≥ 20d + 3(14d + 1)\n" +
                "Write your answer with d first, followed by an inequality symbol.\n");
        questions.add("Solve for h.\n" +
                "–2|h| = –8\n" +
                "Write your answers as integers or as proper or improper fractions in simplest form.\n" +
                "h = \n" +
                "or h = ");
        questions.add("Nolan's retirement party costs " + "£35 " + ",plus an additional" + "£1" + " for each guest he invites." +
                "What is the maximum number of guests there can be if Nolan can afford to spend a total of " + "£45" + " on his retirement party?");
        questions.add("–3w + 1 = –4w + 14\n" + "w = ");
        return;
    }

    public Questions() {
    }

    public Questions(List<String> questions) {
        this.questions = questions;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "questions=" + questions.get(1) + questions.get(2) + questions.get(3) + questions.get(4) + questions.get(0) +
                '}';
    }
}
