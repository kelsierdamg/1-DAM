package arrays;

public class Ejercicio2 {
	public static void main(String[] args) {
		int[] numeros = {8, 4, 5, 4, 9, 2};
		
		int mayor = numeros[0];
		int posicion = 0;
		
		for(int i=0; i<numeros.length; i++) {
			if(numeros[i]>mayor) {
				mayor=numeros[i];
				posicion=i;
			}
		}
		
		System.out.println("El número mayor es " +mayor+ " y está en la posición " +posicion);
	}

}
