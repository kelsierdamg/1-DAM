package eventos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejercicio20 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		String[] colores = {"Rojo", "Verde", "Azul", "Amarillo"};
        JComboBox<String> combo = new JComboBox<>(colores);
        combo.setBounds(30, 30, 150, 30);
        panel.add(combo);
        
        ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(combo.getSelectedItem().equals("Rojo")) {
					panel.setBackground(Color.red);
				}
				if(combo.getSelectedItem().equals("Azul")) {
					panel.setBackground(Color.blue);
				}
				if(combo.getSelectedItem().equals("Verde")) {
					panel.setBackground(Color.green);
				}
				if(combo.getSelectedItem().equals("Amarillo")) {
					panel.setBackground(Color.yellow);
				}
			}
		};
		combo.addActionListener(oyente);
	}

}
