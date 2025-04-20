package clases_abstractas;

import java.util.ArrayList;

public class DiscoDuro extends Hardware {
	int capacidad;
	
	public DiscoDuro() {}
	
	public DiscoDuro(double precio, String descripcion, int capacidad) {
		super(precio, descripcion);
		this.capacidad = capacidad;
	}
	
	public DiscoDuro(double precio, String descripcion, ArrayList<Integer> valoraciones, ArrayList<Opinion> opiniones, int capacidad) {
	    super(precio, descripcion, valoraciones, opiniones);
	    this.capacidad = capacidad;
	}

	@Override
	public String obtenerCaracteristicas() {
		return "La capacidad del disco duro es de "+capacidad+"TB";
	}

	@Override
	public String toString() {
		return super.toString()+"\nCapacidad: "+capacidad+"TB";
	}
}
