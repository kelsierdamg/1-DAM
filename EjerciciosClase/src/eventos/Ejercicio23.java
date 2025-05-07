package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ejercicio23 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JMenuBar barra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenuItem abrir = new JMenuItem("Abrir");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem salir = new JMenuItem("Salir");
		
		archivo.add(abrir);
		archivo.add(guardar);
		archivo.add(salir);
		barra.add(archivo);
		ventana.setJMenuBar(barra);
		
		ventana.setVisible(true);
		
		JCheckBoxMenuItem oscuro = new JCheckBoxMenuItem("Modo oscuro");
		barra.add(oscuro);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (oscuro.isSelected()) {
					panel.setBackground(Color.black);
				}
				else {
					panel.setBackground(null);
				}
			}
		};
		oscuro.addActionListener(oyente);
	}

}
