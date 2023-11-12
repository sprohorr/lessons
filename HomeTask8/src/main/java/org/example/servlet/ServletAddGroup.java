package org.example.servlet;

import org.example.HibernateUtil;
import org.example.entity.GroupHW8;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletAddGroup extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/add/addGroup.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GroupHW8 group = new GroupHW8();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();
            group.setTitle(req.getParameter("title"));
            session.save(group);
            t.commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        resp.sendRedirect("/successfullyAddGroup");
    }
}
