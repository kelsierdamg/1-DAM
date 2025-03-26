package arrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.println("Introduce un número: ");
			numeros[i] = entrada.nextInt();
			entrada.nextLine();
		}
		
		System.out.println("¿Qué número desea ver?");
		String deseo = entrada.nextLine();
		
		if(deseo.equalsIgnoreCase("El primero")) {
			System.out.println(numeros[0]);
		}
		else if(deseo.equalsIgnoreCase("El segundo")) {
			System.out.println(numeros[1]);
		}
		else if(deseo.equalsIgnoreCase("El tercero")) {
			System.out.println(numeros[2]);
		}
		else if(deseo.equalsIgnoreCase("El cuarto")) {
			System.out.println(numeros[3]);
		}
		else if(deseo.equalsIgnoreCase("El quinto")) {
			System.out.println(numeros[4]);
		}
		else if(deseo.equalsIgnoreCase("El sexto")) {
			System.out.println(numeros[5]);
		}
		else if(deseo.equalsIgnoreCase("El séptimo")) {
			System.out.println(numeros[6]);
		}
		else if(deseo.equalsIgnoreCase("El octavo")) {
			System.out.println(numeros[7]);
		}
		else if(deseo.equalsIgnoreCase("El noveno")) {
			System.out.println(numeros[8]);
		}
		else if(deseo.equalsIgnoreCase("El último")) {
			System.out.println(numeros[9]);
		}
		entrada.close();
	}

}
