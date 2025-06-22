/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjemplosMundoReal_POO;

/**
 *
 * @author USUARIO
 */
public class CodigoEjecucion {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se crea una nueva clase para Edificio Residencial
        System.out.println("Informacion del Edificio");
        EdificioResidencial edificio = new EdificioResidencial("Calle Roldos ",3 ,15);
        edificio.mostrarInfo();
        
        //Se crea una nueva clase para Departamento
        System.out.println();
        System.out.println("Informacion del Departamento");
        Departamento departamento = new Departamento(3,300);
        departamento.mostrarInfo();
        
    }
    
}
