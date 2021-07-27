package BasesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class A_conexionBD {

	public static void main(String[] args) {
		
		
		Connection con = null;
		
		Properties props = new Properties();
		props.put("user","root");
		props.put("password", "12345678");
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/cursojava", props); //el puerto es el 3307 ya que el default 3306 esta empleado (no sé por quien)
			
			System.out.println("te has conectado con exito?");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
