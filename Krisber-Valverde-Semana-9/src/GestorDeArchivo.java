/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GestorDeArchivo {
     // Método para guardar contenido en un archivo
    public void guardar(String nombreArchivo, String contenido){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))){
            writer.write(contenido); // Escribir el contenido en el archivo
        } 
        catch(IOException e){
            System.err.println("Error al guardar en el archivo: "+ e.getMessage());
        }
    }
    // Método para leer el contenido de un archivo y devolverlo como String
    public String leer(String nombreArchivo){
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))){
        String linea;
            // Leer línea por línea hasta que sea null (fin del archivo)
            while ((linea = reader.readLine())!= null){
                contenido.append(linea).append("\n");
            }
        } 
        catch(IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString(); // Devolver el contenido leído
    }    
}
