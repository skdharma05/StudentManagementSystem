package com.student;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO {
    public void saveStudent(Student student){
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.persist(student);
        tx.commit();
        session.close();
    }
    public List<Student> getAllStudent(){
        Session session = HibernateUtil.getFactory().openSession();
        List<Student>students = session.createQuery("From Student", Student.class).list();
        session.close();
        return students;
    }
    public Student getStudentRollNo(int rollNo){
        Session session = HibernateUtil.getFactory().openSession();
        Student student = session.find(Student.class,rollNo);
        session.close();
        return student;
    }
    public void UpdateStudent(Student student){
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.merge(student);
        tx.commit();
        session.close();
    }
    public void deleteStudent(int rollNo){
        Session session = HibernateUtil.getFactory().openSession();
        Transaction tx = session.beginTransaction();
        Student student = session.find(Student.class , rollNo);
        if(student != null){
            session.remove(student);
        }
        tx.commit();
        session.close();

    }
}