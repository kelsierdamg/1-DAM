package eventos;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ejercicio18 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		ventana.add(panel);
		
		JRadioButton opcion1 = new JRadioButton("Masculino");
        JRadioButton opcion2 = new JRadioButton("Femenino");
        JRadioButton opcion3 = new JRadioButton("Otro");

        opcion1.setBounds(30, 30, 100, 30);
        opcion2.setBounds(30, 60, 100, 30);
        opcion3.setBounds(30, 90, 100, 30);

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(opcion1);
        grupo.add(opcion2);
        grupo.add(opcion3);

        panel.add(opcion1);
        panel.add(opcion2);
        panel.add(opcion3);

        ventana.setVisible(true);
	}

}
