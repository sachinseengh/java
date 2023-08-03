import java.awt.geom.QuadCurve2D;
import java.sql.*;

public class JDBC {
    static final String DB_URL = "jdbc:mysql://localhost/college_bern";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "select * from java";

    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement(0, 0, 0);
                ResultSet rs = stmt.executeQuery(QUERY);

        ) {
            while (rs.next()) {
                System.out.print("fname: " + rs.getString("first_name"));
                System.out.println(", lname: " + rs.getString("last_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
