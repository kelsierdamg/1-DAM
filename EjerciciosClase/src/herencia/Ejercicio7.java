package herencia;

import java.util.ArrayList;

public class Ejercicio7 {
	public static void mostrarAriscos(ArrayList<Animal> lista) {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i) instanceof Felino) {
				Felino felino = (Felino) lista.get(i);
				if(felino.isArisco()) {
					System.out.println(felino.descripcion());
				}
			}
		}
	}
	
	public static void mostrarAnimalesPorTipo(ArrayList<Animal> lista, String tipo) {
		for(int i=0; i<lista.size(); i++) {
			if(tipo.equalsIgnoreCase("felino") && lista.get(i) instanceof Felino) {
				System.out.println(lista.get(i).descripcion());
			}
			else if(tipo.equalsIgnoreCase("canino") && lista.get(i) instanceof Canino) {
				System.out.println(lista.get(i).descripcion());
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Animal> lista = new ArrayList<Animal>();
		lista.add(new Canino(58, "Arya", TipoPelo.LARGO));
		lista.add(new Canino(59, "Lesti", TipoPelo.RIZADO));
		lista.add(new Felino(27, "Michi", false));
		lista.add(new Felino(28, "Freyja", true));
		
		System.out.println("Felinos ariscos");
		mostrarAriscos(lista);
		
		System.out.println("Solo felinos");
		mostrarAnimalesPorTipo(lista, "felino");
		
		System.out.println("Solo caninos");
		mostrarAnimalesPorTipo(lista, "canino");
	}
}
