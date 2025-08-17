/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
// Clase que extiende Exception para definir una excepción personalizada
public class ArchivoVacioException extends Exception {
    public ArchivoVacioException(String mensaje){
        // Llamada al constructor de la clase padre (Exception) con el mensaje personalizado
        super(mensaje);
    }
}
