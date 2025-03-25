package herencia;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
	public static void mostrarAriscos() {
		List<Animal> lista = new ArrayList<Animal>();
		lista.add(new Canino(58, "Arya", TipoPelo.LARGO));
		lista.add(new Canino(59, "Lesti", TipoPelo.RIZADO));
		lista.add(new Felino(27, "Michi", false));
		lista.add(new Felino(28, "Freyja", true));
		
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i) instanceof Felino) {
				Felino felino = (Felino) lista.get(i);
				if(felino.isArisco()) {
					System.out.println(felino.descripcion());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		mostrarAriscos();
	}
}
