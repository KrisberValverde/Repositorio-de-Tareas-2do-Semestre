/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

// Clase principal Joyería, se ejecuta el código
public class Joyeria {

    public static void main(String[] args) {
       
        // Se crea un objeto de tipo Collares llamado collar1
        Collares collar1 = new Collares();
        collar1.setNombre("Collar");
        collar1.setMaterial("Perlas");
        collar1.setPrecio(80);
        collar1.setLongitud(24);
        
        // Se crea un objeto de tipo Anillos llamado anillo1
        Anillos anillo1 = new Anillos ();
        anillo1.setNombre("Anillo");
        anillo1.setMaterial("Oro blanco");
        anillo1.setPrecio(120);
        anillo1.setTalla(6);
        
        // Se imprime la información del primer producto (collar)
        System.out.println("Producto 1: ");
        collar1.mostrarInfo();
        System.out.println();
        
        // Se imprime la información del segundo producto (anillo)
        System.out.println("Producto 2: ");
        anillo1.mostrarInfo();
        System.out.println();
    }
}
