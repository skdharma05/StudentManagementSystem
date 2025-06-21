package com.student;

import com.mysql.cj.x.protobuf.MysqlxExpect;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO {
    public void saveStudent(Student student){
        Transaction tx =null;
        try(Session session = HibernateUtil.getFactory().openSession()) {
            tx = session.beginTransaction();
            session.persist(student);
            tx.commit();
            session.close();
        }catch (Exception e){
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }

    }
    public List<Student> getAllStudent(){
        try (Session session = HibernateUtil.getFactory().openSession()) {
            return session.createQuery("from Student", Student.class).list();
        }
    }
    public Student getStudentRollNo(int rollNo){
        try (Session session = HibernateUtil.getFactory().openSession()) {
            return session.find(Student.class, rollNo);
        }
    }
    public void updateStudent(Student student){
        Transaction tx = null;
        try (Session session = HibernateUtil.getFactory().openSession()) {
            tx = session.beginTransaction();
            session.merge(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

    public void deleteStudent(int rollNo){
        Transaction tx = null;
        try (Session session = HibernateUtil.getFactory().openSession()) {
            tx = session.beginTransaction();
            Student student = session.find(Student.class, rollNo);
            if (student != null) {
                session.remove(student);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}