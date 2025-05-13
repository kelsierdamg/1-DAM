package bbdd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import conexionBD.conexion;
import CRUD.Crud;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			Connection conn = conexion.conectar();
			boolean continuar = true;
			while(continuar) {
				System.out.println("""
						---MENÚ---
						1. Insertar un nuevo registro
						2. Mostrar todos los registros
						3. Actualizar un registro existente
						4. Eliminar un registro
						5. Salir
						""");
				
				System.out.println("Introduce una opción: ");
				int opcion = entrada.nextInt();
				
				switch(opcion) {
				case 1:
					Crud.insertarUsuario(conn, entrada);
					break;
				case 2:
					Crud.leerUsuario(conn);
		            break;
				case 3:
					Crud.actualizarUsuario(conn, entrada);
				    break;
				case 4:
					Crud.borrarUsuario(conn, entrada);
				    break;
				case 5:
					continuar = false;
					break;
				}
			}
			entrada.close();
			conn.close();
		} catch(SQLException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}
}
