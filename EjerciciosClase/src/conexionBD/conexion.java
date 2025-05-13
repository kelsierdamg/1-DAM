package conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	static String url = "jdbc:mysql://localhost:3306/angelbbdd";
    static String user = "root";
    static String password = "1234";
    
    public static Connection conectar() {
    	Connection conn = null;
    	try {
    		conn = DriverManager.getConnection(url, user, password);
    	}
    	catch(SQLException e) {
    		System.err.println("Error: "+e.getMessage());
    	}
    	return conn;
    }
}
