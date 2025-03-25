package listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
	public static void main(String[] args) {
		List<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		imprimirFamilia(familia);
	}
	
	public static void imprimirFamilia(List<String> familia) {
		System.out.println(familia);
	}

}
