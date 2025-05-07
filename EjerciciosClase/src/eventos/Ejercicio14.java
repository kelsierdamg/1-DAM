package eventos;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio14 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		ventana.add(panel);
		ventana.setVisible(true);
		
		panel.setFocusable(true);
		panel.requestFocusInWindow();
		
		KeyListener oyente = new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				 
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar() == 'g') {
					panel.setBackground(Color.green);
				}
				if(e.getKeyChar() == 'r') {
					panel.setBackground(Color.red);
				}
				if(e.getKeyChar() == 'b') {
					panel.setBackground(Color.blue);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
		};
		panel.addKeyListener(oyente);
	}

}
