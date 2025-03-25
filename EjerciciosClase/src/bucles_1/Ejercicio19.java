package bucles_1;

public class Ejercicio19 {
	public static void main(String[] args) {
		OpcionesMenu[] opcionesE = OpcionesMenu.values();
		
		for(int i=0; i<opcionesE.length; i++) {
			System.out.println((i+1) +". "+ opcionesE[i]);
		}
	}

}
