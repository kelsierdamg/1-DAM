package arrays;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		int[] numeros = {3, 5, 7, 8, 9};
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print(numeros[i]+ " ");
		}
		
		System.out.println("\nIntroduce dos posiciones: ");
		int pos1 = entrada.nextInt();
		int pos2 = entrada.nextInt();
		
		if(numeros[pos1]>numeros[pos2]) {
			System.out.println("El número en la posición "+pos1+" (" +numeros[pos1]+") es mayor que el número en la posición "+pos2+ " ("+numeros[pos2]+")");
		}
		else if(numeros[pos1]<numeros[pos2]) {
			System.out.println("El número en la posición "+pos1+" (" +numeros[pos1]+") es menor que el número en la posición "+pos2+ " ("+numeros[pos2]+")");
		}
		else {
			System.out.println("El número en la posición "+pos1+" (" +numeros[pos1]+") y el número en la posición "+pos2+ " ("+numeros[pos2]+") son iguales");
		}
		
		entrada.close();
	}

}
