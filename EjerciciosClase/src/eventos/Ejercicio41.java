package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio41 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JTextField campo = new JTextField();
		campo.setBounds(50, 100, 100, 30);
		panel.add(campo);
		
		JButton boton = new JButton("Enviar");
		boton.setBounds(300, 100, 100, 40);
		panel.add(boton);
		
		JLabel etiqueta = new JLabel();
		etiqueta.setBounds(50, 50, 100, 30);
		panel.add(etiqueta);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				campo.setText(null);
				etiqueta.setText(texto);
			}
			
		};
		boton.addActionListener(oyente);
	}

}
