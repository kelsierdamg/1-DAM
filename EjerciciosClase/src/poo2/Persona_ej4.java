package poo2;

import poo.Persona_ej3;

public class Persona_ej4 {
	public static void main(String[] args) {
		Persona_ej3 persona1 = new Persona_ej3("Juan", 30);
		Persona_ej3 persona2 = new Persona_ej3(25);
		
		System.out.println(persona1.saludo());
		System.out.println(persona2.saludo());
	}
}
