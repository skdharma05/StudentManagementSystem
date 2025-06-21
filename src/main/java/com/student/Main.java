package com.student;


import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();
        int choice=0;
        do{
            System.out.println("\n===== Student Management System======");
            System.out.println("1.Add Student");
            System.out.println("2.View All Students");
            System.out.println("3.Search Student by Roll Number ");
            System.out.println("4.Update Student Details");
            System.out.println("5.Delete Student");
            System.out.println("6.Exit");
            System.out.print("Your choice : ");
            choice = in.nextInt();

            switch(choice){
                // Add student.
                case 1 :
                    System.out.print("Enter the Name: ");
                    String name = in.next();
                    System.out.print("Enter  the Course: ");
                    String course = in.next();
                    System.out.print("Enter the Email ID : ");
                    String eMail =in.next();
                    System.out.print("Enter the Phone No : ");
                    long pNo = in.nextLong();
                    Student newStudent = new Student(name, course,eMail, pNo);
                    dao.saveStudent(newStudent);
                    System.out.println("Student adds successfully..!");
                    break;
                //view Student.
                case 2 :
                    List<Student>list = dao.getAllStudent();
                    for (Student s : list){
                        s.display();
                    }
                    break;
                //Search Student by RollNo..
                case 3 :
                    System.out.print("Enter the Roll Number to Search : ");
                    int rollNoSearch = in.nextInt();
                    Student found = dao.getStudentRollNo(rollNoSearch);
                        if(found != null){
                            found.display();
                        }else {
                        System.out.println("Student Not Found...!");
                    }
                    break;
                //update the Student from Records.
                case 4 :
                    System.out.print("Enter the Roll Number to Update : ");
                    int rollNoUpdate = in.nextInt();
                    Student toUpdate = dao.getStudentRollNo(rollNoUpdate);
                    if (toUpdate != null){
                        System.out.print("Enter the New Course : ");
                        String newCourse = in.next();
                        toUpdate.setCourse(newCourse);
                        System.out.print("Enter The Email Id : ");
                        String newEmail = in.next();
                        toUpdate.seteMail(newEmail);
                        System.out.print("Enter the Phone No : ");
                        long newPno = in.nextLong();
                        toUpdate.setpNo(newPno);
                        dao.updateStudent(toUpdate);
                        System.out.println("Student Details Updated..!");
                    }else {
                        System.out.println("Student Not Found..");
                    }
                    break;
                //Delete the student from Records.
                case 5 :
                    System.out.print("Enter the Roll Number to Delete :  ");
                    int rollNoDelete = in.nextInt();
                    dao.deleteStudent(rollNoDelete);
                    System.out.println("Student Remove Successfully...!");
                    break;
                //Exit ..
                case 6 :
                    System.out.println("Exiting... Thank You..!");
                    break;
                // Invalid
                default:
                    System.out.println("Invalid choice . please try again..");
            }
        }while(choice !=6);
        in.close();

    }
}