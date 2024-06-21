import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLHandler {
    public static void main(String[] args){
        final String URL = "jdbc:MySQL://localhost:3306/";
        final String DB_NAME = "test_db";
        final String USER_ID = "root";
        final String USER_PASSWORD = "root";

        // MySQL JDBC 드라이버 로드
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL JDBC Driver Registered!");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;
        }

        Connection connection = null;

        // 데이터베이스 연결
        try {
            connection = DriverManager
                    .getConnection(URL + DB_NAME, USER_ID, USER_PASSWORD);

            System.out.println("Connection established!");

            // SQL 쿼리 실행
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM classes");

            while (rs.next()) {
                // 결과 처리
                //System.out.println("ID: " + rs.getInt("id"));
                //System.out.println("Name: " + rs.getString("name"));
                System.out.println(rs);
            }

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
