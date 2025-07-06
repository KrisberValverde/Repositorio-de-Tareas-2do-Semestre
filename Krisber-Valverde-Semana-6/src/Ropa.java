/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Programa para la gestion de venta de ropa de una boutique
//Clase base o Clase Padre que representa una prenda de ropa de la boutique
public class Ropa {
    // Atributos privados
    private String nombre;
    private String talla;
    private double precio;
    
    //Constructor vacío
    public Ropa() {
    }
    
    //Constructor con parámetros
    public Ropa(String nombre, String talla, double precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }
    
    // Métodos getters públicos con acceso controlado a los atributos
    public String getNombre() {
        return nombre;
    }
    public String getTalla() {
        return talla;
    }
    public double getPrecio() {
        return precio;
    }
  
    // Método para calcular descuento
    public double CalcularDescuento(double porcentaje){
        return precio - (precio * porcentaje/100);
    } 
}

