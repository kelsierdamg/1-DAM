package clases_abstractas;

public class Ejercicio3 {
	public static void main(String[] args) {
		System.out.println("Información sobre nuestros productos");
		System.out.println("------------------------------------------");
		Monitor gaming = new Monitor(300, "Monitor gaming", 27);
		Monitor oficina = new Monitor(100, "Monitor oficina", null, null, 23);
		DiscoDuro HDD = new DiscoDuro(30, "Disco HDD", 1);
		DiscoDuro SSD = new DiscoDuro(100, "Disco SSD", null, null, 1);
		Opinion op1 = new Opinion("Buena calidad", "userfake");
		Opinion op2 = new Opinion("Buen color", "usertroll");
		Opinion op3 = new Opinion("Buena memoria", "user58");
		Opinion op4 = new Opinion("Muy rápido", "user69");
		try {
			gaming.agregarValoracion(4);
			gaming.agregarValoracion(5);
			gaming.agregarOpinion(op1);
			oficina.agregarValoracion(4);
			oficina.agregarValoracion(6);
			oficina.agregarOpinion(op2);
			HDD.agregarValoracion(7);
			HDD.agregarValoracion(8);
			HDD.agregarOpinion(op3);
			SSD.agregarValoracion(9);
			SSD.agregarValoracion(10);
			SSD.agregarOpinion(op4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(gaming);
		System.out.println("\n"+oficina);
		System.out.println("\n"+HDD);
		System.out.println("\n"+SSD);
	}
}
