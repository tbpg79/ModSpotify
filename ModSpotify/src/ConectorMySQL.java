
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC GAMING
 */

public class ConectorMySQL {

    private Connection _conexion;
    private String _host = "localhost";
    private String _bd = "spotifymod";
    private String _usuario = "root";
    private String _password = "";

    public ConectorMySQL(String host, String bd, String usuario, String password) {
        _host = host;
        _bd = bd;
        _usuario = usuario;
        _password = password;
    }

    public void conectar() throws SQLException {
        String url = "jdbc:mysql://" + _host + "/" + _bd;

        try {
            _conexion = DriverManager.getConnection(url, _usuario, _password);
            System.out.println("> Conexión a la base de datos exitosa.");
        } catch (SQLException ex) {
            System.out.println("> Error en la conexión a la base de datos: " + ex.getMessage());
            throw ex;
        }
    }

    public void desconectar() throws SQLException {
        if (_conexion != null) {
            try {
                _conexion.close();
                System.out.println("> Conexión cerrada correctamente.");
            } catch (SQLException ex) {
                System.out.println("> Error al cerrar la conexión: " + ex.getMessage());
                throw ex;
            }
        }
    }

    public void realizarConsulta(String consulta) throws SQLException {
       
        conectar();
        PreparedStatement statement = null;
        ResultSet resultado = null;

        try {
            statement = _conexion.prepareStatement(consulta);
            resultado = statement.executeQuery();

            if (resultado.next()) {
                String titulo = resultado.getString("Titulo");
                String descripcion = resultado.getString("Informacion");
                String cantantes = resultado.getString("Cantantes");

                // Almacena los datos en las variables de instancia
                _titulo = titulo;
                _descripcion = descripcion;
                _cantantes = cantantes;
            }
        } catch (SQLException ex) {
            System.out.println("> Error en la consulta a la base de datos: " + ex.getMessage());
            throw ex;
        } finally {
            if (resultado != null) {
                resultado.close();
            }
            if (statement != null) {
                statement.close();
            }
            desconectar();
        }
    }

// Agrega estas variables de instancia para almacenar los datos recuperados
    private String _titulo;
    private String _descripcion;
    private String _cantantes;

    public String getTitulo() {
        return _titulo;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public String getCantantes() {
        return _cantantes;
    }

}
