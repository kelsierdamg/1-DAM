package conjuntos;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashSet<String> ciudades1 = new HashSet<String>();
		HashSet<String> ciudades2 = new HashSet<String>();
		
		ciudades1.add("Madrid".toUpperCase());
		ciudades1.add("Berlín".toUpperCase());
		ciudades1.add("París".toUpperCase());
		ciudades1.add("Londres".toUpperCase());
		ciudades2.add("Madrid".toUpperCase());
		ciudades2.add("Manchester".toUpperCase());
		ciudades2.add("Dublín".toUpperCase());
		ciudades2.add("Nueva York".toUpperCase());
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("""
					1. Clonar el primer conjunto de ciudades
					2. Crear un único conjunto con todas las ciudades
					3. Borrar del conjunto1 las ciudades que aparezcan en conjunto2
					4. Indicar si en conjunto2 se contiene determinado conjunto
					5. Indicar que ciudades están en ambos conjuntos
					""");
			
			System.out.println("Elige una opción: ");
			int opcion = entrada.nextInt();
			switch(opcion) {
			case 1:
				HashSet<String> clon = new HashSet<>(ciudades1);
				System.out.println("El conjunto de ciudades1 clonado es: " +clon);
				break;
			case 2:
				HashSet<String> conjuntoUnido = new HashSet<>(ciudades1);
				conjuntoUnido.addAll(ciudades2);
				
				System.out.println(conjuntoUnido);
				break;
			case 3:
				ciudades1.removeAll(ciudades2);
				System.out.println(ciudades1);
				break;
			case 4:
				System.out.println("Introduce dos ciudades para buscar");
				String ciudad1 = entrada.next();
				String ciudad2 = entrada.next();
				
				if(ciudades2.contains(ciudad1) && ciudades2.contains(ciudad2)) {
					System.out.println("Contiene ambas ciudades");
				}
				else {
					System.out.println("No contiene ambas ciudades");
				}
				break;
			case 5:
				System.out.println(ciudades1.containsAll(ciudades2));
				break;
			case 6:
				System.out.println("Saliendo del programa");
				continuar = false;
				entrada.close();
				break;
			}
		}
	}
}
