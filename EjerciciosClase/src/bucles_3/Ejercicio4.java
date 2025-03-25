package bucles_3;

public class Ejercicio4 {
	public static void main(String[] args) {
		int edad = 10;
		int dinero = 500;
		
		do {
			dinero+=400;
			dinero+=dinero*0.07;
			edad++;
		}
		while(dinero<=2500);
		
		System.out.println("Tendrás "+dinero+ " € a los " +edad+ " años");
	}
}
