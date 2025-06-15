/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

//Ejemplo de abstracción:
public class Libro {
    // Atributos
    private String nombre;
    private String autor;
    private double precio;
    
    // Construcctor
    public Libro(String nombre, String autor, double precio) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
    }
    
    // Método para comprar el libro
    public void comprar() {
        System.out.println("El libro que has comprado es " + nombre + " de " + autor +"por $" + precio);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Se crea el objeto Libro
        Libro libro = new Libro("El Principe Cruel", "Holly Black ", 22.50);
        
        // Se compra el libro
        libro.comprar();
    }
}
