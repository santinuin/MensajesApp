import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection get_connection(){
        Connection conexion = null;
        try{
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "password");
            if(conexion != null){
                System.out.println("Conexion exitosa");
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } {

        }
        return conexion;
    }
}
