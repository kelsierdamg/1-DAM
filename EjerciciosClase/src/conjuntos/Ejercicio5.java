package conjuntos;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("1. Introducir un número (del 1 al 1000): ");
			System.out.println("2. Listar los números poniendo un tope: ");
			System.out.println("3. Salir");
			
			System.out.println("Elige una opción: ");
			int opcion = entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Introduce el número: ");
				int num = entrada.nextInt();
				
				if(num>1000) {
					System.out.println("Número no válido");
				}
				else {
					numeros.add(num);
				}
				break;
			case 2:
				System.out.println("Introduce un tope hasta el que quieres que se muestren numeros");
				int tope = entrada.nextInt();
				
				numeros.headSet(tope);
				break;
			case 3: 
				System.out.println("Saliendo del programa");
				continuar = false;
				entrada.close();
				break;
			}
		}
	}
}
