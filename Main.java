package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new  ArrayList<>();
    Scanner in = new Scanner(System.in);
    int choice=0;
    do{
        System.out.println("\n===== Student Management System======");
        System.out.println("1.Add Student");
        System.out.println("2.View Students");
        System.out.println("3.Search Student by Roll Number ");
        System.out.println("4.Delete Student");
        System.out.println("5.Exit");
        System.out.println("Your choice ..");
        choice = in.nextInt();

        switch(choice){
            // Add student..
            case 1 : 
            System.out.print("Enter the Roll No: ");
            int roll = in.nextInt();
            System.out.print("Enter the Name: ");
            String name = in.next();
            System.out.print(" Enter  the Coures: ");
            String course = in.next();
            Student s = new Student(roll, name, course);
            students.add(s);
            System.out.println("Student adds successfully..!");
            break;
            //view Student..
            case 2 :
            if (students.isEmpty()){
                System.out.println("No student record found..!");
            }else{
                for(Student st : students){
                    st.display();
                }
            }
            break;
            //Search Student by RollNo..
            case 3 :
            System.out.println("Enter the Roll Number to Search : ");
            int Search = in.nextInt();
            boolean found = false;
            for(Student st : students){
                if(st.rollNo == Search){
                st.display();
                found = true;
                break;
                }
            }
            if (!found){
                System.out.println("Student Not Found...!");
            }
            break;
            //Delete the Student from Record..
            case 4 :
            System.out.println("Enter the Roll Number to Delete :  ");
            int deleteRoll = in.nextInt();
            boolean removed = false;
            for(int i =0;i<students.size();i++){
                if (students.get(i).rollNo == deleteRoll){
                    students.remove(i);
                    System.out.println("Student Remove Successfully...!");
                    removed = true;
                    break;
                }
            }
            if(!removed){
                System.out.println("Student Not Found..!");

            }
            break;
            //Exit ..
            case 5 :
            System.out.println("Exist Program..");
            break;
            // Invalid 
            default:
            System.out.println("Invalid choice . please try again..");
        }
    }while(choice !=5);
    in.close();

    }
        
}
    
