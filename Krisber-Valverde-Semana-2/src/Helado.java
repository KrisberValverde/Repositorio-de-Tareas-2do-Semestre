/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

//Ejemplo de Encapsulación

public class Helado {
    //Atributos
    private String sabor;
    private int cantidad;
    private double precio;
    
    // Constructor

    public Helado(String sabor, int cantidad, double precio) {
        this.sabor = sabor;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    //Métodos de compra 

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
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
    
    public void MostrarInformacion(){
        System.out.println("Sabor: "+ sabor);
        System.out.println("Cantidad: "+ cantidad);
        System.out.println("Precio: "+ precio);
    }
    public static void main(String[]args){
        Helado helado = new Helado("Chocolate", 2, 3.25);
        System.out.println("Compra de helado : ");
        helado.MostrarInformacion();
    }
}

