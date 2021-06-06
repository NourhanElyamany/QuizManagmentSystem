package com.company;

public class gradingSystem {
    final int fullPoints = 3;
    float percentage;
    String letter;

    public float calculate(int points){
        percentage = 100 * ( (float)points / fullPoints );
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
