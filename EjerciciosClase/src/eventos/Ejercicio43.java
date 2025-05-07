package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio43 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		ventana.add(panel);
		
		JCheckBox mostrar = new JCheckBox("Mostrar");
		panel.add(mostrar);
		
		JButton boton = new JButton("hola");
		panel.add(boton);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mostrar.isSelected()) {
					boton.setEnabled(true);
				}
				else {
					boton.setEnabled(false);
				}
			}
			
		};
		mostrar.addActionListener(oyente);
		ventana.setVisible(true);
	}

}
