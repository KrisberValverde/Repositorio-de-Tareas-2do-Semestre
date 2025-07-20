/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.List;
import Modelo.Tarea;

// Clase que maneja el registro y almacenamiento de tareas
public class RegistroDeTareas {
    // Lista para almacenar las tareas registradas
    private List<Tarea> tareas;

    // Constructor que inicializa la lista de tareas
    public RegistroDeTareas() {
        tareas = new ArrayList<>();
    }
    
    // Método que agrega una nueva tarea a la lista
    public void registrarTarea(Tarea tarea){
        tareas.add(tarea);
    }
    
    // Método que devuelve la lista de todas las tareas registradas
    public List<Tarea> getTareas(){
        return tareas;
    }
}
