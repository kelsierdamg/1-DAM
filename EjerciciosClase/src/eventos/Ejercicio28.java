package eventos;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio28 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout layout = new BorderLayout(10, 10);
		
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		ventana.add(panel);
		
		JButton boton1 = new JButton("Centro");
		boton1.setPreferredSize(new Dimension(100, 50));
		JButton boton2 = new JButton("Norte");
		boton2.setPreferredSize(new Dimension(100, 50));
		JButton boton3 = new JButton("Este");
		boton3.setPreferredSize(new Dimension(100, 50));
		JButton boton4 = new JButton("Sur");
		boton4.setPreferredSize(new Dimension(100, 50));
		JButton boton5 = new JButton("Oeste");
		boton5.setPreferredSize(new Dimension(100, 50));
		
		panel.add(boton1, BorderLayout.CENTER);
		panel.add(boton2, BorderLayout.NORTH);
		panel.add(boton3, BorderLayout.EAST);
		panel.add(boton4, BorderLayout.SOUTH);
		panel.add(boton5, BorderLayout.WEST);
		
		ventana.setVisible(true);
	}

}
