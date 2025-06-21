package com.student;

import jakarta.persistence.*;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "S_roll_no")
     private  int rollNo;
    @Column(name = "S_Name")
    private String name;
    @Column(name = "Course")
    private String course;
    private String eMail;
    public Student(){}

    public Student(String name, String course,String eMail){
        this.eMail=eMail;
        this.name = name;
        this.course = course;
    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void display () {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("email : " + eMail);
        System.out.println("-------------------------");
    }
}

