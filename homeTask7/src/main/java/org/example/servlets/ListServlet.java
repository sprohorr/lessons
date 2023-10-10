package org.example.servlets;

import org.example.driver.MySQLDriverManager;
import org.example.entity.Table;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.lang.System.out;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MySQLDriverManager driverManager = MySQLDriverManager.getInstance();
        Connection connection;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = driverManager.getConnection();
            connection.setAutoCommit(false);
            try {
                preparedStatement = connection.prepareStatement("SELECT * FROM table2.hometask7");
                resultSet = preparedStatement.executeQuery();
                List<Table> tableList = new ArrayList<>();
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    Date date = resultSet.getDate("date");
                    String description = resultSet.getString("description");
                    Table table = new Table(name, date, description);
                    tableList.add(table);
                }
                req.setAttribute("tableList", tableList);


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
        getServletContext().getRequestDispatcher("/WEB-INF/Show list.jsp").forward(req, resp);
    }
}
