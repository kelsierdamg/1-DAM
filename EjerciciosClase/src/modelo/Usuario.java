package modelo;

public class Usuario {
	int id;
	String nombre;
	String correo;
	int edad;
	
	public Usuario(int id, String nombre, String correo, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", edad=" + edad + "]";
	}
}
