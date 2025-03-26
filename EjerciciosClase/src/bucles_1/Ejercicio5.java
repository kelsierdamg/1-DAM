package bucles_1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero = entrada.nextInt();
		
		System.out.println("     TABLA DE MULTIPLICAR DEL NÚMERO " +numero);
		System.out.printf("%-15s %15s %15s%n", "Multiplicando", "Multiplicador", "Producto");
		
		for(int i=1; i<=10; i++) {
			int resultado = numero * i;
			System.out.printf("%-15d %-15d %-15d%n", numero, i, resultado);
		}
		entrada.close();
	}

}
