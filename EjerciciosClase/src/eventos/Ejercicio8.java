package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio8 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JButton boton = new JButton("Presióname");
		panel.add(boton);
		ventana.add(panel);
		ventana.setVisible(true);
		
		JLabel etiqueta = new JLabel();
		panel.add(etiqueta);
		
		final int[] contador = {0};
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contador[0]++;
				etiqueta.setText("Clics: "+contador[0]);
			}
			
		};
		boton.addActionListener(oyente);
	}

}
