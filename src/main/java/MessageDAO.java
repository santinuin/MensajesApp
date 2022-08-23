import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {

    public static void createMessageDB(Message myMessage) {

        MyConnection db_connect = new MyConnection();

        try (Connection co = db_connect.get_connection()) {

            PreparedStatement ps = null;

            try {

                String query = "INSERT INTO mensajes_app.mensajes (mensaje, autor_mensaje,fecha_mensaje) VALUES (?,?,CURRENT_TIMESTAMP)";
                ps = co.prepareStatement(query);
                ps.setString(1, myMessage.getMessage());
                ps.setString(2, myMessage.getMessage_author());
                ps.executeUpdate();
                System.out.println("Mensaje creado");

            } catch (SQLException e) {
                System.out.println(e);
            }


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void readMessageDB() {

        MyConnection db_connect = new MyConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection co = db_connect.get_connection()) {
            String query = "SELECT * FROM mensajes_app.mensajes";
            ps = co.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id_mensaje"));
                System.out.println("Mensaje: " + rs.getString("mensaje"));
                System.out.println("Autor: " + rs.getString("autor_mensaje"));
                System.out.println("Fecha: " + rs.getString("fecha_mensaje"));
                System.out.println("");

            }

        } catch (SQLException e) {
            System.out.println("No se pudieron recuperar los mensajes");
            System.out.println(e);

        }

    }

    public static void deleteMessageDB(int message_id) {

        MyConnection db_connect = new MyConnection();

        try (Connection co = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM mensajes_app.mensajes WHERE id_mensaje = ?";
                ps = co.prepareStatement(query);
                ps.setInt(1, message_id);
                ps.executeUpdate();
                System.out.println("El mensaje ha sido borrado");

            } catch (SQLException e) {
                System.out.println("No se pudo borrar el mensaje");
                System.out.println(e);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public static void updateMessageDB(Message myMessage) {

        MyConnection db_connect = new MyConnection();

        try (Connection co = db_connect.get_connection()) {
            PreparedStatement ps = null;

            try {
                String query = "UPDATE mensajes_app.mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps = co.prepareStatement(query);
                ps.setString(1, myMessage.getMessage());
                ps.setInt(2, myMessage.getMessage_id());
                ps.executeUpdate();
                System.out.println("El mensaje ha sido actualizado");

            } catch (SQLException e) {
                System.out.println("No se pudo actualizar el mensaje");
                System.out.println(e);
            }


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
