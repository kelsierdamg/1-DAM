package herencia;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
	public static void main(String[] args) {
		List<Animal> lista = new ArrayList<Animal>();
		lista.add(new Canino(58, "Arya", TipoPelo.LARGO));
		lista.add(new Canino(59, "Lesti", TipoPelo.RIZADO));
		lista.add(new Felino(27, "Michi", false));
		lista.add(new Felino(28, "Freyja", true));
		
		System.out.println(lista.get(0).descripcion());
		System.out.println(lista.get(1).descripcion());
		System.out.println(lista.get(2).descripcion());
		System.out.println(lista.get(3).descripcion());
	}
}
