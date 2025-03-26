package arrays;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		int[] numeros = {3, 5, 6, 7, 9};
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = entrada.nextInt();
		
		boolean encontrado = false;
		int posicion = 0;
		for(int i=0; i<numeros.length; i++) {
			posicion=i;
			if(numeros[i]==numero) {
				System.out.println("Esta en el vector en la posición " +posicion);
				encontrado = true;
				break;
			}
		}
		
		if (!encontrado) {
            System.out.println("No está en el vector");
        }
		
		entrada.close();
	}
}
