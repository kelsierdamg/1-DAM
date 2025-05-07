package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ejercicio51 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel etiqueta = new JLabel("Nombre:");
		JLabel etiqueta2 = new JLabel("Email:");
		JLabel etiqueta3 = new JLabel("Mensaje:");
		etiqueta.setBounds(50, 10, 100, 30);
		etiqueta2.setBounds(50, 100, 100, 30);
		etiqueta3.setBounds(50, 200, 100, 30);
		panel.add(etiqueta);
		panel.add(etiqueta2);
		panel.add(etiqueta3);
		
		JTextField campo = new JTextField();
		JTextField campo2 = new JTextField();
		JTextField campo3 = new JTextField();
		campo.setBounds(100, 10, 100, 30);
		campo2.setBounds(100, 100, 100, 30);
		campo3.setBounds(100, 200, 100, 30);
		campo.setBorder(new LineBorder(Color.blue, 3));
		campo2.setBorder(new LineBorder(Color.green, 3));
		campo3.setBorder(new LineBorder(Color.red, 3));
		panel.add(campo);
		panel.add(campo2);
		panel.add(campo3);
		
		JButton boton = new JButton("Enviar");
		boton.setBounds(300, 100, 100, 40);
		panel.add(boton);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				campo.setText(null);
				campo2.setText(null);
				campo3.setText(null);
				JOptionPane.showMessageDialog(null, "Su nombre es "+campo.getText()+" su email es "+campo2.getText()+" y su mensaje es "+campo3.getText());
			}
			
		};
		boton.addActionListener(oyente);
		ventana.add(panel);
		ventana.setVisible(true);
	}

}
