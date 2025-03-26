package bucles_2;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Jugador 1, introduce un nº secreto entre 1 y 10: ");
		int numero = entrada.nextInt();
		
		while(numero<1 || numero>10) {
			System.out.println("El número debe estar entre 1 y 10");
			numero = entrada.nextInt();
		}
		
		System.out.println("Jugador 2, intenta adivinar el número: ");
		int intento = Integer.MIN_VALUE;
		int intentos = 0;
		
		while(numero!=intento && intentos<3) {
			System.out.print("Introduce tu intento (un número entre 1 y 10): ");
            intento = entrada.nextInt();
            
            intentos++;
            
            if(intento<numero) {
            	System.out.println("El número es mayor");
            }
            else if(intento>numero) {
            	System.out.println("El número es menor");
            }
            System.out.println("Llevas " +intentos+ " intentos");
		}
		
		 if(intentos>=3) {
         	System.out.println("El número que debías adivinar es " +numero);
         }
		 else {
			 System.out.println("Has adivinado el número en " +intentos+ " intentos");
		 }
		 entrada.close();
	}

}
