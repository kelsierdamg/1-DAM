package herencia;

public class Profesor {
	protected String nombre;
	protected int edad;
	protected int añosConsolidados;
	
	public Profesor(String nombre, int edad, int añosConsolidados) {
		this.nombre = nombre;
		this.edad = edad;
		this.añosConsolidados = añosConsolidados;
	}
	
	private String presentarse() {
		return "Hola soy "+nombre+" tengo"+edad+" y llevo "+añosConsolidados+" dando clase";
	}
	
	public final int cumplirAños() {
		return edad+1;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getEdad() {
		return edad;
	}

	protected void setEdad(int edad) {
		this.edad = edad;
	}

	protected int getAñosConsolidados() {
		return añosConsolidados;
	}

	protected void setAñosConsolidados(int añosConsolidados) {
		this.añosConsolidados = añosConsolidados;
	}
}
