/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoReal_POO;

//Clase que extiende de la clase principal
public class Departamento extends EdificioResidencial{
    private int numeroDeHabitaciones;
    private double precio;

    public Departamento() {
    }

    public Departamento(int numeroDeHabitaciones, double precio) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.precio = precio;
    }

    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
 @Override
    public void mostrarInfo(){
        System.out.println("Numero de habitaciones: "+ numeroDeHabitaciones);
        System.out.println("Precio: $ "+ precio);
    }
}
