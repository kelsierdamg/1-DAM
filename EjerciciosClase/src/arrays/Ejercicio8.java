package arrays;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Cuántos ordenadores hay?");
		int x = entrada.nextInt();
		boolean[] ordenadores = new boolean[x];
		
		boolean continuar = true;
		while(continuar) {
			System.out.println("\n--- Menú ---");
            System.out.println("1. Reservar un ordenador");
            System.out.println("2. Listar ordenadores libres");
            System.out.println("3. Listar ordenadores reservados");
            System.out.println("4. Retirar la reserva de un ordenador");
            System.out.println("5. Listar estado de todos los ordenadores");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            int opcion = entrada.nextInt();
            
            switch(opcion) {
            case 1:
            	System.out.println("Nº de ordenador a reservar (0 a "+ordenadores[x]+ " )");
            	int numReserva = entrada.nextInt();
            	if (!ordenadores[numReserva]) {
                    ordenadores[numReserva] = true;
                    System.out.println("Ordenador " +numReserva+ " reservado con éxito.");
                } 
            	else {
                    System.out.println("El ordenador " +numReserva+ " ya está reservado.");
                }
            	break;
            case 2:
            	int libres = 0;
            	for(int i=0; i<x; i++) {
            		if(!ordenadores[i]) {
            			libres++;
            		}
            	}
            	System.out.println("Nº de ordenadores libres: " +libres);
            	break;
            case 3:
            	int reservados = 0;
            	for(int i=0; i<x; i++) {
            		if(ordenadores[i]) {
            			reservados++;
            		}
            	}
            	System.out.println("Nº de ordenadores reservados: " +reservados);
            	break;
            case 4:
            	System.out.println("Diga el nº del ordenador a liberar: ");
            	int numLiberar = entrada.nextInt();
            	
            	if(ordenadores[numLiberar]) {
            		ordenadores[numLiberar] = false;
            		System.out.println("El ordenador nº " +numLiberar+ " ha sido liberado");
            	}
            	else {
            		System.out.println("El ordenador nº " +numLiberar+ " no está reservado");
            	}
            	break;
            case 5:
            	for(int i=0; i<x; i++) {
            		if(ordenadores[i]) {
            			System.out.println("Reservado");
            		}
            		else {
            			System.out.println("Libre");
            		}
            	}
            	break;
            case 6:
            	System.out.println("Saliendo del programa");
            	continuar = false;
            	break;
            }
            entrada.close();
		}
	}

}
