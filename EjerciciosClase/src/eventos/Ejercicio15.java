package eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio15 {
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
		
		etiqueta.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = etiqueta.getX() + e.getX() - etiqueta.getWidth() / 2;
				int y = etiqueta.getY() + e.getY() - etiqueta.getHeight() / 2;
				etiqueta.setLocation(x, y);
			}
		});
	}

}
