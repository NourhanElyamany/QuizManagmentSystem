package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Teacher teach = new Teacher();
        mathCollege obj =  new mathCollege() {
            @Override
            public void mathQuestions() {

            };
        };
        System.out.println(obj.toString());
        System.out.println(teach.generate(obj.getQuestions()));
        };
    };


// college - > course - > chapter - > quiz
// student - > studying year - > semester
// grades - > percentage - > status "fail or success"
// student account - > username - > ID 