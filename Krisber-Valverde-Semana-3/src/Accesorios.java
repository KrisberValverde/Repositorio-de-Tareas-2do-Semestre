/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
//Ejemplo de Programación tradicional:
public class Accesorios {
    public static void main(String[] args) {
        // TODO code application logic here
    
    //Variables para almacenar información de los acesorios
    String[] nombres = new String[2];
    double[] precios = new double [2];
    String[] materiales = new String[2];
    
    // Inicializar las variables
    nombres[0] = "Collar de esmeralda";
    precios[0] = 250.00;
    materiales[0] = "Oro y esmeralda";
    
    nombres[1] = "Pulsera";
    precios[1] = 80.00;
    materiales[1] = "Plata";
    
    // Mostrar info de los accesorios
    for(int i = 0; i <nombres.length; i++){
        System.out.println("Nombre: "+ nombres[i]);
        System.out.println("Material: "+ materiales[i]);
        System.out.println("Precio: "+ precios[i]);
        System.out.println();
    }
  }        
}
