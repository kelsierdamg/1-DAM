package clases_abstractas;

public class LineaPedido {
	Hardware producto;
	int unidadesCompradas;
	
	public LineaPedido() {}
	
	public LineaPedido(Hardware producto, int unidadesCompradas) {
		this.producto = producto;
		this.unidadesCompradas = unidadesCompradas;
	}
	
	public Hardware getProducto() {
		return producto;
	}

	public void setProducto(Hardware producto) {
		this.producto = producto;
	}

	public int getUnidadesCompradas() {
		return unidadesCompradas;
	}

	public void setUnidadesCompradas(int unidadesCompradas) {
		this.unidadesCompradas = unidadesCompradas;
	}

	public double getSubtotal() {
		return unidadesCompradas*producto.getPrecio();
	}
	
	public String imprimir() {
		return unidadesCompradas+"     "+producto.getDescripcion()+"     "+producto.getPrecio()+"     "+getSubtotal();
	}
}
