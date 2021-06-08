package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Quiz extends JFrame implements ActionListener {

    sciCollege science = new sciCollege();
    mathCollege math = new mathCollege();
    CourseSelector course = new CourseSelector();
    ArrayList<String> q = new ArrayList<>();
    int points;
    Teacher teach = new Teacher();
    JTextField Ans1;
    JTextField Ans2;
    JTextField Ans3;
    Answers answer = new Answers();
    gradingSystem grade = new gradingSystem();
    JButton submit;
    JLabel Q1;
    JLabel Q2;
    JLabel Q3;

    static String letter;
    static float percent;


    Quiz() {
        JPanel panel = new JPanel();
        this.setTitle("Quiz"); // sets title for the this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit out application
        this.setSize(600, 600); // set the this size
        this.setResizable(false);
        Border border = BorderFactory.createLineBorder(Color.decode("#ffd482"), 3);
        Q1 = new JLabel();
        Q2 = new JLabel();
        Q3 = new JLabel();
        Q1.setBounds(50, 90, 600, 100);
        Q2.setBounds(50, 190, 600, 100);
        Q3.setBounds(50, 290, 600, 100);
        Q1.setForeground(Color.decode("#B8D8D8"));
        Q1.setFont(new Font("Optima", Font.ITALIC,19));
        Q2.setForeground(Color.decode("#B8D8D8"));
        Q2.setFont(new Font("Optima", Font.ITALIC,19));
        Q3.setForeground(Color.decode("#B8D8D8"));
        Q3.setFont(new Font("Optima", Font.ITALIC,19));

        Ans1 = new JTextField();
        Ans2 = new JTextField();
        Ans3 = new JTextField();
        Ans1.setBounds(120, 150, 200, 30);
        Ans2.setBounds(120, 250, 200, 30);
        Ans3.setBounds(120, 350, 200, 30);

        JLabel label1 = new JLabel("Answer: ");
        JLabel label2 = new JLabel("Answer: ");
        JLabel label3 = new JLabel("Answer: ");
        label1.setBounds(50,150,100,30);
        label2.setBounds(50,250,100,30);
        label3.setBounds(50,350,100,30);
        label1.setForeground(Color.decode("#fe5f55"));
        label1.setFont(new Font("Optima", Font.BOLD,15));
        label2.setForeground(Color.decode("#fe5f55"));
        label2.setFont(new Font("Optima", Font.BOLD,15));
        label3.setForeground(Color.decode("#fe5f55"));
        label3.setFont(new Font("Optima", Font.BOLD,15));

        submit = new JButton("submit");
        submit.setBounds(200, 430,60, 50);
        submit.setForeground(Color.decode("#7a9e9f"));
        submit.addActionListener(this);





        if (course.courseChosen == "Maths") {
            points = 0;
            q = teach.generate(math.createQ());
            Q1.setText(q.get(0));
            Q2.setText(q.get(1));
            Q3.setText(q.get(2));

        }
        if (course.courseChosen == "Science") {
            points = 0;
            q = teach.generate(science.createQ());
            Q1.setText(q.get(0));
            Q2.setText(q.get(1));
            Q3.setText(q.get(2));

        }

        panel.setBorder(border);
        panel.add(Q1);
        panel.add(Q2);
        panel.add(Q3);
        panel.add(Ans1);
        panel.add(Ans2);
        panel.add(Ans3);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(submit);

        panel.setBackground(Color.decode("#4f6367"));
        panel.setLayout(null);


        this.add(panel);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit){
            if (course.courseChosen == "Maths")
            {
                if (answer.mathAnswers().contains(Ans1.getText()))
                    points++;
                if (answer.mathAnswers().contains(Ans2.getText()))
                    points++;
                if (answer.mathAnswers().contains(Ans3.getText()))
                    points++;
            }
            if (course.courseChosen =="Science")
            {
                if (answer.sciAnswers().contains(Ans1.getText()))
                    points++;
                if (answer.sciAnswers().contains(Ans2.getText()))
                    points++;
                if (answer.sciAnswers().contains(Ans3.getText()))
                    points++;
            }

            grade.setPercentage(grade.calculate(points));
            letter = grade.getLetter();
            percent = grade.getPercentage();
            Certificate frame4 = new Certificate();


            this.setVisible(false);
            frame4.setVisible(true);
        }



    }
}