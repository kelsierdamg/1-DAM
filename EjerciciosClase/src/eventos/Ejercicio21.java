package eventos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejercicio21 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar barra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenuItem abrir = new JMenuItem("Abrir");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem salir = new JMenuItem("Salir");
		
		archivo.add(abrir);
		archivo.add(guardar);
		archivo.add(salir);
		barra.add(archivo);
		ventana.setJMenuBar(barra);
		
		ventana.setVisible(true);
	}

}
