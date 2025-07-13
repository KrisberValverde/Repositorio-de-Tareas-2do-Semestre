/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

// Clase Collares que hereda de la clase joyas
public class Collares extends Joyas {
    // Atributo específico de la clase
    private double longitud;
    
    // Constructor por defecto, no tiene parámetros
    public Collares() {
        super();   
        this.longitud = 0.0;
    }
    
    // Constructor con todos los atributos como parámetros
    public Collares(double longitud, String material, double precio) {
        super("Collar", material, precio);
        this.longitud = longitud;
    }
    
    // Constructor sobrecargado
    public Collares(double precio, double longitud) {
        super("Collar", precio);
        this.longitud = longitud;
    }
    
    // Getters y Setters
    public double getLongitud() {
        return longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    // Método que sobreescribe mostrarInfo() de la clase Joyas para añadir longitud
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Longitud: "+ longitud +" cm");        
    }
}
