package interfaces;

public class Ejercicio4 {
	public static void main(String[] args) {
		DeDosEnDos dos = new DeDosEnDos();
		PorCinco cinco = new PorCinco();
		
		System.out.println("---Diez primeros de dos en dos---");
		dos.setComenzar(0);
		for(int i=0; i<=10; i++) {
			System.out.println(dos.getSiguiente());
		}
		dos.reiniciar();
		
		System.out.println("---Diez primeros poor cinco y después al anterior");
		cinco.setComenzar(0);
		for(int i=0; i<10; i++) {
			System.out.println(cinco.getSiguiente());
		}
		
		System.out.println(cinco.getAnterior());
		cinco.reiniciar();
	}
}
