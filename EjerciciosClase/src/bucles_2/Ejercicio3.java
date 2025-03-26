package bucles_2;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int temperatura = Integer.MIN_VALUE;
		int altura = Integer.MIN_VALUE;
		int valor = Integer.MIN_VALUE;
		
		System.out.println("Introduce la temperatura en Groenlandia: ");
		while(temperatura<-50 || temperatura>15) {
			temperatura = entrada.nextInt();
			if(temperatura<-50 || temperatura>15) {
				System.out.println("Temperatura inválida");
				System.out.print("Introduce la temperatura en Groenlandia: ");
			}
		}
		
		System.out.println("Introduce la altrua del Everest: ");
		while(altura<0 || altura>8848) {
			altura = entrada.nextInt();
			if(altura>8848) {
				System.out.println("Altura inválida");
				System.out.print("Introduce la altura del Everest: ");
			}
		}
		
		System.out.println("Introduce el precio de una casa en Madrid: ");
		while(valor<100000 || valor>400000) {
			valor = entrada.nextInt();
			if(valor<100000 || valor>400000) {
				System.out.println("Precio fuera de rango");
				System.out.print("Introduce el precio de una casa en Madrid: ");
			}
		}
		
		System.out.println("\nDatos ingresados:");
        System.out.println("Temperatura en Groenlandia: " + temperatura + " °C");
        System.out.println("Altura del Everest: " + altura + " m");
        System.out.println("Valor de la casa en Madrid: " + valor + " €");
        
        entrada.close();
	}

}
