package bucles_1;

enum OpcionesMenu {
	NUEVO, ABRIR, GUARDAR, GUARDAR_COMO, CERRAR, SALIR
}

public class Ejercicio18 {
	public static void main(String[] args) {
		OpcionesMenu[] opcionesE = OpcionesMenu.values();
		for(int i=0; i<opcionesE.length; i++) {
			System.out.println(opcionesE[i]);
		}
	}

}
