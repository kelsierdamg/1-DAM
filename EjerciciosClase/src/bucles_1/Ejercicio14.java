package bucles_1;

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int equilatero = 0;
		int isosceles = 0;
		int escaleno = 0;
		
		System.out.println("Introducce el número de triángulos: ");
		int n = entrada.nextInt();
		
		for (int i = 1; i <= n; i++) {
            System.out.println("\nTriángulo " + i + ":");
            System.out.print("Lado 1: ");
            int lado1 = entrada.nextInt();
            System.out.print("Lado 2: ");
            int lado2 = entrada.nextInt();
            System.out.print("Lado 3: ");
            int lado3 = entrada.nextInt();
            
            if(lado1==lado2 && lado2==lado3) {
            	equilatero++;
            	System.out.println("Es un triángulo equilátero");
            }
            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            	isosceles++;
            	System.out.println("Es un triángulo isósceles");
            }
            else {
            	escaleno++;
            	System.out.println("Es un triángulo escaleno");
            }
	    }
		
		System.out.println("\nTriángulos equiláteros: " + equilatero);
        System.out.println("Triángulos isósceles: " + isosceles);
        System.out.println("Triángulos escalenos: " + escaleno);

        entrada.close();

	}
}
