package excepciones;

import java.util.ArrayList;
import java.util.Scanner;

class ValoracionException extends Exception {
	private static final long serialVersionUID = 1L;

	public ValoracionException() {
		super();
	}
	
	public ValoracionException(String mensaje) {
		super(mensaje);
	}
}

class Hardware{
	Scanner entrada = new Scanner(System.in);
	private ArrayList<Integer> valoraciones;

    public Hardware() {
        valoraciones = new ArrayList<>();
    }
    
    public void agregarValoracion()throws ValoracionException {
    	System.out.println("Introduce una valoración:");
    	int valoracion = entrada.nextInt();
    	valoraciones.add(valoracion);
    	
    	if(valoracion<0||valoracion>10) {
    		throw new ValoracionException("Debe estar entre 0 y 10");
    	}
    }
    
    public int obtenerMedia() {
        int suma = 0;
        for (int i=0; i<valoraciones.size(); i++) {
            int valor = valoraciones.get(i);
            suma+=valor;
        }
        return suma / valoraciones.size();
    }
    
    public void mostrarInformacion() {
        System.out.println("Valoraciones: " + valoraciones);
        System.out.println("Media de valoraciones: " + obtenerMedia());
    }
}

class Monitor extends Hardware{
	public Monitor() {
		super();
	}
}

public class Ejercicio4 {
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		try {
			monitor.agregarValoracion();
			monitor.agregarValoracion();
			monitor.agregarValoracion();
		}
		catch(ValoracionException e) {
			System.out.println("Excepción: " +e.getMessage());
		}
		
		monitor.mostrarInformacion();
	}

}
