package clases_abstractas;

import java.time.LocalDate;
import java.time.Period;

public abstract class Infante {
	String nombre;
	LocalDate fechaNacimiento;
	
	public Infante() {}
	
	public Infante(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String comer() {
		return "Estoy comiendo";
	}
	
	public String dormir() {
		return "Estoy durmiendo";
	}
	
	public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();
    }
	
	public abstract String hablar();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
}
