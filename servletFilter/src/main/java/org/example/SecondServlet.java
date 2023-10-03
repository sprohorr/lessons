package org.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        HttpSession session = req.getSession();
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            count = 1;
        } else {
            count++;
        }
        session.setAttribute("count", count);
        writer.println("<p> Count: " + count + "</p>");
    }
}
