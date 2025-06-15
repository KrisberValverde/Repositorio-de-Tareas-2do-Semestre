/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author USUARIO
 */

//Ejecuta el código de polimorfismo
public class NewMain {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Aplicación del polimorfismo
        Ropa vector []= new Ropa[2];
        vector[0] = new Ropa();
        
        vector [1]= new Vestidos();
        
        //Ejecución de código
         System.out.println("Vestidos:");  
         System.out.println("Talla: S");
         System.out.println("Estilo: Estampado");
    }
    
}
