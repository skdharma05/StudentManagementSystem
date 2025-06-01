
package StudentManagementSystem;

public class Student {
    int rollNo;
    String name;
    String course;

    public Student(int rollNo,String name,String course){
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    public void display(){
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name : "+ name);
        System.out.println("Course : "+ course);
        System.out.println("-------------------------");
    }

    
}
