package com.company;

import java.util.ArrayList;
import java.util.List;


public abstract class mathCollege implements Questions{

    List<String> questions = new ArrayList<String>();

    public List<String> mathsQuestions(){
        questions.add("Solve for q.\n" +
                "–8q = 3 − 11q\n" + "q = " );
        questions.add("Solve for j.\n" +
                "20 + 5j = 2j − 16\n" +
                "j =");
        questions.add("Solve for s.\n" +
                "16 − 19s = –20s\n" +
                "s =");
        questions.add("Nolan's retirement party costs £35 ,plus an additional £1 for each guest he invites. What is the maximum number of guests there can be if Nolan can afford to spend a total of £45 on his retirement party?");
        questions.add("–3w + 1 = –4w + 14\n" + "w = \n");
        return questions;
    }

    public mathCollege(List<String> questions) {
        this.questions = questions;
    }

    public mathCollege() {
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "mathCollege{" +
                "questions=" + mathsQuestions() +
                '}';
    }

}
