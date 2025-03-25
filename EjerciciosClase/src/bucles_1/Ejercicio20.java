package bucles_1;

import java.util.Scanner;

public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce los números que quieres sacar: ");
		int n = entrada.nextInt();
		
		int a=1;
		int b=1;
		
		for(int i=1; i<=n; i++) {
			System.out.print(a + " "); 
            int siguiente = a + b;    
            a = b;                    
            b = siguiente;            
		}
	}
 
}
