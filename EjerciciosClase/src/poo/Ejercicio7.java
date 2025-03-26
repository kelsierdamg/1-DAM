package poo;

import java.util.Scanner;

public class Ejercicio7 {
	String nombre;
	int edad;
	
	public Ejercicio7(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String presentacion() {
		return "Hola soy " +nombre+ " y tengo " +edad+ " años";
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Ejercicio7[] personas = new Ejercicio7[10];
		
		for(int i=0; i<personas.length; i++) {
			System.out.println("Introduce el nombre y la edad de la "+i+" persona");
			String nombre = entrada.next();
			int edad = entrada.nextInt();
			personas[i] = new Ejercicio7(nombre, edad);
		}
		
		for(int i=0; i<personas.length; i++) {
			System.out.println(personas[i].presentacion());
		}
		entrada.close();
	}
}
