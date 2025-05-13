package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.Usuario;

public class Crud {
	public static void leerUsuario(Connection conn) {
		try {
			ArrayList<Usuario> lista = new ArrayList<>();
			
			Statement consulta = conn.createStatement();
			ResultSet rs = consulta.executeQuery("SELECT * FROM usuarios");
            while (rs.next()) {
                int id = rs.getInt("id");   
                String nombre = rs.getString("nombre");
                String correo = rs.getString("correo");
                int edad = rs.getInt("edad");
                
                lista.add(new Usuario(id, nombre, correo, edad));
            }
            System.out.println(lista);
            rs.close();
            consulta.close();
		}
		catch(SQLException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	public static void borrarUsuario(Connection conn, Scanner entrada) {
		try {
			System.out.println("Introduce el ID del usuario a eliminar:");
		    int idEliminar = entrada.nextInt();

		    String sqlDelete = "DELETE FROM usuarios WHERE id = ?";
		    PreparedStatement stmtDelete = conn.prepareStatement(sqlDelete);
		    stmtDelete.setInt(1, idEliminar);
		    
		    int filasEliminadas = stmtDelete.executeUpdate();
		    System.out.println("Filas eliminadas: " + filasEliminadas);
		    stmtDelete.close();
		}
		catch(SQLException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	public static void actualizarUsuario(Connection conn, Scanner entrada) {
		try {
			System.out.println("Introduce el ID del usuario a actualizar:");
		    int idActualizar = entrada.nextInt();

		    System.out.println("Nuevo nombre:");
		    String nuevoNombre = entrada.next();

		    System.out.println("Nuevo correo:");
		    String nuevoCorreo = entrada.next();

		    System.out.println("Nueva edad:");
		    int nuevaEdad = entrada.nextInt();
		    
		    String sqlUpdate = "UPDATE usuarios SET nombre = ?, correo = ?, edad = ? WHERE id = ?";
		    PreparedStatement stmtUpdate = conn.prepareStatement(sqlUpdate);
		    stmtUpdate.setString(1, nuevoNombre);
		    stmtUpdate.setString(2, nuevoCorreo);
		    stmtUpdate.setInt(3, nuevaEdad);
		    stmtUpdate.setInt(4, idActualizar);
		    
		    int filasActualizadas = stmtUpdate.executeUpdate();
		    System.out.println("Filas actualizadas: " +filasActualizadas);
		    stmtUpdate.close();
		}
		catch(SQLException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
	
	public static void insertarUsuario(Connection conn, Scanner entrada) {
		try {
			System.out.println("Introduce un nombre: ");
			String nombre = entrada.next();
			
			System.out.println("Introdcue un correo: ");
			String correo = entrada.next();
			
			System.out.println("Introduce la edad: ");
			int edad = entrada.nextInt();
			
			String sqlInsert =  "INSERT INTO angelbbdd.usuarios (nombre, correo, edad) VALUES (?, ?, ?)";
			PreparedStatement insercion = conn.prepareStatement(sqlInsert);
			insercion.setString(1, nombre);
			insercion.setString(2, correo);
			insercion.setInt(3, edad);
			
			int filas = insercion.executeUpdate();
			System.out.println("Se han insertado "+filas+" filas");
			insercion.close();
		}
		catch(SQLException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}