/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
//Ejemplo de Programación Orientada a Objetos
public class Accesorio {

    //Atributos
    private String nombre;
    private double precio;
    private String material;
    
    //Constructor

    public Accesorio(String nombre, double precio, String material) {
        this.nombre = nombre;
        this.precio = precio;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    
    //Métodos para comprar
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Material: "+ material);
        System.out.println("Precio: "+ precio);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Crear Objeto Accesorio
        Accesorio collar = new Accesorio("Collar esmeralda", 250.00,"Oro y esmeralda");        
        Accesorio pulcera = new Accesorio("Pulsera", 80.00, "Plata");
        
        //Mostramos la información:
        collar.mostrarInfo();
        System.out.println();
        pulcera.mostrarInfo();
    }
}
