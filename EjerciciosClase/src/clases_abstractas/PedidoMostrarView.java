package clases_abstractas;

import java.util.ArrayList;

public class PedidoMostrarView {
	public static void mostrarPedidos(ArrayList<Pedido> pedidos) {
		if(pedidos.isEmpty()) {
			System.out.println("No hay pedidos");
			return;
		}
		
		System.out.println("Lista de pedidos: ");
		for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(i + ". " + pedidos.get(i).imprimir());
        }
	}
}
