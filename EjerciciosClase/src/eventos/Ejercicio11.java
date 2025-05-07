package eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio11 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JTextField campo = new JTextField();
		campo.setBounds(30, 50, 300, 30);
		panel.add(campo);
		
		ventana.add(panel);
		ventana.setVisible(true);
		
		KeyListener oyente = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				 
			}

			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == '\n') {
					System.out.println("Enter presionado");
				}
			}
			
		};
		campo.addKeyListener(oyente);
	}

}
