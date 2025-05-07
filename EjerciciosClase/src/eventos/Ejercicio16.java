package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ejercicio16 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel etiqueta = new JLabel("Nombre:");
		JLabel etiqueta2 = new JLabel("Contraseña:");
		etiqueta.setBounds(50, 50, 100, 30);
		etiqueta2.setBounds(50, 150, 100, 30);
		panel.add(etiqueta);
		panel.add(etiqueta2);
		
		JTextField campo = new JTextField();
		JPasswordField campo2 = new JPasswordField();
		campo.setBounds(50, 100, 100, 30);
		campo2.setBounds(50, 200, 100, 30);
		panel.add(campo);
		panel.add(campo2);
		
		JButton boton = new JButton("Validar");
		boton.setBounds(300, 100, 100, 40);
		panel.add(boton);
		
		ventana.add(panel);
		ventana.setVisible(true);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				campo.setText(null);
				campo2.setText(null);
				JOptionPane.showMessageDialog(null, "Información validada");
			}
			
		};
		boton.addActionListener(oyente);
	}

}
