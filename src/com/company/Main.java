package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        mathCollege math = new mathCollege();
        sciCollege science = new sciCollege();
        ArrayList<String> q = new ArrayList<>();
        gradingSystem grade = new gradingSystem();
        Teacher teach = new Teacher();
        Answers answer = new Answers();
        Person p = new Person();
        int points;
        Scanner in = new Scanner(System.in);


        System.out.println(" which subject you want to get exam for? \n 1-Maths \n 2-Science");
        int input= in.nextInt();
        if (input == 1){
            points = 0;
            q = teach.generate(math.mathsQuestions());
            for (int i = 0 ; i<3 ; i++){
                System.out.println(q.get(i));
                String ans = in.next();
                if (answer.mathAnswers().contains(ans)){
                    points++;
                }
            }
            float percent = grade.calculate(points);
            System.out.println(" you got " + grade.grade(percent) + " in this quiz.");
        }
        if (input == 2){
            points = 0;
            q = teach.generate(science.sciQuestions());
            for (int i = 0 ; i <3 ; i++){
                System.out.println(q.get(i));
                String ans = in.next();
                if(answer.sciAnswers().contains(ans)){
                    points++;
                    System.out.println(points);
                }
            }
            float percent = grade.calculate(points);
            System.out.println(percent);
            System.out.println(" you got " + grade.grade(percent) + " in this quiz.");
        }

    }
}




// college - > course - > chapter - > quiz
// student - > studying year - > semester
// grades - > percentage - > status "fail or success"
// student account - > username - > ID 