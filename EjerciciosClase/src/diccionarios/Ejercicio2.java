package diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashMap<Integer, String> dni = new HashMap<Integer, String>();
		dni.put(11111111, "Ana Fernández García");
		dni.put(33333333, "Raúl Pérez Hernández");
		dni.put(44444444, "Carla López Jiménez");
		dni.put(22222222, "Guillermo Díaz Sánchez");
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("""
					1. Agregar una nueva persona
					2. Mostrar todos los DNI
					3. Mostrar todas las personas
					4. Salir
					""");
			
			System.out.println("Elige una opción: ");
			int opcion = entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce un DNI: ");
				int num = entrada.nextInt();
				System.out.println("Introduce el nombre asociado al DNI: ");
				String nombre = entrada.next();
				
				dni.put(num, nombre);
				break;
			case 2:
				System.out.println(dni.keySet());
				break;
			case 3:
				System.out.println(dni.values());
				break;
			case 4:
				System.out.println("Saliendo del programa");
				continuar = false;
				entrada.close();
				break;
			}
		}
	}
}
