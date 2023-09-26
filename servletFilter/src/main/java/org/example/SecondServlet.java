package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static java.lang.System.out;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/second.html").forward(req, resp);
        int count = 0;
        HttpSession session = req.getSession();
        String login = (String) session.getAttribute("login");
        if (login == null) {
            session.getAttribute("login");
            count++;
            out.println(count);
        } else {
            count++;
            out.println(count);
            //session.removeAttribute("login");
        }
        out.close();
    }
}
