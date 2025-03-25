package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
		System.out.println("Introduzca una frase y pulse intro para finalizar:");
		String frase = entrada.nextLine();
		
		System.out.print("Introduzca un número de letra de la anterior frase: ");
		int posicion = entrada.nextInt();
		
		System.out.println(String.format("La letra en la posición %d es la '%c'", posicion, frase.charAt(posicion-1)));
		}
		catch(InputMismatchException e) {
			System.out.println("Error: ingrese un número entero");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Error: índice fuera de rango");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		finally {
			System.out.println("[OK] Finalización controlada del programa");
			entrada.close();
		}
	}

}
