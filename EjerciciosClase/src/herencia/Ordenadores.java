package herencia;

public class Ordenadores {
	String codigo;
	double precio;
	String eslogan;
	
	public Ordenadores(String codigo, double precio) {
		this.codigo = codigo;
		this.precio = precio;
		this.eslogan = "Calidad al mejor precio";
	}
	
	public Ordenadores(String codigo, double precio, String eslogan) {
        this.codigo = codigo;
        this.precio = precio;
        this.eslogan = eslogan;
    }

	public String getCodigo() {
		return codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEslogan() {
		return eslogan;
	}

	public void setEslogan(String eslogan) {
		this.eslogan = eslogan;
	}

	@Override
	public String toString() {
		return "Ordenadores codigo=" + codigo + ", precio=" + precio + ", eslogan=" + eslogan;
	}
}

class Portatiles extends Ordenadores {
	double peso;
	
	public Portatiles(String codigo, double precio, double peso) {
		super(codigo, precio, "Los más ligeros");
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Portatiles peso=" + peso + ", codigo=" + codigo + ", precio=" + precio + ", eslogan=" + eslogan;
	}
	
	
}

class Sobremesa extends Ordenadores {
	String descripcion;
	
	public Sobremesa(String codigo, double precio, String descripcion) {
		super(codigo, precio, "Los más potentes");
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Sobremesa descripcion=" + descripcion + ", codigo=" + codigo + ", precio=" + precio + ", eslogan="
				+ eslogan;
	}
	
}
