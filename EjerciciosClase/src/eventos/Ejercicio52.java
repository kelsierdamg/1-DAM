package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Ejercicio52 {
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
        
        String[] nombres = {"Roberto", "Miguel", "Jueves", "Clara"};
		JList<String> lista = new JList<>(nombres);
		lista.setBounds(250, 30, 100, 80);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(250, 30, 100, 80);
        panel.add(scroll);
        
        ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(combo.getSelectedItem().equals(lista.getSelectedValue())) {
					lista.setEnabled(true);
				}
				else {
					lista.setEnabled(false);
				}
			}
		};
		combo.addActionListener(oyente);
        ventana.setVisible(true);
	}

}
