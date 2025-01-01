import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/senior_care_db"; // Tukar 'senior_care_db' dengan nama database anda
    private static final String USER = "root"; // Tukar 'root' jika ada nama pengguna lain
    private static final String PASSWORD = ""; // Masukkan kata laluan database

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver not found", e);
        }
    }
}
