package org.example.service;

import org.example.config.HibernateUtil;
import org.example.dto.StudentDTO;
import org.example.entity.Grooup;
import org.example.entity.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StudentService {
    public Student createStudent(StudentDTO studentDTO) {
        Student student = new Student();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            student.setName(studentDTO.getName());
            student.setAge(studentDTO.getAge());
            student.setGroup(session.load(Grooup.class, studentDTO.getGroupId()));
            session.save(student);
            transaction.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return student;
    }

    public List<Student> listStudents(StudentDTO studentDTO) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query<Student> query = session.createQuery("FROM  Student where group.id =:paramId", Student.class);
        query.setParameter("paramId", studentDTO.getGroupId());
        List<Student> students = query.getResultList();
        return students;
    }

}
