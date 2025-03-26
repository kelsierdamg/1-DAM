package conjuntos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashSet<String> ciudadanos = new HashSet<String>();
		HashSet<String> ciudadanosIBI = new HashSet<String>();
		
		Collections.addAll(ciudadanos, "Ana".toUpperCase(), "Luis".toUpperCase(), "Pepe".toUpperCase(), "Sara".toUpperCase(), "Miguel".toUpperCase(), "Gabriel".toUpperCase(), "Raquel".toUpperCase());
		Collections.addAll(ciudadanosIBI, "Luis".toUpperCase(), "Gabriel".toUpperCase(), "Sara".toUpperCase(), "Raquel".toUpperCase());
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("""
					1. Mostrar cada conjunto
					2. Crea un clon del primer conjunto
					3. Comprueba si están los ciudadanosIBI en el conjunto clonado
					4. Obtén los ciudadanos que no estén en ciudadanosIBI
					5. Salir
					""");
			
			System.out.println("Elige una opción: ");
			int opcion = entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println(ciudadanos);
				System.out.println(ciudadanosIBI);
				break;
			case 2:
				HashSet<String> clon = new HashSet<>(ciudadanos);
				System.out.println("El conjunto clonado: " +clon);
				break;
			case 3:
				HashSet<String> clon2 = new HashSet<>(ciudadanos);
				ciudadanosIBI.containsAll(clon2);
				break;
			case 4:
				ciudadanos.removeAll(ciudadanosIBI);
				System.out.println(ciudadanos);
				break;
			case 5:
				System.out.println("Saliendo del programa");
				continuar = false;
				entrada.close();
				break;
			}
		}
	}
}
