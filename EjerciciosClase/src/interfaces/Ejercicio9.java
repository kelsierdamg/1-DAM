package interfaces;

class SerieNumerica implements Serie {
	int numActual;
	int numInicial;

	@Override
	public void reiniciar() {
		numActual=numInicial;
	}

	@Override
	public void setComenzar(int x) {
		numActual=x;
		numInicial=x;
	}

	@Override
	public int getSiguiente() {
		int siguiente = numActual;
		numActual+=numInicial;
		return siguiente;
	}
}

public class Ejercicio9 {
	public static void main(String[] args) {
		SerieNumerica serie = new SerieNumerica();
		
		for(int i=1; i<=20; i++) {
			serie.setComenzar(i);
            System.out.print("Serie del " + i + ": ");
            for (int j=1; j<=10; j++) {
                System.out.print(serie.getSiguiente() + "|");
            }
            System.out.println();
		}
	}
}
