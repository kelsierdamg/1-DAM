package excepciones;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero entre 0 y 100: ");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca un número entero entre 0 y 100: ");
		int num2 = entrada.nextInt();
		
		while(num1==num2) {
			System.out.println("Los números son iguales. Introduce otros");
			
			System.out.println("Introduzca un número entero entre 0 y 100: ");
			num1 = entrada.nextInt();
			System.out.println("Introduzca un número entero entre 0 y 100: ");
			num2 = entrada.nextInt();
		}
		
		System.out.println("OPERACIONES");
		System.out.println("Suma: " +num1+ " + " +num2+ " = "  +(num1 + num2));
		System.out.println("Resta: " +num1+ " - " +num2+ " = "  +(num1 - num2));
		System.out.println("Multiplicación: " +num1+ " x " +num2+ " = "  +(num1 * num2));
		System.out.println("División: " +num1+ " / " +num2+ " = "  +(num1 / num2));
		
		entrada.close();
		
		/*En la iteración 1 el programa se ejecuta normal.
		 * en la 2, sigue pidiendo un dato hasta que lo introduces
		 * en la 3, los datos son iguales
		 * en la 4, salta una excepción
		 * en la 5, se ejecuta normal
		 * en la 6, el programa no hace nada
		 * en la 7, sigue pidiendo un dato hasta que lo introduces
		 * en la 8, los datos son iguales
		 */
	}

}
