/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

//Clase Joyas que es la clase base
public class Joyas {
    private String nombre;
    private String material;
    private double precio;

    // Constructor por defecto, no tiene parámetros
    public Joyas() {
        this.nombre = "";
        this.material = "";
        this.precio = 0.0;
    }

    // Constructor con todos los atributos como parámetros
    public Joyas(String nombre, String material, double precio) {
        this.nombre = nombre;
        this.material = material;
        this.precio = precio;
    }

    // Constructor sobrecargado que asume que el material es "Desconocido" si no se especifica
    public Joyas(String nombre, double precio) {
        this(nombre,"Desconocido",precio);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getMaterial() {
        return material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // Método para mostrar la información de la joya
    public void mostrarInfo(){
       System.out.println("Nombre: "+ nombre);
       System.out.println("Material: "+ material);
       System.out.println("Precio: $ " + precio);
    }
}
