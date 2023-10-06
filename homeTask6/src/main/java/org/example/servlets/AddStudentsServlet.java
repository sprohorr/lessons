package org.example.servlets;

import org.example.driver.MySQLDriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.lang.System.out;

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
        ResultSet resultSet = null;
        try {
            connection = driverManager.getConnection();
            connection.setAutoCommit(false);
            try {
                preparedStatement = connection.prepareStatement("INSERT INTO table2.students values (?,?,?,?,?)");
                preparedStatement.setInt(1, Integer.parseInt(req.getParameter("id")));
                preparedStatement.setString(2, req.getParameter("name"));
                preparedStatement.setString(3, req.getParameter("surname"));
                preparedStatement.setInt(4, Integer.parseInt(req.getParameter("age")));
                preparedStatement.setInt(5, Integer.parseInt(req.getParameter("group")));
                preparedStatement.executeUpdate();

                preparedStatement = connection.prepareStatement("SELECT * FROM table2.students");
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    out.println(resultSet.getInt("id"));
                    out.println(resultSet.getString("name"));
                    out.println(resultSet.getString("surname"));
                    out.println(resultSet.getInt("age"));
                    out.println(resultSet.getInt("group"));
                }


                preparedStatement = connection.prepareStatement("SELECT * FROM table2.students WHERE 'group' = ?");
                preparedStatement.setInt(1, Integer.parseInt(req.getParameter("group")));
                ResultSet prepareResultSet = preparedStatement.executeQuery();
                while (prepareResultSet.next()) {
                    out.println(prepareResultSet.getInt("id"));
                    out.println(prepareResultSet.getString("name"));
                    out.println(prepareResultSet.getString("surname"));
                    out.println(prepareResultSet.getInt("age"));
                }
                connection.commit();

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
                    connection.close();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
