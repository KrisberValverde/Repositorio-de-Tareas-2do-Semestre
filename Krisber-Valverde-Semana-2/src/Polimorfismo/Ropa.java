/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author USUARIO
 */
public class Ropa {
    //Atributos
    int opciones;
    String tipo;
    String talla;
    String color;
    
    //Constructor

    public Ropa() {
    }

    public Ropa(int opciones, String tipo, String talla, String color) {
        this.opciones = opciones;
        this.tipo = tipo;
        this.talla = talla;
        this.color = color;
    }

    public int getOpciones() {
        return opciones;
    }

    public void setOpciones(int opciones) {
        this.opciones = opciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
