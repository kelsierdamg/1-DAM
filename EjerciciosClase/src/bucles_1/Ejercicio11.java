package bucles_1;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int menos500 = 0;
		int mas500 = 0;
		int sueldoTotal = 0;
		
		System.out.println("Introduce el número de empleados: ");
		int n = entrada.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Introduce el sueldo del trabajador " +i+ ":");
			int sueldo = entrada.nextInt();
			
			if(sueldo<500) {
				menos500++;
			}
			if(sueldo>=500) {
				mas500++;
			}
			sueldoTotal+=sueldo;
		}
		entrada.close();
		System.out.println("Empleados que cobran menos de 500 €: " +menos500);
        System.out.println("Empleados que cobran 500 € o más: " +mas500);
        System.out.println("Sueldo total que paga la empresa a todos los trabajadores: " + sueldoTotal + " €");
	}

}
