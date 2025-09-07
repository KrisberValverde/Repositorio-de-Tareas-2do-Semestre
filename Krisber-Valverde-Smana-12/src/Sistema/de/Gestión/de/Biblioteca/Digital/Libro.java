/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.de.Gestión.de.Biblioteca.Digital;

//Importación para acceder a los objetos
import java.util.Objects;

//Clase inmutable que representa un Libro.
//Sus atributos son finales y no pueden ser modificados después de la creación.

public final class Libro {
    private final String isbn;
    private final String titulo;
    private final String autor;
    private final String categoria;

    //Constructor para crear un objeto Libro.
    //Valida que ninguno de los atributos sea nulo o vacío para asegurar la integridad de los datos.
    //isbn      Identificador único del libro.
    //titulo    Título del libro.
    //autor     Autor del libro.
    //categoria Categoría o género del libro.
    
    public Libro(String isbn, String titulo, String autor, String categoria) {
        if (isbn == null || isbn.isBlank() || titulo == null || titulo.isBlank() ||
            autor == null || autor.isBlank() || categoria == null || categoria.isBlank()) {
            throw new IllegalArgumentException("Los atributos de Libro no pueden ser nulos o vacíos.");
        }
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    // Métodos get para acceder a los atributos del libro.
    // No existen métodos set, reforzando la inmutabilidad.

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    
    //Sobrescribe el método toString() para una representación legible del objeto.
    //Es útil para imprimir información del libro.
    //Una cadena que describe el libro con sus atributos.
    
    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}