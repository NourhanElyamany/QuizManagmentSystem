package com.company;

public class Student extends Person{
    int semester;
    String grade;

    public Student(int id, String username, int semester, String grade) {
        super(id, username);
        this.semester = semester;
        this.grade = grade;
    }

    public Student(int semester, String grade) {
        this.semester = semester;
        this.grade = grade;
    }

    public Student() {
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", username='" + username + '\'' +
                ", semester=" + semester +
                ", grade='" + grade + '\'' +
                '}';
    }
}
