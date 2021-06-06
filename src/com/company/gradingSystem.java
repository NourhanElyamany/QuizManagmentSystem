package com.company;

public class gradingSystem {
    final int fullPoints = 5;
    float percentage;
    String letter;

    public float calculate(int points){
        percentage = points/fullPoints * 100;
        return percentage;
    }
    public String grade(float percentage){

        if (percentage>=80)
            letter = "A" ;
        else if (percentage>=60)
            letter = "B" ;
        else if (percentage>=40)
            letter = "C" ;
        else letter = "D" ;

        return letter;
    }
}
