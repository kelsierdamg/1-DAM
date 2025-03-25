package bucles_2;

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce los números que quieres sacar: ");
		int n = entrada.nextInt();
		
		int a=1;
		int b=1;
		
		int i=0;
		
		while(i<=n) {
			System.out.print(a + " "); 
            int siguiente = a + b;    
            a = b;                    
            b = siguiente; 
            
            i++;
		}
	}

}
