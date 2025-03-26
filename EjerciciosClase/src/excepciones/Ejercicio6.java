package excepciones;

import java.util.Scanner;

class Cuenta {
	int numero;
	int saldo;
	
	Scanner entrada = new Scanner(System.in);
	
	public Cuenta(int numero) {
		this.numero = numero;
	}
	
	public void depositar() {
		System.out.println("¿Cuánto quiere depositar?");
		int cantidad = entrada.nextInt();

		try {
			if(cantidad<=0) {
				throw new CantidadInvalidaException();
			}
			saldo+=cantidad;
			System.out.println("Se depositaron " +cantidad+ " euros. Actualmente tiene: " +saldo);
			}
			catch(CantidadInvalidaException e) {
				System.out.println("No puede ingresar esa cantidad");
			}
	}
	
	public void retirar() {
		System.out.println("¿Cuánto quiere retirar?");
		int cantidad = entrada.nextInt();
		
		try {
			saldo-=cantidad;
			if(saldo<0) {
				throw new SaldoNegativoException();
			}
			System.out.println("Se retiraron " +cantidad+ " euros. Actualmente tiene: " +saldo);
			}
			catch(SaldoNegativoException e) {
				System.out.println("No se puede retirar este dinero");
			}
	}
	
	public void saldoActual() {
		while(true) {
		try {
		System.out.println("Saldo actual:");
		saldo = entrada.nextInt();
			
		if(saldo<0) {
			throw new SaldoNegativoException();
		}
		break;
		}
		catch(SaldoNegativoException e) {
			System.out.println("El saldo no puede ser negativo");
		}
		}
	}
	
	public void mostrarSaldoActual() {
		System.out.println("Saldo actual: " +saldo);
	}
}

public class Ejercicio6 {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(4057);
		
		cuenta.saldoActual();
		cuenta.depositar();
		cuenta.retirar();
		cuenta.mostrarSaldoActual();
	}
}
