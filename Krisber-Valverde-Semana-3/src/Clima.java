/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

//Ejemplo de Programación Orientada A Objetos aplicando el encapsulamiento

//Se utiliza al principio para acceder a la clase scanner más tarde
import java.util.Scanner;

// Clase para representar el clima diario
class ClimaDiario{
    private double temperatura;

    // Costructor para inicializar la temperatura
    public ClimaDiario(double temperatura) {
        this.temperatura = temperatura;
    }
    
    // Método para obtener la temperatura
    public double getTemperatura() {
        return temperatura;
    }   
}

// Clase para representar el clima semanal
class ClimaSemana {
    private ClimaDiario[] dias;

    // Constructor para inicializar la semana del clima
    public ClimaSemana(int numeroDias) {
        dias = new ClimaDiario[numeroDias];
    }
    
    // Método para ingresar datos diaros de temperatura
    public void ingresarDatosDiarios(int indice, double temperatura){
        dias[indice] = new ClimaDiario(temperatura);
    }
    
    // Método para calcular el promedio semanal de temperaturas
    public double calcularPromedioSemanal(){
        double SumaTemperaturas = 0;
        
        for (ClimaDiario dia : dias){
            SumaTemperaturas += dia.getTemperatura();
        }
        return SumaTemperaturas / dias.length;
    }
}

//Clase para ejecutar el código
public class Clima {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ClimaSemana semana = new ClimaSemana( 7 );
        
        // Se registran los días de la semana
        String[] DiasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};   
        
        // Ingreso de datos diarios de las temperaturas
        for(int i= 0; i < 7; i++){
            System.out.println("Ingrese la temperatura del dia "+ DiasSemana [i]+ ":");
            double temperatura = scanner.nextDouble();
            semana.ingresarDatosDiarios(i, temperatura);
        }
        
        // Se calcula el promedio semanal de las temperaturas
        double promedioSemanal = semana.calcularPromedioSemanal();
        System.out.println("Promedio de temperatura semanal: "+ String.format("%.2f", promedioSemanal) + "°C");
    }  
}
