/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aplicación.de.Agenda.Personal;

//Importaciones

// Librerías para la interfaz gráfica
import javax.swing.*;
// Modelo de tabla para JTable
import javax.swing.table.DefaultTableModel;
// Para layouts y componentes gráficos
import java.awt.*;
import java.awt.event.ActionEvent;
// Para manejar eventos de botones
import java.awt.event.ActionListener;
// Para dar formato a fecha/hora
import java.text.SimpleDateFormat;
import java.util.Date;

// Clase principal que hereda de JFrame para crear una ventana
public class AgendaPersonal extends JFrame {

    // Componentes
    
    // Tabla donde se listan los eventos
    private JTable tablaEventos;
    // Modelo de la tabla que controla filas/columnas.
    private DefaultTableModel modeloTabla;
    // Selector de fecha
    private JSpinner spinnerFecha;
    // Selector de hora
    private JSpinner spinnerHora;
    // Campo de texto para la descripción del evento
    private JTextField campoDescripcion;

    // Constructor de la ventana
    public AgendaPersonal() {
        // Título de la ventana
        setTitle("Agenda Personal de Krisber Valverde");
        // Cierra la aplicación al salir
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Tamaño de la ventana
        setSize(600, 400);

        // Paneles
        JPanel panelEntrada = new JPanel();
        // Panel para inputs, en cuadrícula
        panelEntrada.setLayout(new GridLayout(4, 2));
        JPanel panelAcciones = new JPanel();
        // Panel para botones
        panelAcciones.setLayout(new FlowLayout());
        JPanel panelLista = new JPanel();
        // Panel para la tabla
        panelLista.setLayout(new BorderLayout());

        // Entrada de datos
        JLabel labelFecha = new JLabel("Fecha (dd/MM/yyyy):");
        // Selector de fecha
        spinnerFecha = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editorFecha = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy");
        // Se configura el formato de fecha
        spinnerFecha.setEditor(editorFecha);

        JLabel labelHora = new JLabel("Hora (HH:mm):");
        // Selector de hora
        spinnerHora = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor editorHora = new JSpinner.DateEditor(spinnerHora, "HH:mm");
        // Se configura el formato de hora
        spinnerHora.setEditor(editorHora);

        JLabel labelDescripcion = new JLabel("Descripción:");
        // Campo de texto para escribir descripción
        campoDescripcion = new JTextField();

        // Se añaden los componentes al panel de entrada
        panelEntrada.add(labelFecha);
        panelEntrada.add(spinnerFecha);
        panelEntrada.add(labelHora);
        panelEntrada.add(spinnerHora);
        panelEntrada.add(labelDescripcion);
        panelEntrada.add(campoDescripcion);

        // Botones
        
        // Botón para añadir evento
        JButton botonAgregar = new JButton("Agregar");
        // Botón para borrar evento
        JButton botonEliminar = new JButton("Eliminar seleccionado");
        // Botón para cerrar la app
        JButton botonSalir = new JButton("Salir");

        // Añadir botones al panel de acciones
        panelAcciones.add(botonAgregar);
        panelAcciones.add(botonEliminar);
        panelAcciones.add(botonSalir);

        // Tabla de eventos
        
        // Modelo que manejará los datos
        modeloTabla = new DefaultTableModel();
        // Columna de Fecha
        modeloTabla.addColumn("Fecha");
        // Columna de Hora
        modeloTabla.addColumn("Hora");
        // Columna de Descripción
        modeloTabla.addColumn("Descripción");
        // Tabla que muestra los eventos
        tablaEventos = new JTable(modeloTabla);
        // Scroll en la tabla
        JScrollPane scrollPane = new JScrollPane(tablaEventos);
        panelLista.add(scrollPane, BorderLayout.CENTER);

        // Layout principal
        setLayout(new BorderLayout());
        // Panel superior con inputs
        add(panelEntrada, BorderLayout.NORTH);
        // Panel central con tabla
        add(panelLista, BorderLayout.CENTER);
        // Panel inferior con botones
        add(panelAcciones, BorderLayout.SOUTH);

        // Action Listeners
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEvento(); // Llama al método para agregar evento
            }
        });

        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarEventoSeleccionado(); // Llama al método para eliminar evento
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana
            }
        });
    }

    // Método para agregar un evento a la tabla
    private void agregarEvento() {
        String descripcion = campoDescripcion.getText().trim(); // Obtiene descripción
        if (descripcion.isEmpty()) {
            // Si está vacío, muestra advertencia
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Da formato a fecha y hora
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");
        String fecha = formatoFecha.format(spinnerFecha.getValue());
        String hora = formatoHora.format(spinnerHora.getValue());

        // Añade fila a la tabla
        modeloTabla.addRow(new Object[]{fecha, hora, descripcion});
        
        // Limpia el campo de descripción
        campoDescripcion.setText("");
        campoDescripcion.requestFocus();
    }

    // Método para eliminar el evento seleccionado
    private void eliminarEventoSeleccionado() {
        int filaSeleccionada = tablaEventos.getSelectedRow(); // Índice de fila seleccionada
        if (filaSeleccionada == -1) {
            // Si no hay fila seleccionada, muestra advertencia
            JOptionPane.showMessageDialog(this, "Selecciona un evento primero", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirmación antes de eliminar
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Eliminar el evento seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            modeloTabla.removeRow(filaSeleccionada); // Elimina la fila
        }
    }

    //  Método main para iniciar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { // Lanza la interfaz en el hilo de Swing
            @Override
            public void run() {
                AgendaPersonal agenda = new AgendaPersonal();
                agenda.setVisible(true); // Muestra la ventana
            }
        });
    }
}
