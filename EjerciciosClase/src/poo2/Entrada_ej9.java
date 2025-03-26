package poo2;

import java.util.Scanner;

public class Entrada_ej9 {
	public static Scanner entrada = new Scanner(System.in);

    public static int leerEntero() {
        System.out.print("Introduce tu edad: ");
        return entrada.nextInt();
    }

    public static double leerDouble() {
        System.out.print("Introduce tu salario: ");
        return entrada.nextDouble();
    }

    public static String leerTexto() {
        entrada.nextLine(); 
        System.out.print("Introduce tu nombre: ");
        return entrada.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Ingreso de datos:");

        int edad = leerEntero();
        double salario = leerDouble();
        String nombre = leerTexto();

        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Edad: " + edad);

        entrada.close(); 
    }
}
