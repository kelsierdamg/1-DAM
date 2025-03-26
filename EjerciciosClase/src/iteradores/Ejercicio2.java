package iteradores;

import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<String> familia = new ArrayList<String>();
		familia.add("Jonny");
		familia.add("Mama");
		familia.add("Papa");
		familia.add("Pili");
		familia.add("Nora");
		
		Iterator<String> it = familia.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
