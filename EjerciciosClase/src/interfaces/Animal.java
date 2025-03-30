package interfaces;

enum AnimalEspecie {PAVO, CABALLO, PÁJARO, GANSO, GALLINA, GALLO, PERRO, VACA, GATO};

public interface Animal {
	String onomatopeya();
	String getEspecie();
}
