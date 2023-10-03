package org.example.servlets;

import org.example.driver.MySQLDriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/AddStudent.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MySQLDriverManager driverManager = MySQLDriverManager.getInstance();
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = driverManager.getConnection();
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try {
            preparedStatement = connection.prepareStatement("INSERT INTO table2.students values (?,?,?,?,?)");
            preparedStatement.setString(1, "id");
            preparedStatement.setString(2, "name");
            preparedStatement.setString(3, "surname");
            preparedStatement.setString(4, "age");
            preparedStatement.setString(5, "group");
            preparedStatement = connection.prepareStatement("SELECT * FROM table2.students");
            preparedStatement = connection.prepareStatement("SELECT * FROM table2.students WHERE 'group' = ?");
            preparedStatement.setString(1, "group");
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
            e.printStackTrace();
            System.out.println("Exception!");
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
