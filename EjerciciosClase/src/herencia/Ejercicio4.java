package herencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Portatiles portatil = new Portatiles("A58", 399.99, 2.0);
		Sobremesa pc = new Sobremesa("B27", 899.99, "El último modelo para gaming");
		
		boolean continuar = true;
		while(continuar) {
			System.out.println(portatil);
			System.out.println(pc);
			System.out.println("""
					1. Modificar el peso del portátil
					2. Modificar el peso del portátil, aplicando un 10% de descuento
					3. Ver los datos del portátil
					4. Visualizar el código y el eslogan
					5. Modificar el tipo de torre y visualizar los datos del PC por pantalla
					6. Incrementar el precio del PC un 20%
					7. Recibir una lista de ordenadores y aplicar el descuento que pasemos a todos
					8. Salir
					""");
			
			System.out.println("Elige una opción: ");
			int opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce el nuevo precio: ");
				double precio = sc.nextDouble();
				
				portatil.setPrecio(precio);
				System.out.println("Nuevo precio establecido");
				break;
			case 2:
				portatil.setPrecio(portatil.precio-(0.1*portatil.precio));
				System.out.println("Nuevo precio establecido");
				break;
			case 3:
				System.out.println(portatil);
				break;
			case 4:
				System.out.println("Código y eslogan del portátil: ");
				System.out.print(portatil.getCodigo());
				System.out.print(portatil.getEslogan());
				break;
			case 5:
				System.out.println("Introduce la descripción que quieres poner en el PC: ");
				String descripcion = sc.next();
				
				pc.setDescripcion(descripcion);
				break;
			case 6:
				pc.setPrecio(pc.precio+(0.2*pc.precio));
				break;
			case 7:
				listaOrdenadores(sc);
				break;
			case 8:
				System.out.println("Saliendo del programa: ");
				sc.close();
				continuar = false;
				break;
			}
		}
	}
	
	public static void listaOrdenadores(Scanner sc) {
		List<Ordenadores> lista = new ArrayList<Ordenadores>();
		
		lista.add(new Ordenadores("C78", 499.99));
		lista.add(new Ordenadores("D46", 599.99));
		lista.add(new Ordenadores("T67", 899.99));
		lista.add(new Ordenadores("R89", 299.99));
		lista.add(new Ordenadores("Y32", 199.99));
		System.out.println(lista);
		
		System.out.println("Introduce el descuento a aplicar (entre 0 y 100): ");
		int descuento = sc.nextInt();
		
		lista.get(0).setPrecio(lista.get(0).precio-(descuento*lista.get(0).precio/100));
		lista.get(1).setPrecio(lista.get(1).precio-(descuento*lista.get(1).precio/100));
		lista.get(2).setPrecio(lista.get(2).precio-(descuento*lista.get(2).precio/100));
		lista.get(3).setPrecio(lista.get(3).precio-(descuento*lista.get(3).precio/100));
		lista.get(4).setPrecio(lista.get(4).precio-(descuento*lista.get(4).precio/100));
	}

}
