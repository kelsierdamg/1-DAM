package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio7 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JButton botonR = new JButton("Rojo");
		JButton botonV = new JButton("Verde");
		panel.add(botonR);
		panel.add(botonV);
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
		botonR.addActionListener(rojo);
		botonV.addActionListener(verde);
	}

}
