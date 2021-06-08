package com.company;

public class gradingSystem {
    final int fullPoints = 3;
    static float percentage;
    static String letter;

    public float calculate(int points){
        percentage = 100 * ( (float)points / fullPoints );
        return percentage;
    }
    public String grade(float percentage){


        return letter;
    }

    public gradingSystem() {

    }

    public int getFullPoints() {
        return fullPoints;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getLetter() {
        if (this.percentage>=80)
            letter = "A" ;
        else if (this.percentage>=60)
            letter = "B" ;
        else if (this.percentage>=40)
            letter = "C" ;
        else letter = "D" ;
        return letter;

    }

    public void setLetter() {
        this.letter = letter;
    }


}
