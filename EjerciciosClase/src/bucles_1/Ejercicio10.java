package bucles_1;

import java.util.Scanner;

class añosBisiestos{
	public static boolean esBisiesto(int i) {
		return (i % 4 == 0 && i % 100 != 0) || (i % 400 == 0);
}
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce dos años: ");
		int año1 = entrada.nextInt();
		int año2 = entrada.nextInt();
		
		for(int i=año1; i<=año2; i++) {
			if(esBisiesto(i)) {
				System.out.println(i);
			}
		}
		entrada.close();
	}
}
}
