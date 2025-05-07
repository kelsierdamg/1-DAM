package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio40 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		ventana.add(panel);
		
		JCheckBox mostrar = new JCheckBox("Mostrar");
		panel.add(mostrar);
		
		JLabel texto = new JLabel("hola");
		panel.add(texto);
		
		ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(mostrar.isSelected()) {
					texto.setEnabled(true);
				}
				else {
					texto.setEnabled(false);
				}
			}
			
		};
		mostrar.addActionListener(oyente);
	}

}
