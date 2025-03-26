package arrays;

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = entrada.nextLine();
		
		String[] partes = frase.split(" ");
		
		System.out.println("La frase contiene: ");
		for(int i=0; i<partes.length; i++) {
			System.out.print(partes[i]);
			if(i<partes.length-1) {
				System.out.print(", ");
			}
		}
		entrada.close();
	}
}