package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		List<String> casas = new ArrayList<String>();
		casas.add("Madrid");
		casas.add("Zaragoza");
		casas.add("Lugo");
		casas.add("Murcia");
		
		List<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		System.out.println("---Menú---");
		System.out.println("1. Indicar si la lista tiene un determinado nombre");
		System.out.println("2. Indicar la primera vez que aparece un nombre");
		System.out.println("3. Indicar la última vez que aparece un nombre");
		System.out.println("4. Eliminar un nombre de la lista");
		System.out.println("5. Devuelve una porción de la lista");
		System.out.println("6. Junta dos listas y muestra la unión");
		System.out.println("7. Indica si dos listas son iguales");
		System.out.println("8. Borra todos los nombres de la lista");
		
		System.out.println("Elige una opción: ");
		int opcion = entrada.nextInt();
		
		switch(opcion) {
		case 1:
			determinadoNombre(familia, entrada);
			break;
		case 2:
			primeraVez(familia, entrada);
			break;
		case 3:
			ultimaVez(familia, entrada);
			break;
		case 4:
			eliminarNombre(familia, entrada);
			break;
		case 5:
			devolverPorcion(familia, entrada);
			break;
		case 6:
			juntarListas(familia, casas);
			break;
		case 7:
			listasIguales(familia, casas);
			break;
		}
	}
	
	public static void determinadoNombre(List<String> familia, Scanner entrada) {
		System.out.println("Introduce el nombre: ");
		String nombre = entrada.next();
		
		if(familia.contains(nombre)) {
			System.out.println(nombre+ " está en la lista");
		}
		else {
			System.out.println(nombre+ " no está en la lista");
		}
	}
	
	public static void primeraVez(List<String> familia, Scanner entrada) {
		System.out.println("Introduce el nombre: ");
		String nombre = entrada.next();
		
		int index = familia.indexOf(nombre);
		if(index != -1) {
			System.out.println(nombre+ " está en la posición " +index);
		}
		else {
			System.out.println(nombre+ " no está en la lista");
		}
	}
	
	public static void ultimaVez(List<String> familia, Scanner entrada) {
		System.out.println("Introduce el nombre: ");
		String nombre = entrada.next();
		
		int index = familia.lastIndexOf(nombre);
		if(index != -1) {
			System.out.println(nombre+ " está en la posición " +index);
		}
		else {
			System.out.println(nombre+ " no está en la lista");
		}
	}
	
	public static void eliminarNombre(List<String> familia, Scanner entrada) {
		System.out.println("Introduce el nombre: ");
		String nombre = entrada.next();
	
		familia.remove(nombre);
		System.out.println(nombre+ " ha sido eliminado de la lista");
	}
	
	public static void devolverPorcion(List<String> familia, Scanner entrada) {
		System.out.println("Introduce dos números entre los que devolver: ");
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		
		for(int i=num1; i<=num2; i++) {
			System.out.println(familia.get(i));
		}
	}
	
	public static void juntarListas(List<String> familia, List<String> casas) {
		List<String> listaUnida = new ArrayList<>(familia);
		listaUnida.addAll(casas);
		
		System.out.println(listaUnida);
	}
	
	public static void listasIguales(List<String> familia, List<String> casas) {
		if(familia.equals(casas)) {
			System.out.println("Las listas son iguales");
		}
		else {
			System.out.println("Las listas no son iguales");
		}
	}
	
	public static void borrarTodo(List<String> familia, List<String> casas, Scanner entrada) {
		System.out.println("Elige una lista para borrar (1 familia, 2 casas): ");
		int num = entrada.nextInt();
		
		if(num==1) {
			familia.clear();
			System.out.println("Familia ha sido borrada");
		}
		else if(num==2) {
			casas.clear();
			System.out.println("Casas ha sido borrada");
		}
	}
}
