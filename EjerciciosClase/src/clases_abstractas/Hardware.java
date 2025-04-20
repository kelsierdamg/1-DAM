package clases_abstractas;

import java.util.ArrayList;

public abstract class Hardware {
	double precio;
	String descripcion;
	ArrayList<Integer> valoraciones;
	/*La estructura de esta clase no es como pone en elejercicio ya que
	 * esta cambiada para hacer el ejercicio 4*/
	ArrayList<Opinion> opiniones;
	
	public Hardware() {}
	
	public Hardware(double precio, String descripcion, ArrayList<Integer> valoraciones, ArrayList<Opinion> opiniones) {
		this.precio = precio;
		this.descripcion = descripcion;
		this.valoraciones = (valoraciones!=null ? valoraciones : new ArrayList<>());
		this.opiniones = (opiniones!=null ? opiniones : new ArrayList<>());
	}
	
	public Hardware(double precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
		this.valoraciones = new ArrayList<>();
		this.opiniones = new ArrayList<>();
	}
	
	public void agregarValoracion(int v) throws Exception {
		if(v<1 || v>10) {
			throw new Exception("Debe estar entre 1 y 10");
		}
		else {
			valoraciones.add(v);
		}
	}
	
	public double mediaValoraciones() {
		int suma = 0;
		for(int i=0; i<valoraciones.size(); i++) {
			suma+=valoraciones.get(i);
		}
		return (double) suma/valoraciones.size();
	}
	
	public void agregarOpinion(Opinion o) {
		opiniones.add(o);
	}
	
	public String consultarOpiniones() {
		return opiniones.toString();
	}
	
	public boolean modificarOpinion(int indice, String o) {
		if(indice>=opiniones.size()) {
			System.out.println("No se ha podido modificar");
			return false;
		}
		else {
			opiniones.get(indice).setTexto(o);
			System.out.println("Se ha modificado la opinión en el índice" +indice);
			return true;
		}
	}
	
	public abstract String obtenerCaracteristicas();

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Precio: " +precio+"\nDescripción: "+descripcion+"\nMedia de sus valoraciones: "+mediaValoraciones()+"\nOpiniones: "+consultarOpiniones();
	}
}
