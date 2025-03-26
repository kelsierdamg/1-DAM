package poo;

public class Persona_ej3 {
	String nombre;
	int edad;
	
	public String saludo() {
		return "Hola soy " +nombre+ " y tengo " +edad+ " años";
	}
	
	public Persona_ej3(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona_ej3(int edad) {
		this.edad = edad;
		this.nombre = "Anóninmo";
	}
}
