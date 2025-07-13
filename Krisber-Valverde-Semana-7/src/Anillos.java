/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Clase Anillos que hereda de la clase joyas
public class Anillos extends Joyas {
    // Atributo específico de la clase
    private int talla;

    // Constructor por defecto, no tiene parámetros
    public Anillos() {
        super();
        this.talla = 0;
    }

    // Constructor con todos los atributos como parámetros
    public Anillos(int talla, String nombre, String material, double precio) {
        super(nombre, material, precio);
        this.talla = talla;
    }

    // Getters y Setters
    public double getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    // Método que sobreescribe mostrarInfo() de la clase Joyas para añadir tallas
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Talla: "+ talla);
    }
}
