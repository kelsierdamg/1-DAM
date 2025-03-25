package conjuntos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	public static void main(String[] args) {
		HashSet<String> coches = new HashSet<String>();
		Scanner entrada = new Scanner(System.in);
		
		coches.add("Mercedes".toUpperCase());
		coches.add("Toyota".toUpperCase());
		coches.add("Aston Martin".toUpperCase());
		coches.add("Ferrari".toUpperCase());
		coches.add("Renault".toUpperCase());
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("""
					1. Mostrar las marcas existentes y el número de marcas que hay
					2. Consultar si una marca está en la colección
					3. Agregar una nueva marca a la colección
					4. Añadir 3 marcas a la colección
					5. Saca las marcas de coches ordenadas alfabéticamente
					6. Salir
					""");
			
			System.out.println("Elige una opción: ");
			int opcion = entrada.nextInt();
			switch(opcion) {
			case 1:
				System.out.println(coches);
				System.out.println(coches.size());
				break;
			case 2:
				System.out.println("Introduce la marca a buscar: ");
				String marca = entrada.next().toUpperCase();
				
				if(coches.contains(marca)) {
					System.out.println("La marca está en la colección");
				}
				else {
					System.out.println("La marca no está en la colección");
				}
				break;
			case 3:
				System.out.println("Introduce la marca a agregar a la colección: ");
				marca = entrada.next().toUpperCase();
				coches.add(marca);
				break;
			case 4:
				System.out.println("Introduce 3 marcas a agregar a la colección: ");
				String marca1 = entrada.next().toUpperCase();
				String marca2 = entrada.next().toUpperCase();
				String marca3 = entrada.next().toUpperCase();
				
				Collections.addAll(coches, marca1.toUpperCase(), marca2.toUpperCase(), marca3.toUpperCase());
				break;
			case 5:
				TreeSet<String> ordenado = new TreeSet<>(coches);
				System.out.println(ordenado);
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