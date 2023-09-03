package task.service;

import com.mysql.cj.jdbc.Driver;
import common.DatabaseConstants;
import task.model.StatusType;
import task.model.Task;

import java.sql.*;
import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

public class TaskService {
    private static final String INSERT_TASK_QUERY = "insert into task(" +
            "name,\n" +
            "description,\n" +
            "status_type,\n" +
            "creation_time) " +
            "values(?, ?, ?, ?, ?);";

    private static final String SELECT_TASK_QUERY = "select * from task where id=?";

    private Connection connection;

    {
        Driver driver = null;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Failed to register mysql driver: ");
            throw new RuntimeException(e);
        }

        try {
            connection = DriverManager.getConnection(DatabaseConstants.DB_URL);
        } catch (SQLException e) {
            System.out.println();
            throw new RuntimeException(e);
        }
    }

    public void createTask(Task task) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(INSERT_TASK_QUERY);
        ps.setString(1, task.getName());
        ps.setString(2, task.getDescription());
        ps.setString(3, String.valueOf(task.getStatusType()));
        ps.setTimestamp(4, Timestamp.valueOf(task.getCreateTime()));

        ps.execute();
        System.out.println("Task was saved in DB: " + task);
    }

    public void updateTask(int id) {
        //todo
    }

    public void deleteTask(int id) {
        //todo
    }

    public Task readTask(int id) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(SELECT_TASK_QUERY);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Task task = new Task(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("description"),
                    StatusType.valueOf(rs.getString("status_type")),
                    Instant.ofEpochMilli(rs.getDate("creation_time").getTime())
                            .atZone(ZoneId.systemDefault())
                            .toLocalDateTime());
            return task;
        }
        return null;
    }

    public List<Task> readStudents() {
        //todo
        return null;
    }
}
