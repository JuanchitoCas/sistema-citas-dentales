import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static final String URL =
            "jdbc:mysql://localhost:3306/sistema_citas_dentales";

    private static final String USER = "root";

    public static Connection conectar() throws SQLException {

        String password = System.getenv("DB_PASSWORD");

        if (password == null || password.isBlank()) {
            throw new IllegalStateException(
                    "No se encontró la variable de entorno DB_PASSWORD"
            );
        }

        return DriverManager.getConnection(URL, USER, password);
    }
}