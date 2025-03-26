package bucles_1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double sumAlturas=0;
		
		System.out.println("¿Cuántos miembros tiene su familia?: ");
		int miembros = entrada.nextInt();
		
		for(int i=1; i<=miembros; i++) {
			System.out.println("Altura del miembro " +i+ ":");
			double altura = entrada.nextDouble();
			
			sumAlturas+=altura;
		}
		
		double alturaMedia = sumAlturas/miembros;
		
		System.out.println("La altura media de la familia es de " +alturaMedia+ " metros");
		entrada.close();
	}

}
