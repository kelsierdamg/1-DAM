package eventos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio54 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout layout = new GridLayout(4, 2, 10, 10);
		
		JPanel panel = new JPanel();
		panel.setLayout(layout);
		ventana.add(panel);
		
		JButton boton1 = new JButton("1");
		JButton boton2 = new JButton("2");
		JButton boton3 = new JButton("3");
		JButton boton4 = new JButton("4");
		JButton boton5 = new JButton("5");
		JButton boton6 = new JButton("6");
		JButton boton7 = new JButton("7");
		JButton boton8 = new JButton("8");
		
		panel.add(boton1);
		panel.add(boton2);
		panel.add(boton3);
		panel.add(boton4);
		panel.add(boton5);
		panel.add(boton6);
		panel.add(boton7);
		panel.add(boton8);
		
		JCheckBox seleccion = new JCheckBox("Activar/Desactivar");
		panel.add(seleccion);
		seleccion.setSelected(true);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(seleccion.isSelected()) {
					boton1.setEnabled(true);
					boton2.setEnabled(true);
					boton3.setEnabled(true);
					boton4.setEnabled(true);
					boton5.setEnabled(true);
					boton6.setEnabled(true);
					boton7.setEnabled(true);
					boton8.setEnabled(true);
				}
				else {
					boton1.setEnabled(false);
					boton2.setEnabled(false);
					boton3.setEnabled(false);
					boton4.setEnabled(false);
					boton5.setEnabled(false);
					boton6.setEnabled(false);
					boton7.setEnabled(false);
					boton8.setEnabled(false);
				}
			}
			
		};
		seleccion.addActionListener(oyente);
		ventana.setVisible(true);
	}

}
