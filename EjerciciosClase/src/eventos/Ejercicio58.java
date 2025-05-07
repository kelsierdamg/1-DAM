package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ejercicio58 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextArea campo = new JTextArea();
		campo.setBounds(30, 50, 300, 100);
		panel.add(campo);
		
		JButton boton = new JButton("Cargar texto");
		boton.setBounds(150, 200, 150, 40);
		panel.add(boton);
		ventana.add(panel);
		ventana.setVisible(true);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				try {
					BufferedReader lector = new BufferedReader(new FileReader("archivo.txt"));
					campo.setText("");

					String linea;
					while ((linea = lector.readLine()) != null) {
					    campo.append(linea + "\n");
					}
                    lector.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(panel, "Error al cargar el archivo: " + ex.getMessage());
                }
			}
			
		};
		boton.addActionListener(oyente);
	}

}
