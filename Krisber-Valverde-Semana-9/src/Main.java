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
        GestorDeArchivo gestor = new GestorDeArchivo();
        ValidadorArchivo validador = new ValidadorArchivo();
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
            System.out.println(e.getMessage());
        }
    }
    
}
