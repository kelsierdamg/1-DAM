package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		while(true) {
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
		
		break;
		}
		catch(InputMismatchException e) {
			System.out.println("Error. Entrada no válida");
			entrada.next();
		}
		catch(ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}
		catch(Exception e) {
			System.out.println("Se ha producido esta excepción: " +e.getMessage());
		}
		
		}
		
		entrada.close();
	}

}
