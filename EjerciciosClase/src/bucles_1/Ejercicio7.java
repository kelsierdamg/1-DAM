package bucles_1;

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int aprobados = 0;
		int suspendidos = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print("Introduce las notas del alumno " +i+ ":");
			double nota = entrada.nextDouble();
			
			if(nota>=5) {
				aprobados++;
			}
			else{
				suspendidos++;
			}
		}
		
		System.out.println("Han aprobado " +aprobados+ " alumnos");
		System.out.println("Han suspendido " +suspendidos+ " alumnos");
		
		entrada.close();
	}

}
