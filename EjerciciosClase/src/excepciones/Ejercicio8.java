package excepciones;

public class Ejercicio8 {
	public static String devuelveMensaje(int numero) {
		String mensaje = "Inicio del método";
		try {
		if (numero % 2 == 0) throw new Exception("El número es par");
		else mensaje = "El número es impar";
		}
		catch (Exception ex) {
		mensaje = "El número es lo contrario de impar";
		}
		finally {
		 mensaje = "No sabemos si el número es par o impar";
		}
		return mensaje;
		}
	
	public static void main(String[] args) {
		System.out.println(devuelveMensaje(1));
		System.out.println(devuelveMensaje(2));
	}
}
/*Como el bloque finally siempre sobreescribe el mensaje, nos salta dos veces
 * lo mismo. Si no estuviera, nos saltaría la primera vez 'El número es impar'
 * y la segunda saltaría la excepción ya que es impar*/
