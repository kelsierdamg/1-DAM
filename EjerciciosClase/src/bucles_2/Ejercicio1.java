package bucles_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String teclado = "";
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");
		System.out.println("Escribe algo para mostrar el día y la hora: ");
		System.out.println("Escribe 'Salir' para salir");
		
		//OTRA FORMA DE HACERLO ES CON UN BUCLE INFINITO WHILE(TRUE)
		//while (true) {
            //System.out.print("\nTu entrada: ");
            //entrada = scanner.nextLine();

            //if (entrada.equalsIgnoreCase("Salir")) {
            //    System.out.println("¡Hasta pronto! Programa finalizado.");
              //  break;
          //  }

            //LocalDateTime ahora = LocalDateTime.now();
            //System.out.println("Fecha y hora actual: " + ahora.format(formato));
        //}
		
		while(!teclado.equalsIgnoreCase("Salir")) {
			System.out.print("\nTu entrada: ");
            teclado = entrada.nextLine();
            
            if (!teclado.equalsIgnoreCase("Salir")) {
            LocalDateTime ahora = LocalDateTime.now();
            System.out.println("Fecha y hora actual: " + ahora.format(formato));
		
            }
		}    
		System.out.println("¡Hasta pronto! Programa finalizado.");
        entrada.close();
	}

}
