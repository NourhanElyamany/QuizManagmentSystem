package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher extends Person {

    public ArrayList<String> generate(ArrayList<String> questions)
    {
        Collections.shuffle(questions);
        return questions;
    }

    public Teacher() {
    }

    public Teacher(String id, String username) {
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
