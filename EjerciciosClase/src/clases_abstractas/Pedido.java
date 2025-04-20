package clases_abstractas;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Pedido {
	ArrayList<LineaPedido> lineas;
	LocalDateTime horaPedido;
	
	public Pedido() {
		this.lineas = new ArrayList<>();
		this.horaPedido = LocalDateTime.now();
	}
	
	public double total() {
		double total = 0;
		for(int i=0; i<lineas.size(); i++) {
			LineaPedido linea = lineas.get(i);
			total+=linea.getSubtotal();
		}
		return total;
	}
	
	public void agregarLinea(Hardware h, int u) {
		for(int i=0; i<lineas.size(); i++) {
			LineaPedido linea = lineas.get(i);
			if(linea.getProducto().equals(h)) {
				u++;
			}
		}
		lineas.add(new LineaPedido(h, u));
	}
	
	public String imprimir() {
		String resultado = "";
		for(int i=0; i<lineas.size(); i++) {
			resultado+=lineas.get(i).imprimir()+"\n";
		}
		resultado+="\nTOTAL: "+total()+" euros";
		return resultado;
	}
}
