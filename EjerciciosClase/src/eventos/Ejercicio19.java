package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Ejercicio19 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		String[] nombres = {"Roberto", "Miguel", "Borja", "Clara"};
		JList<String> lista = new JList<>(nombres);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scroll = new JScrollPane(lista);
        scroll.setBounds(30, 30, 100, 80);
        panel.add(scroll);
		
		JButton boton = new JButton("Mostrar selección");
        boton.setBounds(150, 30, 120, 30);
        panel.add(boton);

        JLabel resultado = new JLabel();
        resultado.setBounds(150, 70, 200, 30);
        panel.add(resultado);
        
        ActionListener oyente = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = lista.getSelectedValue();
				resultado.setText("Has elegido: "+texto);
			}
		};
		boton.addActionListener(oyente);
	}

}
