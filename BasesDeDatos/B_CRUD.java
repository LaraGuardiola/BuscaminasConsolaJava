package BasesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class B_CRUD {
	
	public static void main(String[] args) {
		
		
		Connection con = null;
		
		Properties props = new Properties();
		props.put("user","root");
		props.put("password", "12345678");
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/cursojava", props); //el puerto es el 3307 ya que el default 3306 esta empleado (no s� por quien)
			
			
			//Se crea el objeto para enviar sentencias
			
			Statement st = con.createStatement();
			
			
			//Se almacena el resultado de la query en un resultSet

			//* CONSULTA SELECT
			
			//con PreparedStatement (convenientes porque evitan la inyección SQL)

			PreparedStatement ps = con.prepareStatement("SELECT * FROM Personas");

			ResultSet rs = ps.executeQuery();

			//ResultSet rs = st.executeQuery("SELECT * FROM Personas"); sin PreparedStatement
			
			boolean hayFilas = false;
			
			while(rs.next()) { //mientras haya campos se ejecutara el bloque while, asignando los valores a sus respectivas variables
				hayFilas = true;
				String id = rs.getString(1);
				String nombre = rs.getString(2);
				String apellidos = rs.getString(3);
				String direccion = rs.getString(4);
				String ciudad = rs.getString(5);
				System.out.printf("ID: %s\t Nombre: %s\t Apellidos: %s\t Direccion: %s\t Ciudad: %s\n", id, nombre, apellidos, direccion, ciudad); //imprimo resultados, que seran los de la tabla Personas
			}
			
			System.out.println("te has conectado con exito?");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
