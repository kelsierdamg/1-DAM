package bucles_1;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿Cuántos números desea introducir?: ");
		int numeros = entrada.nextInt();
		
		for(int i=1; i<=numeros; i++) {
			System.out.print("Introduce el número " +i+ ":");
			int numero = entrada.nextInt();
			
			if(numero%2==0) {
				System.out.print("El número " +numero+ " es par");
			}
			
			if(numero%13==0) {
				if(numero%2==0) {
					System.out.print(" y");
				}
				System.out.print(" es múltiplo de 13");
			}
			
			if (numero % 2 != 0 && numero % 13 != 0) {
                System.out.println("El número " + numero + " no es ni par ni múltiplo de 13");
            }
		}
		entrada.close();
	}

}
