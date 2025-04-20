package clases_abstractas;

public class Escolar extends Infante {
	String colegio;
	String[] deportes;
	
	public Escolar() {}
	
	public Escolar(String colegio) {
		this.colegio = colegio;
		this.deportes = new String[3];
	}

	@Override
	public String hablar() {
		return "Hablo muy bien";
	}
	
	public String estudioEn() {
		return "Estoy en el colegio "+colegio;
	}
	
	public String deportes() {
		return "Practico "+deportes[0]+ ", "+deportes[1]+ " y "+deportes[2];
	}
	
	public void setDeportes(String[] deportes) {
	    this.deportes = deportes;
	}
}
