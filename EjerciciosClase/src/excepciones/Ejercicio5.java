package excepciones;

import java.util.Scanner;

class SaldoNegativoException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public SaldoNegativoException(){
		super();
	}
	
	public SaldoNegativoException(String mensaje) {
		super(mensaje);
	}
}

class CantidadInvalidaException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public CantidadInvalidaException() {
		super();
	}
	
	public CantidadInvalidaException(String mensaje) {
		super(mensaje);
	}
}

public class Ejercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println("Introduce el saldo");
			int saldo = entrada.nextInt();
			
			if(saldo<0) {
				throw new SaldoNegativoException("El saldo no puede ser negativo");
			}
			
			System.out.println("Introduce la cantidad");
			int cantidad = entrada.nextInt();
			
			if(cantidad<0) {
				throw new CantidadInvalidaException("Cantidad inválida");
			}
		}
		catch(SaldoNegativoException e) {
			System.out.println(e.getMessage());
		}
		catch(CantidadInvalidaException e) {
			System.out.println(e.getMessage());
		}
		finally {
			entrada.close();
			System.out.println("Programa finalizado");
		}
	}
}
