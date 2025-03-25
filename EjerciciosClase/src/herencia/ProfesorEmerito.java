package herencia;

public final class ProfesorEmerito extends Profesor {
	private int añosEmerito;
		
	public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
		super(nombre, edad, añosConsolidados);
		this.añosEmerito = añosEmerito;
	}

	private int getAñosEmerito() {
		return añosEmerito;
	}

	private void setAñosEmerito(int añosEmerito) {
		this.añosEmerito = añosEmerito;
	}
		
	public double getSalarioBase() {
		return (925+añosConsolidados*33.25+47.80*añosEmerito);
	}
}
