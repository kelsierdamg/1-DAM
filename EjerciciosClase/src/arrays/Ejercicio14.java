package arrays;

import java.util.Scanner;

public class Ejercicio14 {
	public static boolean esPrimo(int n) {
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				 return false;
			}
		}
		return true;
		}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int n = entrada.nextInt();
		int contador = 0;
		int num = 2;
		
		int[] primos = new int[n];
		
		while(contador<n) {
			if(esPrimo(num)) {
				primos[contador]=num;
				contador++;
			}
			num++;
		}
		
		System.out.println("Los primeros " +n+ " números primos son: ");
		for(int i=0; i<n; i++) {
			System.out.print(primos[i] + " ");
		}
		System.out.println();
		
		entrada.close();
	}
}
