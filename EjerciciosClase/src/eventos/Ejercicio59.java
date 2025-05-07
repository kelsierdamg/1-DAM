package eventos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejercicio59 {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Visor de archivos");
        ventana.setSize(600, 400);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Lista de rutas de archivos
        ArrayList<File> archivos = new ArrayList<>();

        // Combo para mostrar nombres de archivos
        JComboBox<String> combo = new JComboBox<>();
        combo.setBounds(30, 20, 300, 30);
        panel.add(combo);

        // Botón para seleccionar archivos
        JButton boton = new JButton("Añadir archivo");
        boton.setBounds(350, 20, 150, 30);
        panel.add(boton);

        // Área de texto con scroll
        JTextArea areaTexto = new JTextArea();
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        JScrollPane scroll = new JScrollPane(areaTexto);
        scroll.setBounds(30, 70, 500, 250);
        panel.add(scroll);

        // Acción del botón: abrir JFileChooser
        boton.addActionListener(e -> {
            JFileChooser selector = new JFileChooser();
            int opcion = selector.showOpenDialog(ventana);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                File archivo = selector.getSelectedFile();
                archivos.add(archivo);
                combo.addItem(archivo.getName());
            }
        });

        // Acción del combo: mostrar contenido del archivo
        combo.addActionListener(e -> {
            int index = combo.getSelectedIndex();
            if (index >= 0 && index < archivos.size()) {
                File archivoSeleccionado = archivos.get(index);
                try (BufferedReader lector = new BufferedReader(new FileReader(archivoSeleccionado))) {
                    areaTexto.setText(""); // limpiar
                    String linea;
                    while ((linea = lector.readLine()) != null) {
                        areaTexto.append(linea + "\n");
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(panel, "Error al leer el archivo.");
                }
            }
        });

        ventana.add(panel);
        ventana.setVisible(true);
	}

}
