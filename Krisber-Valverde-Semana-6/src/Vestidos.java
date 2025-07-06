/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Subclase o clase hija que hereda de la clase padre Ropa, representa una prenda de ropa de la boutique
public class Vestidos extends Ropa {
    // Atributos privados
    private String medida;
    private String Material;
    
    //Constructor vacío
    public Vestidos() {
    }
    
    //Constructor con parámetros
    public Vestidos(String medida, String Material, String nombre, String talla, double precio) {
        super(nombre, talla, precio);
        this.medida = medida;
        this.Material = Material;
    }
        
    // Métodos propios de la clase hija
    public String getMedida() {
        return medida;
    }
    public String getMaterial() {
        return Material;
    }

    // Se sobrescribe el método de la clase base
    @Override
    public double CalcularDescuento(double porcentaje){
        return super.CalcularDescuento(porcentaje + 10);
        }
}
