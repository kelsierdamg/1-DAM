package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		System.out.println("Introduce un número y un nuevo nombre de familiar: ");
		int num = entrada.nextInt();
		String nombre = entrada.next();
		
		cambiarPosicion(familia, num, nombre);
		System.out.println(familia);
		
		entrada.close();
	}
	
	public static void cambiarPosicion(List<String> familia, int num, String nombre) {
		familia.set(num, nombre);
	}

}
