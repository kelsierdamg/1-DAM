package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Ejercicio24 {
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
		
		JMenu ver = new JMenu();
		JCheckBoxMenuItem oscuro = new JCheckBoxMenuItem("Modo oscuro");
		barra.add(ver);
		ver.add(oscuro);
		
		JMenu acelerar = new JMenu("Acelerar");
		JMenuItem acelerador = new JMenuItem("Acelerador");
		JMenuItem salimos = new JMenuItem("Salir");
		acelerar.add(acelerador);
		acelerar.add(salimos);
		barra.add(acelerar);
		
		acelerador.setAccelerator(KeyStroke.getKeyStroke("control S"));
		ActionListener oyenteT = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(panel, "¡Has pulsado Ctrl + S!");
			}
			
		};
		acelerador.addActionListener(oyenteT);
			
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == salimos) {
					System.exit(0);
				}
			}
		};
		salimos.addActionListener(oyente);

	}
}
