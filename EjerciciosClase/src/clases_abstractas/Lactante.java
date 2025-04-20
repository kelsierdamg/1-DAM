package clases_abstractas;

enum TipoLactancia {Directa, Mixta}

public class Lactante extends Infante {
	TipoLactancia tipoLactancia;
	
	public Lactante() {}
	
	public Lactante(TipoLactancia tipoLactancia) {
		this.tipoLactancia = tipoLactancia;
	}

	@Override
	public String hablar() {
		return "No sé hablar";
	}
	
	@Override
	public String comer() {
		if(tipoLactancia==TipoLactancia.Directa) {
			return "Tengo lactancia directa";
		}
		else {
			return "Tengo lactancia mixta";
		}
	}
}
