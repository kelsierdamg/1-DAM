package clases_abstractas;

import java.util.Scanner;

public class MenuView {
	public static int solicitarAccionDeMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("""
				TIENDA
				*******
				1. Crear un nuevo producto
				2. Crear un nuevo pedido 
				3. Mostrar todos los productos disponibles
				4. Mostrar todos los pedidos actuales
				5. Salir
				""");
		
		System.out.println("Introduce un número: ");
		int opcion = sc.nextInt();
		return opcion;
	}
}
