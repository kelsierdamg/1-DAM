package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejercicio17 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JLabel etiqueta = new JLabel("Marque la casilla para activar");
		etiqueta.setBounds(100, 50, 250, 50);
		panel.add(etiqueta);
		
		JCheckBox casilla = new JCheckBox("Activar");
		casilla.setBounds(100, 100, 100, 50);
		panel.add(casilla);
		
		JTextField campo = new JTextField();
		campo.setBounds(100, 200, 100, 30);
		panel.add(campo);
		
		ventana.setVisible(true);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				campo.setEnabled(casilla.isSelected());
			}
		};
		casilla.addActionListener(oyente);
		
	}

}
