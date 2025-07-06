/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Clase Principal que ejecuta el código

public class Boutique {

    public static void main(String[] args) {
        // Crear instancia de Vestidos
        Vestidos vestidos = new Vestidos("Largo", "Gamusa", "Vestido", "M", 40);
        // Crear instancia de Camisas
        Camisas camisas = new Camisas("Blanco", "Masculino", "Camisa", "S", 25);
        
        System.out.println("Compra realizada en la Boutique:");
        System.out.println();
        
        // Mostrar datos de la camisa
        System.out.println("Producto 1: ");
        System.out.println("Nombre: "+ camisas.getNombre());
        System.out.println("Precio: "+ camisas.getPrecio());
        System.out.println("Talla: "+ camisas.getTalla());
        System.out.println("Color: "+ camisas.getColor());
        System.out.println("Precio con descuento 10%: "+ camisas.CalcularDescuento(10));
        
        System.out.println();
        // Mostrar datos del vestido
        System.out.println("Producto 2: ");
        System.out.println("Nombre: "+ vestidos.getNombre());
        System.out.println("Precio: "+ vestidos.getPrecio());
        System.out.println("Talla: "+ vestidos.getTalla());
        System.out.println("Medida: "+ vestidos.getMedida());
        System.out.println("Material: "+ vestidos.getMaterial());
        System.out.println("Precio con descuento 10%: "+ vestidos.CalcularDescuento(10));
    }
    
}
