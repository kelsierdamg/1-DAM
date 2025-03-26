package bucles_1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce dos números: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		
		int inicio = Math.min(a, b);
	    int fin = Math.max(a, b);
		
		System.out.print("Los números entre " +a+ " y " +b+ " son: ");
		for(int i = inicio; i<=fin; i++) {
			System.out.print(i);
			if(i<fin) {
				System.out.print(", ");
			}
		}
		entrada.close();
	}

}
