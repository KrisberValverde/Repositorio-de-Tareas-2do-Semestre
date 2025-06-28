/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//Se usan importaciones para que el programa funcione
//Permite crear una lista lista dinamica de productos
import java.util.ArrayList;
//Permite leer la entrada del usuario desde la consola
import java.util.Scanner;

//Programa creado para administrar una Caferia
//Clase principal del programa
public class Cafeteria {
    
    //Lista para almacenar un producto
    private static ArrayList<Producto> productos = new ArrayList<>();
    
    //Clase para representar un producto
    static class Producto {
        private String nombre;
        private float precio;
        private int cantidad;
        private boolean disponible;
        
        //Constructor para crear un producto
        public Producto(String nombre, float precio, int cantidad, boolean disponible) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
            this.disponible = disponible;
        }
        
        //Getters y Setters para acceder a los atributos del producto
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public float getPrecio() {
            return precio;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        public int getCantidad() {
            return cantidad;
        }

        public void setCantidad(int cantidad) {
            this.cantidad = cantidad;
        }

        public boolean isDisponible() {
            return disponible;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }
        
    }
    
    //Funcion para agregar un producto
    private static void AgregarProducto(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        float precio = scanner.nextFloat();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();
        System.out.print("El producto esta disponible true/false: ");
        boolean disponible = scanner.nextBoolean();
        scanner.nextLine();
        
        Producto producto = new Producto(nombre, precio, cantidad, disponible);
        productos.add(producto);
        System.out.println("El producto se agrego con exito.");
    }
    
    //Funcion para visualizar productos
    private static void VisualizarProductos(){
        if (productos.isEmpty()){
            System.out.println("No hay productos registrados.");
        } else {
            for(int i = 0; i < productos.size(); i++){
                Producto producto = productos.get(i);
                System.out.println("Producto: " + (i + 1));
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: $" + producto.getPrecio());
                System.out.println("Cantidad: " + producto.getCantidad());
                System.out.println("Disponible: " + producto.isDisponible());
                System.out.println();
            }
        }
    }
    
    //Funcion para eliminar un producto
    private static void EliminarProducto(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Ingrese el nombre del producto que quiere eliminar: ");
        String nombre = scanner.nextLine();
        
        for(Producto producto: productos){
            if (producto.getNombre().equals(nombre)){
                productos.remove(producto);
                System.out.println("El producto se elimino con exito.");
                return;
            }
        }
        System.out.println("El producto no fue encontrado.");
    }
    //Funcion principal del programa 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Agregar Producto");
            System.out.println("2. Visualizar Producto");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Salir");
            System.out.println("Ingrese su opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcion){
                case 1:
                    AgregarProducto();
                    break;
                case 2:
                    VisualizarProductos();
                    break;
                case 3:
                    EliminarProducto();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción invalida. Intente nuevamente.");
            }
        }   
    }    
}
