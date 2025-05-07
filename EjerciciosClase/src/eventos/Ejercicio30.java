package eventos;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Ejercicio30 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi ventana");
		ventana.setSize(500, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		ventana.add(panel);
		
		String[] elementos = new String[50];
        for (int i = 0; i < 50; i++) {
            elementos[i] = "Elemento " + (i + 1);
        }
        
        JList<String> lista = new JList<>(elementos);
        JScrollPane scroll = new JScrollPane(lista);
        panel.add(scroll);
        
        ventana.setVisible(true);
	}

}
