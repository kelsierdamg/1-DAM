package arrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String[] palabras = {"hola", "adios", "ADIOS", "HOLA", "Adios"};
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<palabras.length; i++) {
			System.out.print(palabras[i]+ " ");
		}
		
		System.out.println("\nIntroduce dos posiciones: ");
		int pos1 = entrada.nextInt();
		int pos2 = entrada.nextInt();
		
		if(palabras[pos1].equalsIgnoreCase(palabras[pos2])) {
			System.out.println("Las palabras son iguales");
		}
		else {
			System.out.println("Las palabras no son iguales");
		}
		
		entrada.close();
	}

}
