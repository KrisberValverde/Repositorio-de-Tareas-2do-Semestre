/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author USUARIO
 */
public class Pastel extends Postre{
    int opciones;
    String bizcocho;
    String relleno;
    
    //Constructor
    public Pastel() {
    }
    
    public Pastel(int opciones, String bizcocho, String relleno, int descripción, String nombre, int cantidad, double precio) {
        super(descripción, nombre, cantidad, precio);
        this.opciones = opciones;
        this.bizcocho = bizcocho;
        this.relleno = relleno;
    }

    public int getOpciones() {
        return opciones;
    }

    public void setOpciones(int opciones) {
        this.opciones = opciones;
    }

    public String getBizcocho() {
        return bizcocho;
    }

    public void setBizcocho(String bizcocho) {
        this.bizcocho = bizcocho;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }
}

