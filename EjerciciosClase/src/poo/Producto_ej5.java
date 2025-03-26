package poo;

public class Producto_ej5 {
	String nombre;
	double precio;
	
	public Producto_ej5(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto_ej5(String nombre) {
		this.nombre = nombre;
		this.precio = 1.5;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public String creaEtiqueta() {
		return "["+nombre+": "+precio+"]";
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public static void main(String[] args) {
		Producto_ej5[] productos = new Producto_ej5[5];
		
		productos[0] = new Producto_ej5("Fresa", 2.5);
		productos[1] = new Producto_ej5("Melón", 5);
		productos[2] = new Producto_ej5("Manzana", 1);
		productos[3] = new Producto_ej5("Pera");
		productos[4] = new Producto_ej5("Kiwi");
		
		for(int i=0; i<productos.length; i++) {
			System.out.println(productos[i].creaEtiqueta());
		}
	}
}
