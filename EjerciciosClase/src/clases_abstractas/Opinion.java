package clases_abstractas;

import java.time.LocalDate;

public class Opinion {
	LocalDate fecha;
	String texto;
	String usuario;
	
	public Opinion() {}
	
	public Opinion(String texto, String usuario) {
		this.fecha = LocalDate.now();
		this.texto = texto;
		this.usuario = usuario;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Fecha: "+fecha+" | Texto: "+texto+" | Usuario: "+usuario;
	}
}
