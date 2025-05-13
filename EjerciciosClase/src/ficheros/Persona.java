package ficheros;

import java.io.Serializable;

public class Persona implements Serializable {
	private static final long serialVersionUID = 1L; 
	String dni;
	String nombre;
	int telefono;
	String direccion;
	double deuda;
	
	public Persona(String dni, String nombre, int telefono, String direccion, double deuda) {
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.deuda = deuda;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", deuda=" + deuda + "]";
	}
	
}
