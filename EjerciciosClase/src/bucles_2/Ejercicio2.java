package bucles_2;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcion = -1;
		
		System.out.println("GESTIÓN DEL CENTRO EDUCATIVO");
		System.out.println("****************************");
		System.out.println("1. Gestión de alumnos");
		System.out.println("2. Gestión de docentes");
		System.out.println("3. Gestión de personal administrativo");
		System.out.println("0. SALIR");
		
		while(opcion < 0 || opcion > 3) {
			System.out.print("Indique el número de la opción deseada: ");
			opcion = entrada.nextInt();
			
			if (opcion < 0 || opcion > 3) {
                System.out.println("¡Opción inválida! Debes ingresar un número entre 0 y 3.");
            }	
		}
		System.out.println("Ha elegido la opción: " +opcion);
		entrada.close();
	}

}
