package arraysmulti;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		boolean[][][] array = new boolean[3][5][4];
		Scanner entrada = new Scanner(System.in);
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("---Menú---");
			System.out.println("1. Alquilar una vivienda");
			System.out.println("2. Retirar el alquiler de una vivienda");
			System.out.println("3. Mostrar las viviendas alquiladas");
			System.out.println("4. Mostrar las viviendas libres");
			System.out.println("5. Mostrar el dinero que ganan en alquileres");
			System.out.println("6. Salir del programa");
			System.out.print("Elige una opción: ");
			int opcion = entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Indica la vivienda a alquilar: ");
				System.out.println("Portal: ");
				int portal = entrada.nextInt();
				System.out.println("Planta: ");
				int planta = entrada.nextInt();
				System.out.println("Vivienda: ");
				int vivienda = entrada.nextInt();
				
				System.out.println("El portal "+ (portal+1) +" planta "+ (planta+1) +" vivienda " +(vivienda+1)+" se alquila por 500€");
				if(!array[portal][planta][vivienda]) {
					array[portal][planta][vivienda] = true;
				}
				else {
					System.out.println("Esta vivienda ya está alquilada");
				}
				break;
			case 2:
				System.out.println("Indica la vivienda a retirar su alquiler: ");
				System.out.println("Portal: ");
				portal = entrada.nextInt();
				System.out.println("Planta: ");
				planta = entrada.nextInt();
				System.out.println("Vivienda: ");
				vivienda = entrada.nextInt();
				
				if(array[portal][planta][vivienda]) {
					array[portal][planta][vivienda] = false;
					System.out.println("El alquiler ha sido retirado");
				}
				else {
					System.out.println("La vivienda no está alquilada");
				}
				break;
			case 3:
				System.out.println("---Viviendas alquiladas---");
				for(portal=0; portal<array.length; portal++) {
					for(planta=0; planta<array[portal].length; planta++) {
						for(vivienda=0; vivienda<array[portal][planta].length; vivienda++) {
							if(array[portal][planta][vivienda]) {
								System.out.println("Portal: " +portal +" Planta: " +planta+ " Vivienda: " +vivienda);
							}
						}
					}
				}
				break;
			case 4:
				System.out.println("---Viviendas libres---");
				for(portal=0; portal<array.length; portal++) {
					for(planta=0; planta<array[portal].length; planta++) {
						for(vivienda=0; vivienda<array[portal][planta].length; vivienda++) {
							if(!array[portal][planta][vivienda]) {
								System.out.println("Portal: " +portal +" Planta: " +planta+ " Vivienda: " +vivienda);
							}
						}
					}
				}
				break;
			case 5:
				int alquiladas = 0;
				for(int i=0; i<array.length; i++) {
					for(int j=0; j<array[i].length; j++) {
						for(int k=0; k<array.length; k++) {
							if(array[i][j][k]) {
								alquiladas++;
							}
						}
					}
				}
				int dineroTotal = alquiladas*500;
				System.out.println("El dinero total que ganan es: " +dineroTotal);
				break;
			case 6:
				System.out.println("Saliendo del programa");
				continuar = false;
				break;
			}
		}
	}
}
