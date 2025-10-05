/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Captura.Letra.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistroLectura extends JFrame {
    
    // Componentes de la interfaz
  
    // Lista que muestra los libros
    private JList<String> listaLibros;          
    // Modelo de datos para la lista
    private DefaultListModel<String> modeloLista; 
    // Botón para agregar libros
    private JButton botonAgregar;   
    // Campo para el título
    private JTextField campoTitulo; 
    // Campo para el autor
    private JTextField campoAutor;       
    // Lista desplegable de géneros
    private JComboBox<String> comboGenero;       

    public RegistroLectura() {
        // Configuración básica de la ventana
        setTitle("Registro de lectura de Krisber Valverde");
        //Tamaño de la ventana
        setSize(550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Permite centrar la ventana
        setLocationRelativeTo(null); 

        // Creamos el modelo y la lista
        modeloLista = new DefaultListModel<>();
        listaLibros = new JList<>(modeloLista);

        // Muestra las lecturas completads en verde y cursiva
        listaLibros.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                
                // Renderizador personalizado de la lista:
                // Convierte el elemento actual (value) a texto para poder analizarlo y modificar su apariencia
                String texto = value.toString();
                // Si el texto termina con “Lectura completada”, cambia el color y estilo
                if (texto.endsWith("Lectura completada")) {
                    label.setForeground(Color.GREEN.darker());
                    label.setFont(label.getFont().deriveFont(Font.ITALIC));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setFont(label.getFont().deriveFont(Font.PLAIN));
                }

                return label;
            }
        });

        // Se crean campos de entrada
        campoTitulo = new JTextField(12);
        campoAutor = new JTextField(12);

        // Lista de géneros
        String[] generos = {"Ficción", "No ficción", "Misterio", "Ciencia ficción", "Fantasía"};
        comboGenero = new JComboBox<>(generos);

        // Crea un botón para agregar un libro
        botonAgregar = new JButton("Agregar libro");

        // Panel inferior con los campos y el botón
        JPanel panelInferior = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInferior.add(new JLabel("Título:"));
        panelInferior.add(campoTitulo);
        panelInferior.add(new JLabel("Autor:"));
        panelInferior.add(campoAutor);
        panelInferior.add(new JLabel("Género:"));
        panelInferior.add(comboGenero);
        panelInferior.add(new JLabel(""));
        panelInferior.add(botonAgregar);

        // Agregar componentes al panel principal
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(listaLibros), BorderLayout.CENTER);
        panel.add(panelInferior, BorderLayout.SOUTH);
        add(panel);

        // Captura de la tecla "C" para marcar como “Lectura completada”
        listaLibros.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Verifica si la tecla presionada es "C" mayúscula o "c" minúscula 
                if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
                    int indice = listaLibros.getSelectedIndex();
                    if (indice != -1) {
                        String libro = modeloLista.get(indice);
                        // Solo se marca una vez como completado
                        if (!libro.endsWith("Lectura completada")) {
                            modeloLista.set(indice, libro + " - Lectura completada");
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Este libro ya está marcado como completado.",
                                    "Información",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        });

        // Acción del botón “Agregar libro”
        botonAgregar.addActionListener(e -> {
            String titulo = campoTitulo.getText().trim();
            String autor = campoAutor.getText().trim();
            String genero = (String) comboGenero.getSelectedItem();

            // Solo agrega si los campos no están vacíos
            if (!titulo.isEmpty() && !autor.isEmpty()) {
                modeloLista.addElement(titulo + " de " + autor + " (" + genero + ")");
                campoTitulo.setText("");
                campoAutor.setText("");
                campoTitulo.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Por favor, completa los campos de título y autor.",
                        "Advertencia",
                        JOptionPane.WARNING_MESSAGE);
            }
        });

        // Da foco inicial a la lista
        listaLibros.requestFocusInWindow();
    }

    // Método principal que ejcuta el código y permite visualizar la ventana 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroLectura ventana = new RegistroLectura();
            ventana.setVisible(true);
        });
    }
}
