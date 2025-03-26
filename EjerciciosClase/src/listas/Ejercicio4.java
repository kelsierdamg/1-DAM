package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		System.out.print("Introduce el número de familiar: ");
		int num = entrada.nextInt();
		
		numero(num, familia);
		
		entrada.close();
	}
	
	public static void numero(int num, List<String> familia) {
		String familia0 = familia.get(num);
		System.out.println(familia0);
	}
}
