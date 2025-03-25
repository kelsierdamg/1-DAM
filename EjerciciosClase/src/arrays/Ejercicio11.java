package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = new int[5];
		
		System.out.println("Introduce 5 números");
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=entrada.nextInt();
		}
		
		Arrays.sort(numeros);
		
		System.out.print("Los números ordenados son: ");
		for(int i : numeros) {
			System.out.print(i+ " ");
		}
		entrada.close();
	}
}
