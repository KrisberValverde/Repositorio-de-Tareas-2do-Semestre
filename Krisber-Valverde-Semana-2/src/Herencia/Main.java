/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author USUARIO
 */
// Ejecuta el código de herencia
public class Main {
    public static void main(String[]args){
        //Se crea una nueva clase y esta puede heredar los atrubutos de la clase madre y la clase hija
        Pastel pastel = new Pastel();
        pastel.getNombre();
        pastel.getBizcocho();
        pastel.getRelleno();
    
    //Ejecución    
    System.out.println("Nombre: Pastel"); 
    System.out.println("Bizcocho: Chocolate");
    System.out.println("Relleno: Dulce de leche");
    
     }
    
}
