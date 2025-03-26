package poo2;

public class Validador_ej6 {
	public static boolean estaEntre(int num1, int num2, int num3) {
		return num1 >= num2 && num1 <= num3;
	}
	
	public static boolean tieneContenido(String texto) {
		return texto != null && !texto.trim().isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(Validador_ej6.estaEntre(10, 5, 15));
		System.out.println(Validador_ej6.estaEntre(20, 5, 15));
		
		System.out.println(Validador_ej6.tieneContenido("Hola mundo"));
		System.out.println(Validador_ej6.tieneContenido(" "));
	}
}
