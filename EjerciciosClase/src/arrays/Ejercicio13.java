package arrays;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int tamaño = 4;
		int[] infinito = new int[tamaño];
		int indice = 0;
		
		while(true) {
			System.out.println("Introduce un número (1234 para salir): ");
			int numero = entrada.nextInt();
			
			if(numero==1234) {
				break;
			}
			
			infinito[indice] = numero;
			for(int i=0; i<tamaño; i++) {
				System.out.print(infinito[i]+ " ");
			}
			System.out.println();
			
			indice = (indice+1)%tamaño;
		}
		System.out.println("Programa finalizado");
		entrada.close();
	}
}
