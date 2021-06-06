package com.company;

import java.util.Collections;
import java.util.List;

public class Teacher {
    mathCollege generate = new mathCollege() {
        @Override
        public void mathQuestions() {

        }
    };
    public List generate(List<String> questions)
    {
        Collections.shuffle(questions);
        return questions;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "generate=" + generate +
                '}';
    }
}
