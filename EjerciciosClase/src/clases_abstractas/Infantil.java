package clases_abstractas;

public class Infantil extends Infante {
	String guarderia;
	boolean alergico;
	
	public Infantil() {}
	
	public Infantil(String guarderia, boolean alergico) {
		this.guarderia = guarderia;
		this.alergico = alergico;
	}

	@Override
	public String hablar() {
		return "Hablo con frases sencillas";
	}
	
	@Override
	public String comer() {
		if(alergico) {
			return "Cuidado que soy alérgico";
		}
		else {
			return "Estoy comiendo";
		}
	}
	
	public String estudioEn() {
		return "Estoy en la guardería "+guarderia;
	}
}
