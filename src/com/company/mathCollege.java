package com.company;

import java.util.ArrayList;
import java.util.List;


public class mathCollege extends college implements Questions  {

    ArrayList<String> questions = new ArrayList<String>();

    public mathCollege() {
        this.questions = questions;
    }

    public mathCollege(ArrayList<String> questions) {
        this.questions = questions;
    }

    public ArrayList<String> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<String> questions) {
        this.questions = questions;
    }


    public ArrayList<String> createQ() {
        questions.add("Solve for q.\n –8q = 3 − 11q, q = ");
        questions.add("Solve for j.\n 20 + 5j = 2j − 16, j =");
        questions.add("Solve for s.\n 16 − 19s = –20s, s =");
        questions.add("–8q = –10q − 10 , q = ");
        questions.add("–3w + 1 = –4w + 14, w = \n");
        return questions;
    }


    @Override
    public String message() {
        return super.message() + "a mathematician";
    }
}
