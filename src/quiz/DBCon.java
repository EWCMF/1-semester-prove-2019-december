package quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    // Connection til database laves med denne metode.
    static Connection connect(){
        Connection conn;

        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quiz", "root", "CodeWarrior8");
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException("Connection to db failed.");
        }
        return conn;
    }
}
