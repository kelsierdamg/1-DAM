package poo2;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio_ej10 {	
	public static Scanner entrada = new Scanner(System.in);
	public static Random random = new Random();
	
	public static int generaAleatorioEntero(int num1, int num2) {
		if (num1 > num2) { // Intercambiar si están en orden incorrecto
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
		return random.nextInt(num1, num2);
	}
	
	public static double generaAleatorioReal(double num1, double num2) {
		if (num1 > num2) { // Intercambiar si están en orden incorrecto
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
		return random.nextDouble(num1, num2);
	}
	
	public static boolean generaAleatorioBooleano() {
		Random random = new Random();
		return random.nextBoolean();
	}
	
	public static void main(String[] args) {
		System.out.println("Introduce dos números: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		System.out.println(generaAleatorioEntero(num1, num2));
		System.out.println(generaAleatorioReal(num1, num2));
		System.out.println(generaAleatorioBooleano());
	}
}
