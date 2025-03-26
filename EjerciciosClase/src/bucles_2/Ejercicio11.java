package bucles_2;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el número a partir del que quieres que sea menor: ");
		int n = entrada.nextInt();
		
		if(n<=0) {
			System.out.println("Número no válido. Introduce un número positivo");
		}
		else {
			int a=1;
			int b=1;
			
			System.out.print(a);
			while(b<=n) {
				System.out.print(", " +b); 
	            int actual = b;    
	            b = a + b;                    
	            a = actual; 
			}
			entrada.close();
		}
		
	}

}
