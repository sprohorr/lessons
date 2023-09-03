package task;

import common.DatabaseConstants;

import java.sql.*;

public class CreateTaskTableRunner {
    private static final String CREATE_TABLE_QUERY = "create table task (\n" +
            "  id                int primary key auto_increment,\n" +
            "  name              varchar(25)      not null,\n" +
            "  description       varchar(200)              ,\n" +
            "  status_type       varchar(10)      not null,\n" +
            "  create_time     timestamp        not null\n" +
            ");";

    public static void main(String[] args) throws SQLException {
        Driver driver;
        try {
            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        } catch (SQLException e) {
            System.out.println("Failed to register mysql driver: ");
            throw new RuntimeException(e);
        }

        Connection connection = DriverManager.getConnection(DatabaseConstants.DB_URL);

        Statement statement = connection.createStatement();
        statement.execute(CREATE_TABLE_QUERY);
    }
}
