package com.company;

public class College {
    String collegeName;
    int semester;

    public College(String collegeName, int semester) {
        this.collegeName = collegeName;
        this.semester = semester;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public College() {
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", semester=" + semester +
                '}';
    }
}
