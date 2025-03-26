package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
	String nombre;
	int edad;
	
	public Ejercicio8(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String presentacion() {
		return "Hola soy " +nombre+ " y tengo " +edad+ " años";
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Ejercicio8> personas = new ArrayList<Ejercicio8>();
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("Introduce el nombre y la edad (salir para parar de introducir nombres): ");
			String nombre = entrada.next();
			int edad = entrada.nextInt();
			personas.add(new Ejercicio8(nombre, edad));
			
			if(nombre.equalsIgnoreCase("salir")) {
				continuar = false;
				break;
			}
		}
		
		for(int i=0; i<personas.size(); i++) {
			System.out.println(personas.get(i).presentacion());
		}
		entrada.close();
	}
}
