package clases_abstractas;

public class MainEjercicio4 {
	public static void main(String[] args) {
		Monitor monitor = new Monitor(249.99, "Monitor OLED", 27);
		
		Opinion o = new Opinion("Buena calidad", "userfake");
		monitor.agregarOpinion(o);
		
		System.out.println("Antes de cambiar la opinión:");
		System.out.println(monitor);
		
		monitor.modificarOpinion(0, "Muy fluido");
		
		System.out.println("\nDespués de modificar la opinión: ");
		System.out.println(monitor);
	}

}
