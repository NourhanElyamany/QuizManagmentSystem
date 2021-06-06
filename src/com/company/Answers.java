package com.company;

import java.util.*;

public class Answers {
    List<String> answers = new ArrayList<>();

    public Answers(List<String> answers) {
        this.answers = answers;
    }

    public Answers() {
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public List<String> mathAnswers(){
        answers.add("1");
        answers.add("-12");
        answers.add("-16");
        answers.add("10");
        answers.add("14");
        return answers;
    }

    public List<String> sciAnswers(){
        answers.add("Deoxyribonucleic acid");
        answers.add("206");
        answers.add("Newton");
        answers.add("Diamond");
        answers.add("Nitrogen");
        return answers;
    }

}
