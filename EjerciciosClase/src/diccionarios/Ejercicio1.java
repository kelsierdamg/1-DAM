package diccionarios;

import java.util.HashMap;

public class Ejercicio1 {
	public static void main(String[] args) {
		HashMap<Integer, String> dni = new HashMap<Integer, String>();
		dni.put(11111111, "Ana Fernández García");
		dni.put(33333333, "Raúl Pérez Hernández");
		dni.put(44444444, "Carla López Jiménez");
		dni.put(22222222, "Guillermo Díaz Sánchez");
		
		System.out.println(dni.keySet());
		System.out.println(dni.values());
	}

}
