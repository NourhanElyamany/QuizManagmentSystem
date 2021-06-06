package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Teacher teach = new Teacher();
        sciCollege q = new sciCollege() {
            @Override
            public void mathQuestions() {

            }

            @Override
            public List<String> sciQuestions() {

                return null;
            }
        };
        System.out.println(teach.generate(q.getQuestions()));
    }
}



// college - > course - > chapter - > quiz
// student - > studying year - > semester
// grades - > percentage - > status "fail or success"
// student account - > username - > ID 