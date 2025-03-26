package herencia;

public class Animal {
	int numChip;
	String nombre;
	
	public Animal(int numChip, String nombre) {
		this.numChip = numChip;
		this.nombre = nombre;
	}
	
	public String descripcion() {
		return "El nombre es " +nombre+ " y su número de chip es " +numChip;
	}

	public int getNumChip() {
		return numChip;
	}

	public void setNumChip(int numChip) {
		this.numChip = numChip;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

class Felino extends Animal {
	boolean arisco;
	
	public Felino(int numChip, String nombre, boolean arisco) {
		super(numChip, nombre);
		this.arisco = arisco;
	}
	
	public String descripcion() {
		if(arisco) {
			return "El nombre es " +nombre+ " su número de chip es " +numChip+ "y es arisco!!";
		}
		return "El nombre es " +nombre+ " y su número de chip es " +numChip;
	}

	public boolean isArisco() {
		return arisco;
	}

	public void setArisco(boolean arisco) {
		this.arisco = arisco;
	}
}

enum TipoPelo {
	DURO,
	RIZADO,
	CORTO,
	LARGO
}

class Canino extends Animal {
	TipoPelo tipoPelo;
	
	public Canino(int numChip, String nombre, TipoPelo tipoPelo) {
		super(numChip, nombre);
		this.tipoPelo = tipoPelo;
	}
	
	public String descripcion() {
		return "El número de chip es "+numChip+" -("+tipoPelo+") y su nombre es "+nombre;
	}

	public TipoPelo getTipoPelo() {
		return tipoPelo;
	}

	public void setTipoPelo(TipoPelo tipoPelo) {
		this.tipoPelo = tipoPelo;
	}
}
