package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class sciCollege implements Questions {
    List<String> questions = new ArrayList<String>();

    public List<String> sciQuestions(){
        questions.add("What does DNA stand for?");
        questions.add("How many bones are in the human body?");
        questions.add("The concept of gravity was discovered by which famous physicist?\n");
        questions.add("What is the hardest natural substance on Earth?\n");
        questions.add("Which is the main gas that makes up the Earth’s atmosphere?\n");
        return questions;
    }

    public sciCollege(List<String> questions) {
        this.questions = questions;
    }

    public sciCollege() {
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "sciCollege{" +
                "questions=" + sciQuestions() +
                '}';
    }
}
