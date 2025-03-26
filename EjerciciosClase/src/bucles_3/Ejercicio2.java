package bucles_3;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		do {
			System.out.println("Introduce un número: ");
			numero = entrada.nextInt();
			
			if(numero%5==0) {
				System.out.println(numero+ " es múltiplo de 5");
			}
			else {
				System.out.println(numero+ " no es múltiplo de 5");
			}
		}
		while(numero!=0);
		System.out.println("Programa finalizado");
		
		entrada.close();
	}

}
