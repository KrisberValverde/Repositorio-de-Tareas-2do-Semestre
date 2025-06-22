/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjemplosMundoReal_POO;

//Clase principal
public class EdificioResidencial {
    private String direccion;
    private int numeroDePisos;
    private int numeroDeDepartamentos;

    public EdificioResidencial() {
    }

    public EdificioResidencial(String direccion, int numeroDePisos, int numeroDeDepartamentos) {
        this.direccion = direccion;
        this.numeroDePisos = numeroDePisos;
        this.numeroDeDepartamentos = numeroDeDepartamentos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public int getNumeroDeDepartamentos() {
        return numeroDeDepartamentos;
    }

    public void setNumeroDeDepartamentos(int numeroDeDepartamentos) {
        this.numeroDeDepartamentos = numeroDeDepartamentos;
    }
    
    public void mostrarInfo(){
        System.out.println("Direccion: "+ direccion);
        System.out.println("Numero de pisos : "+ numeroDePisos);
        System.out.println("Numero de departamentos: "+ numeroDeDepartamentos);
    }
}
