package clases_abstractas;

public class MainEjercicio2 {
	public static void main(String[] args) {
		try {
			Monitor monitor = new Monitor(299.99, "Asus 430", 27);
			Opinion opinion = new Opinion("Buena calidad", "userfake");
			monitor.agregarValoracion(4);
			monitor.agregarValoracion(5);
			monitor.agregarOpinion(opinion);
			monitor.agregarOpinion(opinion);
			System.out.println(monitor);
			
			System.out.println();
			
			DiscoDuro disco = new DiscoDuro(59.99, "Kingston 3500", 1);
			disco.agregarValoracion(5);
			disco.agregarValoracion(3);
			disco.agregarOpinion(opinion);
			disco.agregarOpinion(opinion);
			System.out.println(disco);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
