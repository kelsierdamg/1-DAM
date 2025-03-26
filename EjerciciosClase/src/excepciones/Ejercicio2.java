package excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
		
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
		}
		catch(InputMismatchException e) {
			System.out.println("Error. Entrada no válida");
		}
		
		entrada.close();
	}
}
