package arraysbi;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 4;
		String[][] array = new String[n][n];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				array[i][j] = "-";
			}
		}

		while(true) {
		System.out.println("Introduce una fila del array (-1 para salir): ");
		int fila = entrada.nextInt();
		
		if(fila==-1) {
			break;
		}
		
		System.out.println("Introduce una columna del array: ");
		int columna = entrada.nextInt();
		System.out.println("Introduce una letra para meterla en el array: ");
		String letra = entrada.next();
		
		if(!array[fila][columna].equals("-")) {
			System.out.println("Esa posición ya esta ocupada");
		}
		else {
			array[fila][columna] = letra.toUpperCase();
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
		}
		entrada.close();
		System.out.println("Programa terminado");
	}
}
