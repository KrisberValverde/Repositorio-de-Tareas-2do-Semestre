/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

public class Producto {
    // Atributos privados: nombre del producto y su cantidad en inventario
    private String nombre;
    private int cantidad;

    // Constructor de la clase Producto
    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Método para obtener el nombre del producto
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la cantidad del producto
    public int getCantidad() {
        return cantidad;
    }

    // Sobrescribe el método toString() para representar el producto como texto
    @Override
    public String toString() {
        return nombre + "," + cantidad;
    }

    // Método estático que crea un objeto Producto desde un String en formato "nombre,cantidad"
    public static Producto desdeString(String linea) {
        String[] partes = linea.split(","); // Divide la línea usando la coma como separador
        // Crea un nuevo producto usando el primer elemento como nombre y el segundo como cantidad (convertido a entero)
        return new Producto(partes[0], Integer.parseInt(partes[1]));
    }
}
