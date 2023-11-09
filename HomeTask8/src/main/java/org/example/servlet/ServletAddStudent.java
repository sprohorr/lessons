package org.example.servlet;

import org.example.HibernateUtil;
import org.example.entity.GroupHW8;
import org.example.entity.StudentHW8;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletAddStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/add/addStudent.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentHW8 student = new StudentHW8();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            student.setName(req.getParameter("name"));
            student.setSurname(req.getParameter("surname"));
            student.setGroupHead(Boolean.parseBoolean(req.getParameter("groupHead")));
            GroupHW8 group = session.load(GroupHW8.class, Integer.parseInt(req.getParameter("groupId")));
            student.setGrooup(group);

            session.save(student);
            t.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }

        getServletContext().getRequestDispatcher("/WEB-INF/add/successfullyAddStudent.jsp").forward(req, resp);
    }

}