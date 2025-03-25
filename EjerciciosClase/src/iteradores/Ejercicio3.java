package iteradores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		System.out.println("Introduce una letra: ");
		char letra = entrada.next().charAt(0);
		
		Iterator<String> it = familia.iterator();
		while(it.hasNext()) {
			String nombre = it.next();
			if(nombre.charAt(1)==letra) {
				it.remove();
			}
		}
		System.out.println(familia);
		entrada.close();
	}
}
