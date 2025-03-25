package herencia;

import java.util.ArrayList;

public class Claustro {
		private ArrayList<Profesor> lista;
		
		public Claustro(ArrayList<Profesor> lista) {
	        this.lista = lista;
	    }
	
	public void presentarProfesores(ArrayList<Profesor> lista) {
		for(int i=0; i<lista.size(); i++) {
			System.out.println("Hola soy "+lista.get(i).nombre+ " y tengo "+lista.get(i).edad+ " años");
		}
	}
}
