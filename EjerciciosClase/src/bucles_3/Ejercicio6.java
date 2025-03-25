package bucles_3;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("1. ESPAÑOL");
		System.out.println("2. ENGLISH");
		System.out.println("3. FRANÇAIS");
		
		System.out.println("***************");
		System.out.print("Seleccione una opción: ");
		int opcion = entrada.nextInt();
		
		do {
			if(opcion==1) {
				System.out.println("\n¡Hola!");
				System.out.println("1. ESPAÑOL");
				System.out.println("2. ENGLISH");
				System.out.println("3. FRANÇAIS");
				
				System.out.println("***************");
				System.out.print("Seleccione una opción: ");
				opcion = entrada.nextInt();
			}
			else if(opcion==2) {
				System.out.println("\nHello!");
				System.out.println("1. ESPAÑOL");
				System.out.println("2. ENGLISH");
				System.out.println("3. FRANÇAIS");
				
				System.out.println("***************");
				System.out.print("Seleccione una opción: ");
				opcion = entrada.nextInt();
			}
			else if(opcion==3) {
				System.out.println("\nBonjour!");
				System.out.println("1. ESPAÑOL");
				System.out.println("2. ENGLISH");
				System.out.println("3. FRANÇAIS");
				
				System.out.println("***************");
				System.out.print("Seleccione una opción: ");
				opcion = entrada.nextInt();
			}
		}
		while(opcion!=-1);
		
		System.out.println("Fin del programa");
	}

}
