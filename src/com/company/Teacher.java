package com.company;

import java.util.Collections;
import java.util.List;

public class Teacher extends Person {

    public List<String> generate(List<String> questions)
    {
        Collections.shuffle(questions);
        return questions;
    }

    public Teacher() {
    }

    public Teacher(int id, String username) {
        super(id, username);
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                '}';
    }
}
