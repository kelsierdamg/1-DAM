package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Ejercicio56 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextArea campo = new JTextArea();
		campo.setBounds(30, 50, 300, 100);
		panel.add(campo);
		
		JButton boton = new JButton("Guardar texto");
		boton.setBounds(150, 200, 150, 40);
		panel.add(boton);
		ventana.add(panel);
		ventana.setVisible(true);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = campo.getText();
				try {
                    FileWriter escritor = new FileWriter("archivo.txt");
                    escritor.write(texto);
                    escritor.close();
                    JOptionPane.showMessageDialog(panel, "Archivo guardado correctamente.");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(panel, "Error al guardar el archivo: " + ex.getMessage());
                }
			}
			
		};
		boton.addActionListener(oyente);
	}

}
