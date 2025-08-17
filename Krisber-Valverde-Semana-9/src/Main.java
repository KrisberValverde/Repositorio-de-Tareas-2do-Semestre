/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Main {
    
    public static void main(String[] args) {
        // Crear instancias de las clases GestorDeArchivo y ValidadorArchivo
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();
        // Definir el nombre del archivo y su contenido
        String nombreArchivo = "ejemplo.txt";
        String contenido = "Bienvenido, este es un ejemplo de texto.";
        
        try{
            //Escribir contenido en el Archivo
            gestor.guardar(nombreArchivo, contenido);
            System.out.println("Contenido guardado en el archivo.");
            
            //Leer contenido del archivo
            String contenidoLeido = gestor.leer(nombreArchivo);
            System.out.println("Contenido leido:\n" + contenidoLeido);
            
            //Verificar si el archivo esta vacio
            validador.verificarNoVacio(nombreArchivo);
            System.out.println("El archivo no esta vacio");            
        }
        catch (ArchivoVacioException e){
            // Capturar y mostrar mensaje si el archivo está vacío
            System.out.println(e.getMessage());
        }
    }
    
}
