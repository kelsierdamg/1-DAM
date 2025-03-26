package bucles_3;

public class Ejercicio5 {
	public static void main(String[] args) {
		int edad = 10;
		int dinero = 400;
		
		do {
			dinero+=dinero*0.03;
			edad++;
		}
		while(edad<18);
		
		System.out.println("Tendrás "+dinero+ " € a los " +edad+ " años");
	}
}
