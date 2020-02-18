package connection1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
    String sql = "INSERT INTO college(CNAME, STATE, ENROLLMENT) VALUES (?,?,?);";

    public int insertRecord(Connection connection) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        int rows = preparedStatement.executeUpdate();
        return rows;
    }
}
