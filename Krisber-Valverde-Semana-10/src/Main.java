/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

// Importa la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crea una instancia de Inventario
        Inventario inventario = new Inventario();
        // Crea un Scanner para leer entradas desde la consola
        Scanner scanner = new Scanner(System.in);
        // Variable para almacenar la opción seleccionada por el usuario
        int opcion;

        do {
            // Muestra el menú de opciones
            System.out.println("\n--- MENU ---");
            System.out.println("1. Mostrar inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            // Lee la opción elegida
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer del scanner para evitar errores al leer líneas de texto

            switch (opcion) {
                    // Muestra los productos del inventario
                case 1:
                    inventario.mostrarProductos();
                    break;
                    // Pide al usuario los datos del nuevo producto
                case 2:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine(); // Lee el nombre del producto
                    System.out.print("Cantidad: "); 
                    int cantidad = scanner.nextInt(); // Lee la cantidad
                    // Agrega el producto al inventario
                    inventario.agregarProducto(new Producto(nombre, cantidad));
                    break;
                    // Pide al usuario el nombre del producto a eliminar
                case 3:
                    System.out.print("Nombre del producto a eliminar: ");
                    String eliminar = scanner.nextLine(); // Lee el nombre del producto a eliminar
                    inventario.eliminarProducto(eliminar); // Elimina el producto del inventario
                    break;
                case 0:
                    // Sale del programa
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 0); // Repite el menú mientras la opción no sea 0 (salir)

        scanner.close(); // Cierra el scanner para liberar recursos
    }
}
