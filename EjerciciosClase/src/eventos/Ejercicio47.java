package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejercicio47 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JButton boton = new JButton("Salir");
		boton.setBounds(150, 200, 150, 40);
		panel.add(boton);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int respuesta = JOptionPane.showConfirmDialog(
				    null,
				    "¿Quieres cerrar la aplicación?",
				    "Confirmar salida",
				    JOptionPane.YES_NO_OPTION
				);
				    
				if (respuesta == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			
		};
		boton.addActionListener(oyente);
	}

}
