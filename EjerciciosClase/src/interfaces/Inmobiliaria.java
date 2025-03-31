package interfaces;

interface Piso {
	String getMensajeDerechoPiscina();
	String getMensajeMobiliario();
	String descripcion();
}

enum LetraVivienda {A, B, C, D}
enum Mobiliario {Sofá, Televisor, Nevera, Cama, Lavabo}

public class Inmobiliaria implements Piso {
	int numPortal;
	int numPlanta;
	LetraVivienda letraVivienda;
	short m2;
	Mobiliario mobiliario;
	boolean piscina;
	
	public Inmobiliaria(int numPortal, int numPlanta, short m2, LetraVivienda letraVivienda) {
		this.numPortal=numPortal;
		this.numPlanta=numPlanta;
		this.m2=m2;
		this.letraVivienda=letraVivienda;
	}

	@Override
	public String getMensajeDerechoPiscina() {
		if(letraVivienda.equals(LetraVivienda.A)) {
			piscina=false;
			return "No se tiene derecho a piscina";
		}
		else if(letraVivienda.equals(LetraVivienda.B)) {
			piscina=false;
			return "No se tiene derecho a piscina";
		}
		else if(letraVivienda.equals(LetraVivienda.C)) {
			piscina=true;
			return "Se tiene derecho a piscina";
		}
		else {
			piscina=true;
			return "Se tiene derecho a piscina";
		}
	}

	@Override
	public String getMensajeMobiliario() {
		if(letraVivienda.equals(LetraVivienda.A)) {
			return "El piso viene con "+Mobiliario.Nevera+" y "+Mobiliario.Lavabo;
		}
		else if(letraVivienda.equals(LetraVivienda.B)) {
			return "El piso viene con "+Mobiliario.Sofá+" y "+Mobiliario.Televisor;
		}
		else if(letraVivienda.equals(LetraVivienda.C)) {
			return "El piso viene con "+Mobiliario.Cama+" y "+Mobiliario.Nevera;
		}
		else {
			return "El piso viene con todo: "+Mobiliario.values();
		}
	}

	@Override
	public String descripcion() {
	    return String.format(
	        "Portal: %d\nPlanta: %d\nLetra: %s\nMetros cuadrados: %d\nMobiliario: %s\nPiscina: %s",
	        numPortal, numPlanta, letraVivienda, m2, getMensajeMobiliario(), getMensajeDerechoPiscina()
	    );
	}
	
	public static void main(String[] args) {
		Inmobiliaria piso1 = new Inmobiliaria(1, 5, (short) 100, LetraVivienda.D);
		System.out.println(piso1.descripcion());
		System.out.println();
		
		Inmobiliaria piso2 = new Inmobiliaria(1, 3, (short) 70, LetraVivienda.C);
		System.out.println(piso2.descripcion());
		System.out.println();
		
		Inmobiliaria piso3 = new Inmobiliaria(1, 2, (short) 50, LetraVivienda.B);
		System.out.println(piso3.descripcion());
		System.out.println();
		
		Inmobiliaria piso4 = new Inmobiliaria(1, 4, (short) 60, LetraVivienda.A);
		System.out.println(piso4.descripcion());
		System.out.println();
		
		Inmobiliaria piso5 = new Inmobiliaria(1, 6, (short) 70, LetraVivienda.C);
		System.out.println(piso5.descripcion());
		System.out.println();
	}
}
