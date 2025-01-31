package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conector;
    public static Conexion cn;

    private Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conector = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdPersonas", "root", "admin");
            this.conector.setAutoCommit(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Conexion getConexion() {
        if (cn == null) {
            cn = new Conexion();
        }
        return cn;
    }

    public Connection getSQLConexion() {
        if (this.conector == null) {
            throw new IllegalStateException("Error en la conexion a la base de datos.");
        }
        return this.conector;
    }

    public void cerrarConexion() {
        try {
            this.conector.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        cn = null;
    }
}
