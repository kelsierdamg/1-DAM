package diccionarios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashMap<Integer, String> numeros = new HashMap<Integer, String>();
		
		numeros.put(0, "Zero");
		numeros.put(1, "Uno");
		numeros.put(2, "Due");
		numeros.put(3, "Tre");
		numeros.put(4, "Quattro");
		numeros.put(5, "Cinque");
		numeros.put(6, "Sei");
		numeros.put(7, "Sette");
		numeros.put(8, "Otto");
		numeros.put(9, "Nove");
		numeros.put(10, "Dieci");
		
		System.out.println("Introduce un número del 0 al 10 para ver como se dice en italiano:");
		int num = entrada.nextInt();
		
		if(num==0) {
			System.out.println(numeros.get(num));
		}
		else if(num==1) {
			System.out.println(numeros.get(num));
		}
		else if(num==2) {
			System.out.println(numeros.get(num));
		}
		else if(num==3) {
			System.out.println(numeros.get(num));
		}
		else if(num==4) {
			System.out.println(numeros.get(num));
		}
		else if(num==5) {
			System.out.println(numeros.get(num));
		}
		else if(num==6) {
			System.out.println(numeros.get(num));
		}
		else if(num==7) {
			System.out.println(numeros.get(num));
		}
		else if(num==8) {
			System.out.println(numeros.get(num));
		}
		else if(num==9) {
			System.out.println(numeros.get(num));
		}
		else if(num==10) {
			System.out.println(numeros.get(num));
		}
		else {
			System.out.println("Número no válido");
		}
		entrada.close();
	}
}
