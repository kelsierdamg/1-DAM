package clases_abstractas;

import java.util.ArrayList;

public class AppTienda {
	ArrayList<Hardware> productos;
	ArrayList<Pedido> pedidos;
	
	public AppTienda() {
		this.productos = new ArrayList<>();
		this.pedidos = new ArrayList<>();
	}
	
	public void mostrarMenu() {
		int opcion;
		do {
			opcion = MenuView.solicitarAccionDeMenu();
			
			switch(opcion) {
			case 1:
				Hardware nuevo = ProductoCrearView.crearProducto();
				productos.add(nuevo);
				System.out.println("Producto añadido correctamente");
				break;
			case 2:
				Pedido pedido = PedidoCrearView.crearPedido(productos);
				pedidos.add(pedido);
				System.out.println("Pedido creado correctamente");
				break;
			case 3:
				ProductoMostrarView.mostrarProductos(productos);
				break;
			case 4:
				PedidoMostrarView.mostrarPedidos(pedidos);
				break;
			case 5:
				System.out.println("Saliendo del programa");
				break;
			}
		} while(opcion!=5);
	}
}
