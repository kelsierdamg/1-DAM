package listas;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	public static void main(String[] args) {
		List<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		insertarMiembro(familia, "Sandra");
	}
	
	public static void insertarMiembro(List<String> familia,  String Sandra) {
		familia.add(3, Sandra);
	}
}