package org.example.servlets;

import org.example.entities.Student;
import org.example.model.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ListStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Model studentModel = Model.getStudentModel();
        List<Student> studentList = studentModel.list();

        req.setAttribute("students", studentList);
        getServletContext().getRequestDispatcher("/WEB-INF/list.jsp").forward(req, resp);

    }
}
