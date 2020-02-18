package connection1;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connecetion1 connecetion1 = new Connecetion1();
        if (connecetion1.atteptConnection())
        {
            System.out.println("Connection ok");
        }
        else
        {
            System.out.println("Connection failed");
        }
        InsertRecord insertRecord = new InsertRecord();
        System.out.println(insertRecord.insertRecord(connecetion1.getConnection()));
    }
}
