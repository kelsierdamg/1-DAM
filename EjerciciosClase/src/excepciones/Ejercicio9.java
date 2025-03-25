package excepciones;

public class Ejercicio9 {
private static int ejecuta() {
	int valor = 0;
	try {
		valor += 1;
		valor += Integer.parseInt("13");
		valor += 1;
		System.out.println("Valor al final del try: " + valor);
	}
	catch (NumberFormatException e) {
		valor += Integer.parseInt("13,0");
		System.out.println ("Valor al final del catch: " + valor);
	}
	finally {
		valor += 1;
		System.out.println ("Valor al final de finally: " + valor);
	}
	valor += 1;
	System.out.println ("Valor antes del return: " + valor);
	
	return valor;
}

public static void main(String[] args) {
	try {
		System.out.println(ejecuta());
	}
	catch (Exception e) {
		System.out.println("Se ha producido una excepción en la ejecución del código");
		e.printStackTrace();
	}

	}
}
/*Se suman todos los valores excepto el del catch, que no se ejecuta así que 
al final nos queda 17*/