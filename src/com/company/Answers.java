package com.company;

import java.util.*;

public class Answers {
    ArrayList<String> answers = new ArrayList<>();

    public Answers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public Answers() {
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<String> mathAnswers(){
        answers.add("1");
        answers.add("-12");
        answers.add("-16");
        answers.add("-5");
        answers.add("14");
        return answers;
    }

    public ArrayList<String> sciAnswers(){
        answers.add("Deoxyribonucleic acid");
        answers.add("206");
        answers.add("Newton");
        answers.add("Diamond");
        answers.add("Nitrogen");
        answers.add("deoxyribonucleic acid");
        answers.add("206");
        answers.add("newton");
        answers.add("diamond");
        answers.add("nitrogen");
        return answers;
    }

}
