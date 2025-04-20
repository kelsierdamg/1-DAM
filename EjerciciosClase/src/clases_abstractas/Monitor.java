package clases_abstractas;

import java.util.ArrayList;

public class Monitor extends Hardware {
	double pulgadas;
	
	public Monitor() {}
	
	public Monitor(double precio, String descripcion, double pulgadas) {
		super(precio, descripcion);
		this.pulgadas = pulgadas;
	}
	
	public Monitor(double precio, String descripcion, ArrayList<Integer> valoraciones, ArrayList<Opinion> opiniones, double pulgadas) {
	    super(precio, descripcion, valoraciones, opiniones);
	    this.pulgadas = pulgadas;
	}

	@Override
	public String obtenerCaracteristicas() {
		return "Las pulgadas son" +pulgadas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nPulgadas: "+pulgadas;
	}
}
