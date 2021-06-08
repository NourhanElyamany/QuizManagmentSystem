package com.company;

public class college {
    String name;
    int semester;

    public college(String name, int semester) {
        this.name = name;
        this.semester = semester;
    }

    public college() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String message(){
       return "you are truly " ;
    }
}
