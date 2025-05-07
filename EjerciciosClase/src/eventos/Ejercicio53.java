package eventos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Ejercicio53 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane pestañas = new JTabbedPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		panel1.add(new JLabel("Pestaña 1"));
		panel2.add(new JButton("Pestaña 2"));
		panel3.add(new JTextField("Pestaña 3"));
		
		pestañas.addTab("Primera", panel1);
		pestañas.addTab("Segunda", panel2);
		ventana.add(pestañas);
		
		ventana.setVisible(true);
	}

}
