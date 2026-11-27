import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class PacienteDAO {
 
    public ArrayList<Paciente> obtenerTodos() {

        ArrayList<Paciente> pacientes = new ArrayList<>();

        String sql = "SELECT * FROM pacientes";

        try (Connection conexion = ConexionDB.conectar();
             PreparedStatement sentencia = conexion.prepareStatement(sql);
             ResultSet resultado = sentencia.executeQuery()) {

            while (resultado.next()) {

                int id = resultado.getInt("id_paciente");
                String nombre = resultado.getString("nombre");
                String apellidos = resultado.getString("apellidos");
                String telefono = resultado.getString("telefono");

                Paciente paciente = new Paciente(
                        id, nombre, apellidos, telefono
                );

                pacientes.add(paciente);
            }

        } catch (SQLException e) {
            System.out.println("Error al consultar pacientes: " + e.getMessage());
        }

        return pacientes;
    }

    
}
