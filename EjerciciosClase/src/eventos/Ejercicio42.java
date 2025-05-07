package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio42 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        JComboBox<String> combo = new JComboBox<>(dias);
        combo.setBounds(30, 30, 150, 30);
        panel.add(combo);
        
        JLabel etiqueta = new JLabel();
		etiqueta.setBounds(50, 50, 100, 30);
		panel.add(etiqueta);
        
        ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				etiqueta.setText(combo.getSelectedItem().toString());
			}
		};
		combo.addActionListener(oyente);
		ventana.setVisible(true);
	}

}
