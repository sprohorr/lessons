package org.example.servlets;

import org.example.driver.MySQLDriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

import static java.lang.System.out;

public class ApplicationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/applicationForm.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MySQLDriverManager driverManager = MySQLDriverManager.getInstance();
        Connection connection;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = driverManager.getConnection();
            connection.setAutoCommit(false);
            try {
                preparedStatement = connection.prepareStatement("INSERT INTO table2.hometask7 VALUES (?,?,?) ");
                preparedStatement.setString(1, req.getParameter("name"));
                preparedStatement.setDate(2, Date.valueOf(req.getParameter("date")));
                preparedStatement.setString(3, req.getParameter("description"));
                preparedStatement.executeUpdate();

                preparedStatement = connection.prepareStatement("SELECT count(*) FROM table2.hometask7");
                resultSet = preparedStatement.executeQuery();
                String count = null;
                while (resultSet.next()) {
                    count = resultSet.getString(1);
                }
                req.setAttribute("resultSet", count);

                connection.commit();
                getServletContext().getRequestDispatcher("/WEB-INF/successfully.jsp").forward(req, resp);
            } catch (Exception e) {
                connection.rollback();
                e.printStackTrace();
                out.println("Exception!");
            } finally {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}