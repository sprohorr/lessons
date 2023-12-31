package org.example.servlet;

import org.example.HibernateUtil;
import org.example.entity.GroupHW8;
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

public class ServletGroupHead extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/show/searchGroupHead.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<StudentHW8> query = session.createQuery("FROM  StudentHW8 WHERE groupHead = true AND grooup=:paramId", StudentHW8.class);
        query.setParameter("paramId", req.getParameter("id"));
        List<StudentHW8> groupHead = query.getResultList();
        req.setAttribute("groupHead", groupHead);

        Query<GroupHW8> query1 = session.createQuery("FROM GroupHW8 where id =:paramGrId", GroupHW8.class);
        query1.setParameter("paramGrId", req.getParameter("id"));
        List<GroupHW8> groupH = query1.getResultList();
        req.setAttribute("groupH", groupH);


        getServletContext().getRequestDispatcher("/WEB-INF/show/showGroupHead.jsp").forward(req, resp);
    }
}
