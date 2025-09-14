/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicación.GUI.Básica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppLibrosGUI_JList extends JFrame implements ActionListener {

    // 1. Declaración de componentes
    private JLabel etiquetaTitulo, etiquetaAutor, etiquetaGenero;
    private JTextField campoTitulo, campoAutor, campoGenero;
    private JButton botonAgregar, botonLimpiar;
    private JList<String> listaLibros;
    private DefaultListModel<String> modeloLista;

    public AppLibrosGUI_JList() {
        // --- Configuración de la ventana principal (JFrame) ---
        setTitle("Gestión de Libros Favoritos (JList)");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 2. Inicialización de componentes (¡aquí estaba el problema!)
        etiquetaTitulo = new JLabel("Título:");
        campoTitulo = new JTextField(20);
        etiquetaAutor = new JLabel("Autor:");
        campoAutor = new JTextField(20);
        etiquetaGenero = new JLabel("Género:");
        campoGenero = new JTextField(15);
        
        botonAgregar = new JButton("Agregar Libro");
        botonLimpiar = new JButton("Limpiar Todo");

        modeloLista = new DefaultListModel<>();
        listaLibros = new JList<>(modeloLista);

        // 3. Creación de paneles para organizar
        JPanel panelEntrada = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panelEntrada.add(etiquetaTitulo);
        panelEntrada.add(campoTitulo);
        panelEntrada.add(etiquetaAutor);
        panelEntrada.add(campoAutor);
        panelEntrada.add(etiquetaGenero);
        panelEntrada.add(campoGenero);
        panelEntrada.add(botonAgregar);
        
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
        panelBotones.add(botonLimpiar);

        // 4. Añadir paneles y lista a la ventana (¡esto también es crucial!)
        add(panelEntrada, BorderLayout.NORTH);
        add(new JScrollPane(listaLibros), BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        // 5. Manejo de eventos
        botonAgregar.addActionListener(this);
        botonLimpiar.addActionListener(this);

        // 6. Hacer visible la ventana
        setVisible(true);
    }

    // 7. Lógica de eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botonAgregar) {
            String titulo = campoTitulo.getText().trim();
            String autor = campoAutor.getText().trim();
            String genero = campoGenero.getText().trim();

            if (!titulo.isEmpty()) {
                String libroCompleto = "Título: " + titulo + " | Autor: " + autor + " | Género: " + genero;
                modeloLista.addElement(libroCompleto);
                
                campoTitulo.setText("");
                campoAutor.setText("");
                campoGenero.setText("");
            }
        } else if (e.getSource() == botonLimpiar) {
            modeloLista.clear();
            campoTitulo.setText("");
            campoAutor.setText("");
            campoGenero.setText("");
        }
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppLibrosGUI_JList());
    }
}