package clases_abstractas;

import java.util.ArrayList;

public class ProductoMostrarView {
	public static void mostrarProductos(ArrayList<Hardware> productos) {
		if(productos.isEmpty()) {
			System.out.println("No hay productos disponibles");
			return;
		}
		
		System.out.println("Lista de productos: ");
		for (int i = 0; i < productos.size(); i++) {
            System.out.println(i + ". " + productos.get(i));
        }
	}
}
