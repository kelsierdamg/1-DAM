package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ejercicio39 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JRadioButton botonR = new JRadioButton("Rojo");
		JRadioButton botonV = new JRadioButton("Verde");
		JRadioButton botonA = new JRadioButton("Azul");
		panel.add(botonR);
		panel.add(botonV);
		panel.add(botonA);
		ventana.add(panel);
		ventana.setVisible(true);
		
		ActionListener rojo = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.red);
			}
			
		};
		
		ActionListener verde = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.green);
			}
			
		};
		
		ActionListener azul = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.blue);
			}
			
		};
		botonR.addActionListener(rojo);
		botonV.addActionListener(verde);
		botonA.addActionListener(azul);
	}

}
