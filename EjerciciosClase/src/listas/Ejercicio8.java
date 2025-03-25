package listas;

import java.util.ArrayList;
import java.util.Scanner;

class Producto{
	String nombre;
	double precio;
	int cantidad;
	
	public Producto(String nombre, int cantidad, double precio) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public double Subtotal() {
		return cantidad*precio;
	}
	
}
public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Producto> compras = new ArrayList<>();
		
		while(true) {
			System.out.println("¿Qué producto quiere comprar?");
			String nombre = entrada.next();
			
			System.out.println("¿Qué cantidad quiere?");
			int cantidad = entrada.nextInt();
			
			System.out.println("¿Qué precio tiene?");
			double precio = entrada.nextDouble();
			
			compras.add(new Producto(nombre, cantidad, precio));
			
			System.out.println("¿Quiere agregar otro producto?(s/n)");
			String respuesta = entrada.next();
			
			if(respuesta.equalsIgnoreCase("n")) {
				break;
			}
		}
		
		System.out.println("---FACTURA---");
		System.out.printf("%-10s %-10s %-10s\n", "Nombre", "Uds.", "Precio", "Subtotal");
		System.out.println("----------------------------------------");
		double total = 0;
		
		for(int i=0; i<compras.size(); i++) {
			Producto pr = compras.get(i);
			System.out.printf("%-10s %-10d %-10.2f %-10.2f\n", pr.nombre, pr.cantidad, pr.precio, pr.Subtotal());
			total += pr.Subtotal();
		}
		
		System.out.println("----------------------------------------");
		System.out.printf("TOTAL: %.2f", total);
		
		entrada.close();
	}
}
