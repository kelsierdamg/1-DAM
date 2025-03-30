package interfaces;

public class Ejercicio6 {
	public static void main(String[] args) {
		Gallo gallo = new Gallo();
		System.out.println(gallo.getEspecie());
	}
}

class Perro implements Animal {
	AnimalEspecie especie;
	
	public Perro() {
		this.especie = AnimalEspecie.PERRO;
	}
	
	@Override
	public String onomatopeya() {
		return "Guau, guau";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Gato implements Animal {
	AnimalEspecie especie;
	
	public Gato() {
		this.especie = AnimalEspecie.GATO;
	}
	
	@Override
	public String onomatopeya() {
		return "Miau";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Ganso implements Animal {
	AnimalEspecie especie;
	
	public Ganso() {
		this.especie = AnimalEspecie.GANSO;
	}
	
	@Override
	public String onomatopeya() {
		return "On, on";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Vaca implements Animal {
	AnimalEspecie especie;
	
	public Vaca() {
		this.especie = AnimalEspecie.VACA;
	}
	
	@Override
	public String onomatopeya() {
		return "Muu, muu";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Caballo implements Animal {
	AnimalEspecie especie;
	
	public Caballo() {
		this.especie = AnimalEspecie.CABALLO;
	}
	
	@Override
	public String onomatopeya() {
		return "Hiii";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Gallina implements Animal {
	AnimalEspecie especie;
	
	public Gallina() {
		this.especie = AnimalEspecie.GALLINA;
	}
	
	@Override
	public String onomatopeya() {
		return "Co, co, co";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Pavo implements Animal {
	AnimalEspecie especie;
	
	public Pavo() {
		this.especie = AnimalEspecie.PAVO;
	}
	
	@Override
	public String onomatopeya() {
		return "Glu, glu";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Pajaro implements Animal {
	AnimalEspecie especie;
	
	public Pajaro() {
		this.especie = AnimalEspecie.PÁJARO;
	}
	
	@Override
	public String onomatopeya() {
		return "Pío, pío";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}

class Gallo implements Animal {
	AnimalEspecie especie;
	
	public Gallo() {
		this.especie = AnimalEspecie.GALLO;
	}
	
	@Override
	public String onomatopeya() {
		return "Quiquiriqui";
	}

	@Override
	public String getEspecie() {
		return especie.toString();
	}
}
