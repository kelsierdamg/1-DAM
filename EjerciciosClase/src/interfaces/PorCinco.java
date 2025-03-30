package interfaces;

public class PorCinco implements Serie {
	int numActual;
	int numInicial;
	
	@Override
	public int getSiguiente() {
		numActual=numActual*5;
		return numActual;
	}

	@Override
	public void reiniciar() {
		numActual=numInicial;
	}

	@Override
	public void setComenzar(int x) {
		numActual=x;
		numInicial=x;
	}
	
	public double getAnterior() {
		numActual=numActual/5;
		return numActual;
	}
	
}
