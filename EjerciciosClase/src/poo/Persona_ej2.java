package poo;

public class Persona_ej2 {
	String nombre;
	int edad;
	
	public String saludo() {
		return "Hola soy " +nombre+ " y tengo " +edad+ " años";
	}
	
	public Persona_ej2(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

}
