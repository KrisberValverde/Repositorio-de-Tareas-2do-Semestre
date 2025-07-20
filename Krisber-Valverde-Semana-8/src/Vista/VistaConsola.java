/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

// Clase que implementa la interfaz de Visualización para interactuar con la consola
public class VistaConsola implements Vizualización{
    // Atributo que se utiliza para leer la entrada del usuario
    private Scanner scanner;

    // Constructor que inicializa el escáner para leer entradas
    public VistaConsola() {
        scanner = new Scanner(System.in);
    }
    
    // Método que lee la entrada del usuario y la retorna como un String
    @Override 
    public String leerEntrada(){
    return scanner.nextLine();
    }
    
    // Método que muestra un mensaje en la consola
    @Override
    public void mostrarMensaje(String mensaje){
    System.out.println(mensaje);
    }
            
}

