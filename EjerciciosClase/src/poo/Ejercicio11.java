package poo;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio11 {
	public static Scanner entrada = new Scanner(System.in);
	public static Random random = new Random();
	
	public static void lanzarMoneda() {
		System.out.println("Introduce el número de veces que quiere lanzar la moneda: ");
		int num = entrada.nextInt();
		
		int caras = 0;
		int cruces = 0;
		
		for(int i=0; i<num; i++) {
			boolean esCara = random.nextBoolean();
			
			if(esCara) {
				caras++;
				System.out.println("Lanzamiento "+(i+1)+": Cara");
			}
			else {
				cruces++;
				System.out.println("Lanzamiento "+(i+1)+": Cruz");
			}
		}
		
		System.out.println("Resultados: ");
		System.out.println("Caras: " +caras);
		System.out.println("Cruces: " +cruces);
	}
	
	public static void main(String[] args) {
		lanzarMoneda();
	}
}
