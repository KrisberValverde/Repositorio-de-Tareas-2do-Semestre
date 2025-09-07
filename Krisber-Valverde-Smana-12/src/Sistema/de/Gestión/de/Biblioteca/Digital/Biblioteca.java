/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistema.de.Gestión.de.Biblioteca.Digital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


//Clase que gestiona el sistema de la biblioteca.
//Controla el catálogo de libros, los usuarios y el estado de los préstamos.

public class Biblioteca {
    // Mapa para almacenar los libros, usando el ISBN como clave para acceso rápido.
    private final Map<String, Libro> catalogoPorIsbn;
    // Mapa para almacenar los usuarios, usando el ID como clave.
    private final Map<String, Usuario> usuariosPorId;
    // Conjunto para rastrear los ISBN de los libros que están actualmente prestados.
    // El Set es eficiente para verificar si un libro ya está prestado (operación contains).
    private final Set<String> isbnsPrestados;

    
    //Constructor de la Biblioteca. Inicializa todas las colecciones.
    
    public Biblioteca() {
        this.catalogoPorIsbn = new HashMap<>();
        this.usuariosPorId = new HashMap<>();
        this.isbnsPrestados = new HashSet<>();
    }

    
    //Añade un nuevo libro al catálogo si su ISBN no existe.
    
    public void añadirLibro(Libro libro) {
        if (catalogoPorIsbn.containsKey(libro.getIsbn())) {
            System.out.println("Error: El libro con ISBN " + libro.getIsbn() + " ya existe.");
            return;
        }
        catalogoPorIsbn.put(libro.getIsbn(), libro);
        System.out.println("Libro añadido: " + libro.getTitulo());
    }

    //Quita un libro del catálogo si no está prestado.
    public void quitarLibro(String isbn) {
        if (isbnsPrestados.contains(isbn)) {
            System.out.println("Error: El libro no se puede quitar, está prestado.");
            return;
        }
        Libro libroRemovido = catalogoPorIsbn.remove(isbn);
        if (libroRemovido != null) {
            System.out.println("Libro quitado: " + libroRemovido.getTitulo());
        } else {
            System.out.println("Error: El libro con ISBN " + isbn + " no se encontró.");
        }
    }

   
    //Registra un nuevo usuario si su ID no existe.
    
    public void registrarUsuario(Usuario usuario) {
        if (usuariosPorId.containsKey(usuario.getId())) {
            System.out.println("Error: El usuario con ID " + usuario.getId() + " ya existe.");
            return;
        }
        usuariosPorId.put(usuario.getId(), usuario);
        System.out.println("Usuario registrado: " + usuario.getNombre());
    }

    
    //Da de baja a un usuario si no tiene libros prestados.
    
    public void darBajaUsuario(String id) {
        Usuario usuario = usuariosPorId.get(id);
        if (usuario == null) {
            System.out.println("Error: El usuario con ID " + id + " no se encontró.");
            return;
        }
        if (!usuario.getIsbnsPrestados().isEmpty()) {
            System.out.println("Error: El usuario no puede ser dado de baja, tiene libros prestados.");
            return;
        }
        usuariosPorId.remove(id);
        System.out.println("Usuario dado de baja: " + usuario.getNombre());
    }

    
    //Presta un libro a un usuario.
    //Verifica que el usuario y el libro existan y que el libro no esté ya prestado.
    
    public void prestarLibro(String idUsuario, String isbn) {
        Usuario usuario = usuariosPorId.get(idUsuario);
        Libro libro = catalogoPorIsbn.get(isbn);

        if (usuario == null) {
            System.out.println("Error: Usuario con ID " + idUsuario + " no encontrado.");
            return;
        }
        if (libro == null) {
            System.out.println("Error: Libro con ISBN " + isbn + " no encontrado.");
            return;
        }
        if (isbnsPrestados.contains(isbn)) {
            System.out.println("Error: El libro con ISBN " + isbn + " ya está prestado.");
            return;
        }

        usuario.añadirLibroPrestado(isbn);
        isbnsPrestados.add(isbn);
        System.out.println("Libro '" + libro.getTitulo() + "' prestado a '" + usuario.getNombre() + "'.");
    }

    
    //Devuelve un libro prestado por un usuario.
    //Verifica que el usuario y el libro existan y que el usuario realmente lo tenga prestado.
    public void devolverLibro(String idUsuario, String isbn) {
        Usuario usuario = usuariosPorId.get(idUsuario);
        Libro libro = catalogoPorIsbn.get(isbn);

        if (usuario == null) {
            System.out.println("Error: Usuario con ID " + idUsuario + " no encontrado.");
            return;
        }
        if (libro == null) {
            System.out.println("Error: Libro con ISBN " + isbn + " no encontrado.");
            return;
        }
        if (!usuario.getIsbnsPrestados().contains(isbn)) {
            System.out.println("Error: El usuario '" + usuario.getNombre() + "' no tiene prestado el libro '" + libro.getTitulo() + "'.");
            return;
        }

        usuario.removerLibroPrestado(isbn);
        isbnsPrestados.remove(isbn);
        System.out.println("Libro '" + libro.getTitulo() + "' devuelto por '" + usuario.getNombre() + "'.");
    }

    //Busca libros por un texto en el título.
    //Utiliza Java Stream API para filtrar los libros de manera concisa.

    public List<Libro> buscarPorTitulo(String texto) {
        return catalogoPorIsbn.values().stream()
                .filter(libro -> libro.getTitulo().toLowerCase().contains(texto.toLowerCase()))
                .collect(Collectors.toList());
    }

    
    //Busca libros por un texto en el autor.
    public List<Libro> buscarPorAutor(String texto) {
        return catalogoPorIsbn.values().stream()
                .filter(libro -> libro.getAutor().toLowerCase().contains(texto.toLowerCase()))
                .collect(Collectors.toList());
    }
    
    //Busca libros por un texto en la categoría.
    public List<Libro> buscarPorCategoria(String texto) {
        return catalogoPorIsbn.values().stream()
                .filter(libro -> libro.getCategoria().toLowerCase().contains(texto.toLowerCase()))
                .collect(Collectors.toList());
    }

    
    //Lista los libros que un usuario específico tiene prestados.
    public List<Libro> listarPrestados(String idUsuario) {
        Usuario usuario = usuariosPorId.get(idUsuario);
        if (usuario == null) {
            System.out.println("Error: Usuario con ID " + idUsuario + " no encontrado.");
            return new ArrayList<>();
        }
        List<Libro> librosPrestados = new ArrayList<>();
        // Itera sobre los ISBN que el usuario tiene prestados y los busca en el catálogo principal.
        for (String isbn : usuario.getIsbnsPrestados()) {
            librosPrestados.add(catalogoPorIsbn.get(isbn));
        }
        return librosPrestados;
    }
}
