/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramaciónTradicional;

/**
 *
 * @author USUARIO
 */

// Ejemplo de Programación Tradicional

// Clase principal que representa el clima
public class Clima {
    // Clase interna que representa un día con su temperatura 
    private static class Dia{
    double temperatura;
    
        // Constructor que inicializa la temperatura del día
        public Dia(double temperatura) {
            this.temperatura = temperatura;
        } 
    }
    
    // Método para calcular el promedio semanal de temperatura
    public static void calcularPromedioSemanal(Dia[]dias){
        double sumaTemperatura = 0;
        
        // Creamos un bucle para recorrer los días y sumar su temperatura
        for(Dia dia : dias){
            sumaTemperatura += dia.temperatura;
        }
        
        // Cálculo del promedio semanal de temperaturas 
        double promedioTemperatura = sumaTemperatura / dias.length;
       
        System.out.println("Promedio de temperatura semanal es: " + String.format("%.2f",promedioTemperatura) + "°C" );
    }
    
    //Ejecutamos el código
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dia lunes = new Dia(22);
        Dia martes = new Dia(24);
        Dia miercoles = new Dia(25);
        Dia jueves = new Dia(23);
        Dia viernes = new Dia(27);
        Dia sabado = new Dia(32);
        Dia domingo = new Dia(35);
                
        // Creamos un arreglo 
        Dia[] dias = {lunes, martes, miercoles, jueves, viernes, sabado, domingo};
        
        // Se calcula el promedio de temperatura semanal
        calcularPromedioSemanal(dias);
    }
}
