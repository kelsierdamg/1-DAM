package bucles_2;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = entrada.nextInt();
		
		int sumaDivisores = 0;
		int i = 1;
		
		while(i <= numero/2){
			if(numero%i==0) {
				sumaDivisores+=i;
			}
			i++;
		}
		
		if(sumaDivisores==numero) {
			System.out.println("El número " +numero+ " es perfecto");
		}
		else {
			System.out.println("El número " +numero+ " no es perfecto");
		}
		
		entrada.close();
	}

}
