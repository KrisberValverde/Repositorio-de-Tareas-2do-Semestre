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
    public void guardar(String nombreArchivo, String contenido){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))){
            writer.write(contenido);
        } 
        catch(IOException e){
            System.err.println("Error al guardar en el archivo: "+ e.getMessage());
        }
    }
    public String leer(String nombreArchivo){
        StringBuilder contenido = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))){
        String linea;
            while ((linea = reader.readLine())!= null){
                contenido.append(linea).append("\n");
            }
        } 
        catch(IOException e){
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return contenido.toString();
    }    
}
