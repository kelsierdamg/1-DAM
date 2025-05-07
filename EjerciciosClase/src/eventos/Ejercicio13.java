package eventos;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio13 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel etiqueta = new JLabel("Etiqueta increíble");
		etiqueta.setBounds(150, 100, 200, 30);
		panel.add(etiqueta);
		
		ventana.add(panel);
		ventana.setVisible(true);
		
		MouseListener oyente = new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				etiqueta.setForeground(Color.blue);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				etiqueta.setForeground(Color.black);
			}
			
		};
		etiqueta.addMouseListener(oyente);
	}

}
