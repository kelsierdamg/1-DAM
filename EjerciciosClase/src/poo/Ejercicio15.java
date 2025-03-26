package poo;

import java.util.Random;

public class Ejercicio15 {
	public Producto_ej5 producto;
	int cantidad;
	
	public Ejercicio15(Producto_ej5 producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	public double getSubtotal() {
		return cantidad*producto.getPrecio();
	}
	
	@Override
	public String toString() {
		return String.format("%-10d %-10s %-10.2f %-10.2f", cantidad, producto.getNombre(), producto.getPrecio(), getSubtotal());
	}

	public static void main(String[] args) {
		Random random = new Random();
		
		System.out.println("PEDIDO REALIZADO");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Uds.", "Producto", "Precio", "Subtotal");
		System.out.println("----------------------------------------");
		for (int i = 0; i <= 4; i++) {
			String[] nombres = {"Fresa", "Melón", "Sandía", "Plátano", "Manzana"}; 
            String nombre = nombres[random.nextInt(nombres.length)];
            double precio = Math.round(random.nextDouble(0, 100)); 
            int cantidad = random.nextInt(0, 10); 
            
            Producto_ej5 producto = new Producto_ej5(nombre, precio);
            Ejercicio15 pedido = new Ejercicio15(producto, cantidad);
            
            System.out.println(pedido);
            System.out.println();
        }
	}
}
