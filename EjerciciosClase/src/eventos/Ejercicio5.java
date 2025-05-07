package eventos;

import java.awt.*;
import javax.swing.*;

public class Ejercicio5 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(3, 2, 10, 10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setLayout(layout);
		
		JButton boton1 = new JButton("1");
		JButton boton2 = new JButton("2");
		JButton boton3 = new JButton("3");
		JButton boton4 = new JButton("4");
		JButton boton5 = new JButton("5");
		JButton boton6 = new JButton("6");
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton6);
		
		ventana.add(panel);
		ventana.setVisible(true);
	}
}
