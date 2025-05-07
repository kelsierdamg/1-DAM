package eventos;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio2 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		ventana.add(panel);
	}

}
