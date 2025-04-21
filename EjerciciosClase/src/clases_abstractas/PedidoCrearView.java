package clases_abstractas;

import java.util.ArrayList;
import java.util.Scanner;

public class PedidoCrearView {
	public static Pedido crearPedido(ArrayList<Hardware> productos) {
		Pedido pedido = new Pedido();
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		
		while(continuar) {
			for(int i=0; i<productos.size(); i++) {
				System.out.println(productos.get(i));
			}
			System.out.println("Escoja el índice del producto que quiera: ");
			int indice = sc.nextInt();
			System.out.println("¿Cuántas unidades?");
			int unidades = sc.nextInt();
			
			LineaPedido linea = new LineaPedido(productos.get(indice), unidades);
			pedido.agregarLinea(productos.get(indice), unidades);
			
			System.out.println("¿Quiere seguir añadiendo productos? (s/n)");
			String respuesta = sc.next();
			
			if(!respuesta.equalsIgnoreCase("s")) {
				continuar = false;
			}
		}
		return pedido;
	}

}
