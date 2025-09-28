/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aplicación.GUI.de.Lista.de.Tareas;

// Importa todos los componentes de Swing como ventanas, botones, listas, campos de texto, etc.
import javax.swing.*;
// Importa clases básicas de AWT (Abstract Window Toolkit), como colores, fuentes y layouts
import java.awt.*;
// Importa la clase ActionEvent, que representa un evento de acción como un clic en un botón o enter en un campo de texto
import java.awt.event.ActionEvent;
// Importa la interfaz ActionListener, que permite "escuchar" y responder a los ActionEvent
import java.awt.event.ActionListener;
// Importa la clase MouseAdapter, que facilita manejar eventos del mouse sin implementar todos los métodos de MouseListener
import java.awt.event.MouseAdapter;
// Importa la clase MouseEvent, que representa acciones del mause como clic, doble clic, movimiento, etc.
import java.awt.event.MouseEvent;

// Clase principal de la aplicación, extiende JFrame para crear la ventana.
public class ListaTareas extends JFrame {

    // Modelo de datos para la lista: almacena objetos Tarea.
    private DefaultListModel<Tarea> modeloLista;
    // Componente visual que muestra la lista de tareas.
    private JList<Tarea> listaTareas;
    // Campo de texto para que el usuario ingrese nuevas tareas.
    private JTextField campoTarea;

    // Constructor de la ventana principal.
    public ListaTareas() {
        // Configuración de la Ventana (JFrame)
        setTitle("Lista de Tareas");
        // Asegura que la aplicación se cierre al presionar el botón 'X'.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Establece el tamaño inicial de la ventana.
        setSize(550, 400);

        // Creación de Paneles para la Disposición (Layout)
        // Panel superior para la entrada de texto.
        JPanel panelEntrada = new JPanel();
        // Panel inferior para los botones.
        JPanel panelBotones = new JPanel();
        // Panel central para la lista (usaremos BorderLayout aquí).
        JPanel panelLista = new JPanel();

        // Campo de Entrada de Tarea
        campoTarea = new JTextField(20);
        // Agrega un escuchador de acción para detectar la pulsación de la tecla ENTER.
        campoTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Llama al método para añadir la tarea cuando se pulsa ENTER.
                agregarTarea();
            }
        });

        // Creación y Configuración de Botones

        // Botón para agregar una tarea.
        JButton botonAgregar = new JButton("Añadir Tarea");
        botonAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarTarea();
            }
        });

        // Botón para marcar la tarea seleccionada como completada (o pendiente).
        JButton botonMarcarCompletada = new JButton("Marcar como Completada");
        botonMarcarCompletada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                marcarCompletada();
            }
        });

        // Botón para eliminar la tarea seleccionada.
        JButton botonEliminar = new JButton("Eliminar Tarea");
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarTarea();
            }
        });

        // Lista de Tareas (JList)
        
        // Inicializa el modelo de datos.
        modeloLista = new DefaultListModel<>();
        // Crea la JList usando el modelo de datos.
        listaTareas = new JList<>(modeloLista);
        // Asigna el 'renderer' personalizado para darle estilo a las tareas (ej. tachar).
        listaTareas.setCellRenderer(new TareaCellRenderer());
        
        // Agrega un escuchador de ratón para manejar el doble clic.
        listaTareas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Si el conteo de clics es 2 (doble clic).
                if (e.getClickCount() == 2) {
                    marcarCompletada();
                }
            }
        });

        // Agregar Componentes a los Paneles
        panelEntrada.add(campoTarea);
        panelBotones.add(botonAgregar);
        panelBotones.add(botonMarcarCompletada);
        panelBotones.add(botonEliminar);
        
        // Configura el panel de la lista para usar BorderLayout.
        panelLista.setLayout(new BorderLayout());
        // Envuelve la JList en un JScrollPane para tener barras de desplazamiento si es necesario.
        panelLista.add(new JScrollPane(listaTareas), BorderLayout.CENTER);

        // Agregar Paneles al Frame Principal (Usando BorderLayout del JFrame)
        add(panelEntrada, BorderLayout.NORTH);  // Campo de entrada arriba
        add(panelBotones, BorderLayout.SOUTH);  // Botones abajo
        add(panelLista, BorderLayout.CENTER);   // Lista de tareas en el centro
    }

    // Métodos de Lógica de la Aplicación (Funcionalidad)

    // Función para añadir una nueva tarea al modelo.
    private void agregarTarea() {
        String tarea = campoTarea.getText().trim();
        // Verifica que el campo de texto no esté vacío.
        if (!tarea.isEmpty()) {
            // Crea una nueva Tarea (inicialmente no completada) y la añade al modelo.
            modeloLista.addElement(new Tarea(tarea, false));
            // Limpia el campo de texto.
            campoTarea.setText("");
        }
    }

    // Función para cambiar el estado de la tarea seleccionada.
    private void marcarCompletada() {
        // Obtiene el índice de la tarea que el usuario tiene seleccionada.
        int indice = listaTareas.getSelectedIndex();
        
        // Verifica que haya una tarea seleccionada (índice != -1).
        if (indice != -1) {
            // Obtiene el objeto Tarea del modelo.
            Tarea tarea = modeloLista.get(indice);
            // Invierte el estado: si estaba completada, la pone pendiente, y viceversa.
            tarea.setCompletada(!tarea.isCompletada());
            // Vuelve a establecer la tarea en el modelo. Esto notifica a la JList para que se repinte.
            modeloLista.set(indice, tarea);
        }
    }

    // Función para eliminar la tarea seleccionada.
    private void eliminarTarea() {
        // Obtiene el índice de la tarea seleccionada.
        int indice = listaTareas.getSelectedIndex();
        
        // Verifica que haya una tarea seleccionada.
        if (indice != -1) {
            // Elimina la tarea del modelo.
            modeloLista.remove(indice);
        }
    }

    // Método principal para iniciar la aplicación.
    public static void main(String[] args) {
        // Asegura que la creación y manipulación de la interfaz gráfica se haga en el EDT (Event Dispatch Thread).
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListaTareas listaTareas = new ListaTareas();
                // Hace visible la ventana.
                listaTareas.setVisible(true);
                // Hace que la ventana esté centrada al ejecutar el código
                listaTareas.setLocationRelativeTo(null);
            }
        });
    }
}

// Clase Modelo de Datos: Representa una Tarea Individual
class Tarea {
    private String descripcion;
    private boolean completada;

    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    // Getters y Setters para acceder y modificar el estado de la tarea.
    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
}

// Clase Renderer Personalizado: Define la Apariencia de Cada Elemento de la Lista
class TareaCellRenderer extends DefaultListCellRenderer {
    
    // Este método se llama para dibujar cada elemento de la lista.
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        // Llama al método de la clase padre para manejar la selección y el foco por defecto.
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        
        // Convierte el Object genérico al tipo Tarea.
        Tarea tarea = (Tarea) value;
        
        // Establece el texto del elemento como la descripción de la tarea.
        setText(tarea.getDescripcion());
        
        // Aplica el estilo si la tarea está completada.
        if (tarea.isCompletada()) {
            // Cambia la fuente a cursiva.
            setFont(getFont().deriveFont(Font.ITALIC));
            // Cambia el color del texto a verde (simulando una tarea "Entregada").
            setForeground(Color.GREEN.darker());
        } else {
            // Restaura el estilo si la tarea está pendiente.
            setFont(getFont().deriveFont(Font.PLAIN));
            setForeground(Color.BLACK);
        }
        
        // Devuelve el componente con el estilo aplicado para que sea dibujado.
        return this;
    }
}