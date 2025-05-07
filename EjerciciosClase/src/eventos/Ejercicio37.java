package eventos;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Ejercicio37 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JButton boton = new JButton("No hace na");
		boton.setBounds(300, 100, 100, 40);
		boton.setBackground(Color.red);
		boton.setBorder(new LineBorder(Color.blue, 3));
		panel.add(boton);
	}

}
