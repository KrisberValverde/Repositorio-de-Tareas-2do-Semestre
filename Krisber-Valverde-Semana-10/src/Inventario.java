/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.*;

//Clase que almacena los productos
public class Inventario {
    private List<Producto> productos = new ArrayList<>();
    private final String archivo = "inventario.txt";

    //Contructor
    public Inventario() {
        cargarInventario();
    }

    //Agrega productos a la lista y la actualiza
    public void agregarProducto(Producto p) {
        productos.add(p);
        guardarInventario();
        System.out.println("Producto añadido exitosamente.");
    }

    //Elimina el producto y actualiza la lista
    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
        guardarInventario();
        System.out.println("Producto eliminado (si existia).");
    }

    //Muestra el inventario
    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("Inventario vacio.");
        } else {
            for (Producto p : productos) {
                System.out.println(p.getNombre() + " - Cantidad: " + p.getCantidad());
            }
        }
    }

    //Guarda productos del inventario en un archivo .txt
    public void guardarInventario() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Producto p : productos) {
                writer.write(p.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    //Carga los productos desde el archivo automáticamente
    public void cargarInventario() {
        File file = new File(archivo);
        if (!file.exists()) {
            System.out.println("Archivo de inventario no encontrado. Se creará uno nuevo.");
            guardarInventario();
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                productos.add(Producto.desdeString(linea));
            }
        } catch (IOException e) {
            System.err.println("Error al cargar el inventario: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Formato de archivo invalido.");
        }
    }
}