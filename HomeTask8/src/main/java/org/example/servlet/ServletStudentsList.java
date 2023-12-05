package org.example.servlet;

import org.example.HibernateUtil;
import org.example.entity.StudentHW8;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ServletStudentsList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/show/searchStudents.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<StudentHW8> query = session.createQuery(" FROM StudentHW8 where grooup =:paramNumberGroup ", StudentHW8.class);
        query.setParameter("paramNumberGroup", req.getParameter("numberGroup"));
        List<StudentHW8> students = query.getResultList();
        req.setAttribute("students", students);

        getServletContext().getRequestDispatcher("/WEB-INF/show/studentsList.jsp").forward(req, resp);
    }
}
