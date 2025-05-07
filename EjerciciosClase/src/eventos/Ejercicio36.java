package eventos;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio36 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JLabel etiqueta = new JLabel("Prueba xd");
		etiqueta.setBounds(50, 50, 100, 30);
		panel.add(etiqueta);
		
		JButton boton = new JButton("Cambiar fuente");
		boton.setBounds(300, 100, 100, 40);
		panel.add(boton);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setForeground(Color.red);
				etiqueta.setFont(new Font("times new roman",Font.PLAIN,20));
			}
			
		};
		boton.addActionListener(oyente);
		ventana.setVisible(true);
	}

}
