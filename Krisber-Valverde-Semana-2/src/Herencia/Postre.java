/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author USUARIO
 */

//Clase Padre
public class Postre {
    //Atributos
    int descripción;
    String nombre;
    int cantidad;
    double precio;
    
    //Constructor
    public Postre() {    
    }

    public Postre(int descripción, String nombre, int cantidad, double precio) {
        this.descripción = descripción;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getDescripción() {
        return descripción;
    }

    public void setDescripción(int descripción) {
        this.descripción = descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
