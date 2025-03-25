package bucles_1;

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int suma = 0;
		
		for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
		
		for (int i = 5; i < 10; i++) {
            suma += numeros[i];
        }
		
		System.out.println("La suma de los últimos 5 números es: " + suma);
		
		entrada.close();
	}

}
