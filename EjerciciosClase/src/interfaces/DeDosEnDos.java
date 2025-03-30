package interfaces;

public class DeDosEnDos implements Serie {
	int numActual;
	int numInicial;

	@Override
	public int getSiguiente() {
		numActual=numActual+2;
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
	
}
