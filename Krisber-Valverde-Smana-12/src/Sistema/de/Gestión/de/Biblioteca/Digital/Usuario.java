/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.de.Gestión.de.Biblioteca.Digital;

import java.util.ArrayList;
import java.util.List;


//Clase que representa a un Usuario de la biblioteca.
//Mantiene un registro de los ISBN de los libros que tiene prestados.

public class Usuario {
    private final String id;
    private final String nombre;
    // Lista para almacenar los ISBN de los libros que el usuario tiene prestados.
    private final List<String> isbnsPrestados;

    //Constructor para crear un objeto Usuario.
    //Inicializa la lista de libros prestados como una lista vacía.

    public Usuario(String id, String nombre) {
        if (id == null || id.isBlank() || nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El ID y el nombre del usuario no pueden ser nulos o vacíos.");
        }
        this.id = id;
        this.nombre = nombre;
        this.isbnsPrestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    
    //Devuelve una copia de la lista de ISBNs prestados para mantener el encapsulamiento.
    //Esto evita que el código externo modifique directamente la lista interna del usuario.
 
    public List<String> getIsbnsPrestados() {
        return new ArrayList<>(isbnsPrestados);
    }

    
    //Añade el ISBN de un libro a la lista de prestados del usuario.

    public void añadirLibroPrestado(String isbn) {
        this.isbnsPrestados.add(isbn);
    }

    
    //Remueve el ISBN de un libro de la lista de prestados del usuario.
    public void removerLibroPrestado(String isbn) {
        this.isbnsPrestados.remove(isbn);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", isbnsPrestados=" + isbnsPrestados +
                '}';
    }
}