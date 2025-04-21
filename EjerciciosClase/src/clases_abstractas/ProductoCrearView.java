package clases_abstractas;

import java.util.Scanner;

public class ProductoCrearView {
	public static Hardware crearProducto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca 1 para crear un monitor, 2 para crear un disco duro: ");
		int opcion = sc.nextInt();
		
		if(opcion==1) {
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.next();
			System.out.println("Introduzca el precio: ");
			double precio = sc.nextDouble();
			System.out.println("Introduca las pulgadas: ");
			double pulgadas = sc.nextDouble();
			
			Monitor monitor = new Monitor(precio, nombre, pulgadas);
			return monitor;
		}
		else {
			System.out.println("Introduzca el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Introduzca el precio: ");
			double precio = sc.nextDouble();
			System.out.println();
			System.out.println("Introduca la capacidad: ");
			int capacidad = sc.nextInt();
			
			DiscoDuro disco = new DiscoDuro(precio, nombre, capacidad);
			return disco;
		}
	}
}
