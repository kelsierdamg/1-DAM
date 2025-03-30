package interfaces;

import java.util.HashMap;

public class SonidosAnimalesApp {
	public static void recorrerDiccionario(HashMap<AnimalEspecie, Animal> animales) {
		AnimalEspecie[] especies = AnimalEspecie.values();
		for(int i=0; i<especies.length; i++) {
			System.out.println("La onomatopeya del animal '"+especies[i]+"' es "+animales.get(especies[i]).onomatopeya());
		}
	}
	
	public static void main(String[] args) {
		HashMap<AnimalEspecie, Animal> animales = new HashMap<>();
		
		Perro perro = new Perro();
		Pavo pavo = new Pavo();
		Gato gato = new Gato();
		Caballo caballo = new Caballo();
		Ganso ganso = new Ganso();
		Pajaro pajaro = new Pajaro();
		Vaca vaca = new Vaca();
		Gallo gallo = new Gallo();
		Gallina gallina = new Gallina();
		
		animales.put(AnimalEspecie.PERRO, perro);
		animales.put(AnimalEspecie.PAVO, pavo);
		animales.put(AnimalEspecie.GATO, gato);
		animales.put(AnimalEspecie.CABALLO, caballo);
		animales.put(AnimalEspecie.GANSO, ganso);
		animales.put(AnimalEspecie.PÁJARO, pajaro);
		animales.put(AnimalEspecie.VACA, vaca);
		animales.put(AnimalEspecie.GALLO, gallo);
		animales.put(AnimalEspecie.GALLINA, gallina);
		
		recorrerDiccionario(animales);
	}
}
