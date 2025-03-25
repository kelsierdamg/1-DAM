package arrays;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca su número de DNI: ");
		int numero = entrada.nextInt();
		
		int resto = numero%23;
		System.out.println("Su DNI es " +numero+ letras[resto]);
		entrada.close();
	}

}
