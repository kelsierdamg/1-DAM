package eventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio55 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Área de texto con scroll");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setLayout(null);

		JTextArea areaTexto = new JTextArea();

		JScrollPane scroll = new JScrollPane(areaTexto);
		scroll.setBounds(20, 20, 440, 200);

		panel.add(scroll);

		ventana.add(panel);
		ventana.setVisible(true);
	}

}
