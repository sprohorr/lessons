package org.example.servlet;

import org.example.HibernateUtil;
import org.example.entity.GroupHW8;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ServletShowGroup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        Query<GroupHW8> query = session.createQuery("FROM GroupHW8 ", GroupHW8.class);
        List<GroupHW8> groups = query.getResultList();
        req.setAttribute("groups", groups);

        getServletContext().getRequestDispatcher("/WEB-INF/show/showGroup.jsp").forward(req, resp);
    }
}
