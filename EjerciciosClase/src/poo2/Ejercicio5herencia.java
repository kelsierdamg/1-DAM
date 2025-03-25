package poo2;

import java.util.ArrayList;
import herencia.ProfesorEmerito;
import herencia.Profesor;
import herencia.Claustro;

public class Ejercicio5herencia {
	public static void main(String[] args) {
		ProfesorEmerito profe = new ProfesorEmerito("Juan Carlos", 80, 50, 1);
		
		System.out.println(profe.presentarse());
		// No funciona porque presentarse() es un método privado
		
		ArrayList<Profesor> lista = new ArrayList<>();
        lista.add(new Profesor("Jorge", 30, 5));
        lista.add(new ProfesorEmerito("Manuel", 55, 20, 5));

        Claustro claustro = new Claustro(lista);
        claustro.presentarProfesores(lista);
        // Esto funciona
        
        System.out.println(lista.get(0).getSalarioBase());
        /* Esto da error porque la lista es de tipo Profesor, y el método 
           getSalarioBase() solo existe en la clase ProfesorEmerito */
	}
}
