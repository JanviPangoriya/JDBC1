package connection1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connecetion1 {
    public static Connection connection = null;
    public boolean atteptConnection() throws SQLException {
        boolean isconnected=false;
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","");
        if (connection!=null)
        {
            isconnected =true;
        }
        return isconnected;
    }

    public static Connection getConnection() {
        return connection;
    }
}
