package eventos;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio27 {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(2, 2, 10, 10);
		
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		ventana.add(panel);
		
		JButton boton1 = new JButton("1");
		JButton boton2 = new JButton("2");
		JButton boton3 = new JButton("3");
		JButton boton4 = new JButton("4");
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		
		ventana.setVisible(true);
	}

}
