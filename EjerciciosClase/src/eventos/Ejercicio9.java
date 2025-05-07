package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio9 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextField campo = new JTextField();
		campo.setBounds(30, 50, 300, 30);
		panel.add(campo);
		
		JButton boton = new JButton("Coger texto");
		boton.setBounds(150, 100, 150, 40);
		panel.add(boton);
		ventana.add(panel);
		ventana.setVisible(true);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				JOptionPane.showMessageDialog(null, texto);
			}
			
		};
		boton.addActionListener(oyente);
	}

}
