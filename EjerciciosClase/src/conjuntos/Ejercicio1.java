package conjuntos;

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		HashSet<String> compra = new HashSet<String>();
		compra.add("Galletas".toUpperCase());
		compra.add("Leche".toUpperCase());
		compra.add("Cereales".toUpperCase());
		compra.add("Chocolate".toUpperCase());
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("""
	                              MENÚ
	            -----------------------------------------
	            1. Saber si la lista contiene un producto
	            2. Agregar producto
	            3. Eliminar producto
	            4. Mostrar toda la cesta de productos
	            5. Borrar cesta
	            0. Salir
	            """);
			
		   System.out.println("Elige una opción: ");
           int opcion = entrada.nextInt();
           switch(opcion) {
           case 1:
        	   System.out.println("Introduce el elemento que buscas: ");
        	   String busqueda = entrada.next();
        	   
        	   if(compra.contains(busqueda.toUpperCase())) {
        		   System.out.println("La lista contiene " +busqueda);
        	   }
        	   else {
        		   System.out.println("La lista no contiene " +busqueda);
        	   }
        	   break;
           case 2:
        	   System.out.println("Introduce el producto que quiere agregar");
        	   String producto = entrada.next();
        	   compra.add(producto.toUpperCase());
        	   break;
           case 3:
        	   System.out.println("Introduce el producto que quiere eliminar: ");
        	   producto = entrada.next();
        	   
        	   if(compra.contains(producto)) {
        		   compra.remove(producto);
        	   }
        	   else {
        		   System.out.println("La lista no contiene ese elemento");
        	   }
        	   break;
           case 4:
        	   System.out.println(compra);
        	   break;
           case 5:
        	   System.out.println("Borrando lista");
        	   compra.clear();
        	   break;
           case 0:
        	   System.out.println("Saliendo del programa");
        	   continuar = false;
        	   entrada.close();
        	   break;
           }
		}
	}
}
