package BasesDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class C_ConexionPatronSingleton {
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3307/cursojava";
	
	private static Connection instance = null;
	
	private C_ConexionPatronSingleton() { }
	
	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			Properties props = new Properties();
			props.put("user", "root");
			props.put("password", "12345678");
			instance = DriverManager.getConnection(JDBC_URL, props);
		}
		
		return instance;
	}
	
}
