package bucles_1;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una frase: ");
		String frase = entrada.nextLine();
		System.out.println("Introduce una letra: ");
		char letra = entrada.next().charAt(0);
		
		System.out.println("¿Distinguir mayúsculas de minúsculas?");
		String respuesta = entrada.next().toLowerCase();
		
		if(respuesta.equals("no")) {
			frase = frase.toLowerCase();
			letra = Character.toLowerCase(letra);
		}
		
		int contador = 0;
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)==letra) {
				contador++;
			}
		}
		
		System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
		entrada.close();
	}

}
