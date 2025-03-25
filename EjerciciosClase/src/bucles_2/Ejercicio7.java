package bucles_2;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = entrada.nextInt();
		int contador = 0;
		
		while(numero>0) {
			numero = numero/10;
			contador++;
		}
		System.out.println("El número tiene " +contador+ " cifras");
		
		entrada.close();
	}

}
