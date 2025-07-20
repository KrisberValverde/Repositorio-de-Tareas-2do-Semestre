/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dashboard;

import Servicio.RegistroDeTareas;
import Vista.VistaConsola;
import Vista.Vizualización;
import Modelo.Tarea;

// Clase principal que maneja la interacción con el usuario y la lógica del programa
public class Dashboard {
    // Atributos que interactúan con las clases de registro y visualización
    private RegistroDeTareas registroTareas;
    private Vizualización visualizacion; 

    // Constructor que inicializa las instancias de RegistroDeTareas y Visualización
    public Dashboard() {
        registroTareas = new RegistroDeTareas();
        visualizacion = new VistaConsola();
    }
    
    // Método que ejecuta el menú y la lógica de interacción del programa
    public void ejecutar(){
        boolean continuar = true;
        visualizacion.mostrarMensaje("---Bienvenido a mi programa de gestion de tareas---");
        
        // Ciclo que se repite mientras el usuario no elija salir
        while (continuar){
            visualizacion.mostrarMensaje("\nMenu:");
            visualizacion.mostrarMensaje("1. Registrar Tarea");
            visualizacion.mostrarMensaje("2. Ver Tareas Registradas");
            visualizacion.mostrarMensaje("3. Salir");
            visualizacion.mostrarMensaje("\nSeleccione una opcion: ");
            // Lee la opción elegida por el usuario
            String opcion = visualizacion.leerEntrada();
            
            // Selección de opciones a través de un switch
            switch(opcion){
                // Opción para registrar una tarea
                case "1":
                    visualizacion.mostrarMensaje("\nIngrese el nombre de la Tarea: ");
                    String nombreTarea = visualizacion.leerEntrada();
                    Tarea tarea = new Tarea(nombreTarea);
                    registroTareas.registrarTarea(tarea);
                    visualizacion.mostrarMensaje("Tarea registrada con exito!");
                    break;
                // Opción para mostrar las tareas registradas    
                case "2":
                    visualizacion.mostrarMensaje("\n---Lista de tareas registradas---");
                    for(Tarea t: registroTareas.getTareas()){
                    visualizacion.mostrarMensaje("- "+ t.getNombre());
                    }
                    break;
                // Opción para finalizar el programa
                case "3":
                    visualizacion.mostrarMensaje("Programa finalizado. Hasta pronto!");
                    // Detiene el ciclo
                    continuar = false;
                    break;                            
                // Opción no válida
                default:
                    visualizacion.mostrarMensaje("Opción invalida. Intentelo otra vez");
            }
            
        }
    }
    // Método principal que ejecuta la clase Dashboard
    public static void main(String[]args){
        // Crea una nueva instancia de Dashboard
        Dashboard dashboard = new Dashboard();
        // Ejecuta el programa
        dashboard.ejecutar();
    }
}


