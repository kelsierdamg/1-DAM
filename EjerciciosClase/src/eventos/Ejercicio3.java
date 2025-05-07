package eventos;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio3 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 20, 200);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setLayout(layout);
		
		JButton boton1 = new JButton("Aceptar");
		JButton boton2 = new JButton("Cancelar");
		JButton boton3 = new JButton("Salir");
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		
		ventana.add(panel);
		ventana.setVisible(true);
	}

}
