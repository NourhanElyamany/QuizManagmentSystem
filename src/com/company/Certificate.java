package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Certificate extends JFrame {
    Person person = new Person();
    Quiz quiz = new Quiz();
    CourseSelector course = new CourseSelector();
    sciCollege sci = new sciCollege();
    mathCollege math = new mathCollege();
    Certificate(){
        JPanel panel = new JPanel();
        this.setTitle("Quiz"); // sets title for the this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit out application
        this.setSize(600, 600); // set the this size
        this.setResizable(false);
        Border border = BorderFactory.createLineBorder(Color.decode("#ffd482"), 3);

        JLabel title = new JLabel("Your Certificate");
        title.setBounds(200,50,200,100);
        title.setFont(new Font("Optima",Font.BOLD,25));
        title.setForeground(Color.decode("#fe5f55"));

        JLabel name = new JLabel(person.getUsername());
        JLabel id = new JLabel(person.getId());
        JLabel college = new JLabel(course.courseChosen);
        JLabel grade = new JLabel(quiz.letter);
        JLabel message = new JLabel();
        JLabel percentage = new JLabel(String.valueOf(quiz.percent + "%"));
        name.setBounds(170,100,200,100);
        name.setFont(new Font("Optima",Font.BOLD,20));
        name.setForeground(Color.decode("#B8D8D8"));

        id.setBounds(170,150,150,100);
        id.setFont(new Font("Optima",Font.BOLD,20));
        id.setForeground(Color.decode("#B8D8D8"));

        college.setBounds(170,200,200,100);
        college.setFont(new Font("Optima",Font.BOLD,20));
        college.setForeground(Color.decode("#B8D8D8"));

        grade.setBounds(170,250,200,100);
        grade.setFont(new Font("Optima",Font.BOLD,20));
        grade.setForeground(Color.decode("#B8D8D8"));

        percentage.setBounds(170,300,200,100);
        percentage.setFont(new Font("Optima",Font.BOLD,20));
        percentage.setForeground(Color.decode("#B8D8D8"));

        message.setBounds(170,400,500,100);
        message.setFont(new Font("Optima",Font.BOLD,30));
        message.setForeground(Color.decode("#B8D8D8"));
        if(course.courseChosen=="Maths"){
            message.setText(math.message());
        }
        else if(course.courseChosen=="Science"){
            message.setText(sci.message());

        }


        JLabel nameLabel = new JLabel("Name: ");
        JLabel idLabel = new JLabel("ID: ");
        JLabel collegeLabel = new JLabel("College: ");
        JLabel gradeLabel = new JLabel("Grade: ");
        JLabel percentageLabel = new JLabel("Percentage: ");


        nameLabel.setBounds(60,100,200,100);
        nameLabel.setFont(new Font("Optima",Font.ITALIC,20));
        nameLabel.setForeground(Color.decode("#fe5f55"));

        idLabel.setBounds(60,150,200,100);
        idLabel.setFont(new Font("Optima",Font.ITALIC,20));
        idLabel.setForeground(Color.decode("#fe5f55"));

        collegeLabel.setBounds(60,200,200,100);
        collegeLabel.setFont(new Font("Optima",Font.ITALIC,20));
        collegeLabel.setForeground(Color.decode("#fe5f55"));

        gradeLabel.setBounds(60,250,200,100);
        gradeLabel.setFont(new Font("Optima",Font.ITALIC,20));
        gradeLabel.setForeground(Color.decode("#fe5f55"));

        percentageLabel.setBounds(60,300,200,100);
        percentageLabel.setFont(new Font("Optima",Font.ITALIC,20));
        percentageLabel.setForeground(Color.decode("#fe5f55"));





        panel.setBackground(Color.decode("#4f6367"));
        panel.add(title);
        panel.setLayout(null);
        panel.add(name);
        panel.add(id);
        panel.add(college);
        panel.add(grade);
        panel.add(percentage);
        panel.add(nameLabel);
        panel.add(idLabel);
        panel.add(collegeLabel);
        panel.add(gradeLabel);
        panel.add(percentageLabel);
        panel.add(message);



        this.add(panel);
        this.setVisible(true);
    }


}
