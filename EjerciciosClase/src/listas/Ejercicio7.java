package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<String> infinito = new ArrayList<String>();
		
	    boolean continuar = true;
	    while(continuar) {
	    	System.out.println("Introducce frases (END para terminar): ");
	    	String frase = entrada.next();
	    	infinito.add(frase);
	    	
	    	if(frase.equalsIgnoreCase("END") || frase.contains("END")) {
	    		System.out.println("Bucle finalizado");
	    		continuar = false;
	    		break;
	    	}
	    }
	    
	    System.out.println("""
	    		1. Mostrar una cadena de texto con todo el texto leído
	    		2. Obtener el número de palabras del texto completo
	    		3. Indicar cuántas veces aparece en el texto una palabra
	    		4. Asegurar que las frases introducidas tienen la primera letra en mayúscula y el resto en minúsculas
	    		""");
	    int opcion = entrada.nextInt();
	    switch(opcion) {
	    case 1:
	    	System.out.println(infinito);
	    case 2:
	    	int totalPalabras = 0;
	    	for(int i=0; i<infinito.size(); i++) {
	    		String frase = infinito.get(i);
	    		String[] palabras = frase.split(" ");
	    		totalPalabras+=palabras.length;
	    	}
	    	System.out.println("El número de palabras es " +totalPalabras);
	    case 3:
	    	System.out.println("Introduce la palabra buscada: ");
	    	String palabraBuscada = entrada.next();
	    	
	    	int contador = 0;
	    	for (int i = 0; i < infinito.size(); i++) {
	            String frase = infinito.get(i);
	            String[] palabras = frase.split("\\s+");
	            for (int j = 0; j < palabras.length; j++) {
	                if (palabras[j].equalsIgnoreCase(palabraBuscada)) {
	                    contador++;
	                }
	            }
	        }
	    	System.out.println("La palabra " +palabraBuscada+ " aparece " +contador+ " veces.");
	    case 4:
	    	for(int i=0; i<infinito.size(); i++) {
	    		String frase = infinito.get(i);
	    		
	    		if (esPrimeraMayusculaRestoMinuscula(frase)) {
	                System.out.println("La frase \"" + frase + "\" cumple con el formato.");
	            } 
	    		else {
	                System.out.println("La frase \"" + frase + "\" no cumple con el formato.");
	            }
	    	}
	    }
	    entrada.close();
	}
	
	public static boolean esPrimeraMayusculaRestoMinuscula(String frase) {
		String primeraLetra = frase.substring(0, 1);
	    String restoFrase = frase.substring(1);
	    
	    if (frase == null || frase.isEmpty()) {
            return false;
        }
	    
	    return primeraLetra.equals(primeraLetra.toUpperCase()) && restoFrase.equals(restoFrase.toLowerCase());
	}

}
