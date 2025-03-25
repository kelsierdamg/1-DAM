package poo;

import java.util.Random;

public class LineaPedido_ej14 {
	public Producto_ej5 producto;
	int cantidad;
	
	public LineaPedido_ej14(Producto_ej5 producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public double getSubtotal() {
		return cantidad*producto.getPrecio();
	}
	
	@Override
	public String toString() {
		return "Unidades: "+cantidad+" Nombre: "+producto.getNombre()+" Precio: "+producto.getPrecio()+" Subtotal: "+getSubtotal();
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		for (int i = 0; i <= 4; i++) {
			String[] nombres = {"Fresa", "Melón", "Sandía", "Plátano", "Manzana"}; 
            String nombre = nombres[random.nextInt(nombres.length)];
            double precio = random.nextDouble(0, 100); 
            int cantidad = random.nextInt(0, 10); 
            
            Producto_ej5 producto = new Producto_ej5(nombre, precio);
            LineaPedido_ej14 pedido = new LineaPedido_ej14(producto, cantidad);
            
            System.out.println(pedido);
        }
	}
}
