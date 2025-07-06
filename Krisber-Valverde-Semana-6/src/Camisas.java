/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Subclase o clase hija que hereda de la clase padre Ropa, representa una prenda de ropa de la boutique
public class Camisas extends Ropa {
    // Atributos privados
    private String color;
    private String genero;
   
    //Constructor vacío
    public Camisas() {
    }
    //Constructor con parámetros
    public Camisas(String color, String genero, String nombre, String talla, double precio) {
        super(nombre, talla, precio);
        this.color = color;
        this.genero = genero;
    }

    // Métodos propios de la clase hija
    public String getColor() {
        return color;
    }
    public String getGenero() {
        return genero;
    }
    
    // Se sobrescribe el método de la clase base
    @Override
    public double CalcularDescuento(double porcentaje){
        return super.CalcularDescuento(porcentaje + 10);
    }
}
