package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	private String cadena_conexion = "jdbc:mysql://localhost:3306/libreria?useUnicode=true&serverTimezone=UTC";
	private String usuario = "root";
	private String contrasena = "1234";

	public Connection(String cadena_conexion, String usuario, String contrasena) {
		super();
		this.cadena_conexion = cadena_conexion;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}

	public Connection getConnection() {
		try {
			Connection conn = (Connection) DriverManager.getConnection(this.cadena_conexion, this.usuario, this.contrasena);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public void closeConnection(java.sql.Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public String getCadena_conexion() {
		return cadena_conexion;
	}

	public void setCadena_conexion(String cadena_conexion) {
		this.cadena_conexion = cadena_conexion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}