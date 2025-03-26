package poo;

public class Meteo_ej12 {
	int temperatura;
	int humedad;
	int presion;
	
	public Meteo_ej12(int temperatura, int humedad, int presion) {
		this.temperatura = validarRango(temperatura, -10, 55);
        this.humedad = validarRango(humedad, 0, 100);
        this.presion = validarRango(presion, 1013, 2026);
	}
	
	public int validarRango(int valor, int minimo, int maximo) {
        return Math.max(Math.min(valor, maximo), minimo);
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
		Meteo_ej12 meteo = new Meteo_ej12(19, 70, 1200);
		
		System.out.println(meteo);
		System.out.println("Va a llover: " +meteo.probableLluvia());
		System.out.println("Habrá fuertes vientos: " +meteo.fuertesVientos());
	}

}
