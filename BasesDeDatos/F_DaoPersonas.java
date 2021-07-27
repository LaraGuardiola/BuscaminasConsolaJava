package BasesDeDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class F_DaoPersonas {
	
	private Connection con = null;

	private static F_DaoPersonas instance = null; //instancia del tipo de clase que se retornara en getInstance() (se crea una nueva instancia cada vez que se llame al metodo)

	private F_DaoPersonas() throws SQLException {
		con = C_ConexionPatronSingleton.getConnection(); //del ejercicio c saca la instancia de connection a la base de datos cursojava
	}

	public static F_DaoPersonas getInstance() throws SQLException {
		if (instance == null)
			instance = new F_DaoPersonas();

		return instance;
	}
	
	//INSERT
	
	public void insert(D_Persona p) throws SQLException {

		PreparedStatement ps = con.prepareStatement( //El primer valor id al ser incremental no es necesario insertarlo
				"INSERT INTO Personas (Nombre, Apellidos, Direccion, Ciudad) VALUES (?, ?, ?, ?)");
		ps.setString(1, p.getNombre());
		ps.setString(2, p.getApellidos());
		ps.setString(3,p.getDireccion());
		ps.setString(4, p.getCiudad());

		ps.executeUpdate();

		ps.close();

	}
	
	//RETORNA UNA LISTA DE PERSONAS EN BASE A LA CONSULTA SELECT ( TODAS LAS PERSONAS EN ESTE CASO)
	
	public List<D_Persona> selectAll() throws SQLException {

		PreparedStatement ps = con.prepareStatement("SELECT * FROM Personas");
		ResultSet rs = ps.executeQuery();

		List<D_Persona> result = null;

		while (rs.next()) {
			if (result == null)
				result = new ArrayList<>();

			result.add(new D_Persona(rs.getInt("PersonaID"), rs.getString("Nombre"), rs.getString("Apellidos"), rs.getString("Direccion"), rs.getString("Ciudad")));
		}

		rs.close();
		ps.close();

		return result;
	}
	
	//RETORNA UNA INSTANCIA DE PERSONA EN BASE A LA ID INTRODUCIDA
	
	public D_Persona encontrarPorClavePrimaria(int id) throws SQLException {

		PreparedStatement ps = con.prepareStatement("SELECT * FROM Personas WHERE PersonaID = ?");
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		D_Persona result = null;

		if (rs.next()) {
			result = new D_Persona(rs.getInt("PersonaID"), rs.getString("Nombre"), rs.getString("Apellidos"), rs.getString("Direccion"), rs.getString("Ciudad"));
		}

		rs.close();
		ps.close();

		return result;

	}
	
	//DELETE
	
	public void delete(int id) throws SQLException {
		
		if (id <= 0) //no hace nada si la id es 0 (comienza en 1)
			return;
		
		PreparedStatement ps = con.prepareStatement("DELETE FROM Personas WHERE PersonaID = ?");
		ps.setInt(1, id);

		ps.executeUpdate();

		ps.close();
	}
	
	//UPDATE

	public void update(D_Persona p) throws SQLException {
		
		if (p.getId() == 0)
			return;

		PreparedStatement ps = con.prepareStatement("UPDATE Personas SET Nombre = ?, Apellidos = ?, Direccion = ?, Ciudad = ? WHERE PersonaID = ?");
		
		
		ps.setString(1, p.getNombre());
		ps.setString(2, p.getApellidos());
		ps.setString(3, p.getDireccion());
		ps.setString(4, p.getCiudad());
		ps.setInt(5, p.getId());
	
		
		ps.executeUpdate();
		
		ps.close();
		
		
	}

}
