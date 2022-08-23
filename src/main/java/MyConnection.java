import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    public java.sql.Connection get_connection() {
        java.sql.Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "password");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
