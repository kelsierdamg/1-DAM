package bucles_3;

public class Ejercicio3 {
	public static void main(String[] args) {
		int edad = 10;
		int dinero = 500;
		
		do {
			dinero+=dinero*0.07;
			edad++;
		}
		while(dinero<=2500);
		
		System.out.println("Cuando consigas 2500€ tendrás " +edad+ " años");
	}

}
