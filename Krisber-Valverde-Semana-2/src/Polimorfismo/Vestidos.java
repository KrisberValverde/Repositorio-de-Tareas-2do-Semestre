/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author USUARIO
 */
public class Vestidos extends Ropa{

    //Atributos
    int descripción;
    String largo;
    String estilo;
    
    //Constructor

    public Vestidos() {
    }

    public Vestidos(int descripción, String largo, String estilo, int opciones, String tipo, String talla, String color) {
        super(opciones, tipo, talla, color);
        this.descripción = descripción;
        this.largo = largo;
        this.estilo = estilo;
    }

    public int getDescripción() {
        return descripción;
    }

    public void setDescripción(int descripción) {
        this.descripción = descripción;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    } 
}
