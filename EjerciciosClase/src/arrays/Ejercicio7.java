package arrays;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		int[] numeros = {3, 5, 6, 7, 8, 9};
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		
		boolean continuar = true;
		while(continuar) {
		System.out.println("\n¿Qué dos posiciones del array desea intercambiar? (0 a 5)");
		int pos1 = entrada.nextInt();
		int pos2 = entrada.nextInt();
		
		int tmp = numeros[pos1];
		numeros[pos1] = numeros[pos2];
		numeros[pos2] = tmp;
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		
		System.out.println("\n¿Desea continuar?");
		String respuesta = entrada.next();
		if(respuesta.equalsIgnoreCase("no")) {
			continuar = false;
		}
		}
		entrada.close();
	}

}
