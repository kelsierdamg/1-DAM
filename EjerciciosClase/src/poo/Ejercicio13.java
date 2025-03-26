package poo;

import java.util.Random;

public class Ejercicio13 {
	int temperatura;
	int humedad;
	int presion;
	
	public Ejercicio13(int temperatura, int humedad, int presion) {
		this.temperatura = validarRango(temperatura, -10, 55);
        this.humedad = validarRango(humedad, 0, 100);
        this.presion = validarRango(presion, 1013, 2026);
	}
	
	public int validarRango(int valor, int minimo, int maximo) {
        return Math.max(Math.min(valor, maximo), minimo);
        /* Math.min(valor, maximo): Si el valor ingresado es mayor que el máximo permitido, se devuelve el máximo.
        Math.max(resultado, minimo): Si el valor es menor que el mínimo permitido, se devuelve el mínimo.
        Si el valor está dentro del rango, se devuelve tal cual. */
    }
	
	public boolean probableLluvia() {
		if(temperatura>10 && humedad>65 && presion<1650) {
			return true;
		}
		return false;
	}
	
	public boolean fuertesVientos() {
		if(temperatura<25 && temperatura>15 && humedad<80 && humedad>40 && presion>1050) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int temperatura = random.nextInt(-10, 55); 
            int humedad = random.nextInt(0, 100); 
            int presion = random.nextInt(1013, 2026); 
            
            Ejercicio13 meteo = new Ejercicio13(temperatura, humedad, presion);
            
            System.out.println("Parte nº"+(i+1));
            System.out.print("T: "+temperatura+" H: "+humedad+" P: "+presion);
            System.out.print(" Lluvias: "+meteo.probableLluvia());
            System.out.println(" Vientos: "+meteo.fuertesVientos());
        }
	}
}
