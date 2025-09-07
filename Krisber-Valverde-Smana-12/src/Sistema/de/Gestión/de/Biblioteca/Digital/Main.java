/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sistema.de.Gestión.de.Biblioteca.Digital;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Crear una instancia de la clase Biblioteca.
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("--- 1. Registrar usuarios ---");
        // Se registran dos usuarios en la biblioteca.
        biblioteca.registrarUsuario(new Usuario("U1", "Berta"));
        biblioteca.registrarUsuario(new Usuario("U2", "Lucas"));
        System.out.println();

        System.out.println("--- 2. Añadir libros al catalogo ---");
        // Se añaden dos libros al catálogo de la biblioteca.
        biblioteca.añadirLibro(new Libro("ISBN-001", "The King's captive ", "K. M. Shea", "Fantasia"));
        biblioteca.añadirLibro(new Libro("ISBN-002", "The Predator", "Runyx", "Dark romance"));
        System.out.println();

        System.out.println("--- 3. Prestar libros ---");
        // Se prestan los libros a los usuarios.
        biblioteca.prestarLibro("U1", "ISBN-001");
        biblioteca.prestarLibro("U2", "ISBN-002");
        // Este intento fallará porque el libro ya está prestado.
        biblioteca.prestarLibro("U1", "ISBN-002");
        System.out.println();

        System.out.println("--- 4. Listar libros prestados de Berta (U1) ---");
        // Se obtiene y se imprime la lista de libros que Berta tiene prestados.
        List<Libro> librosAna = biblioteca.listarPrestados("U1");
        librosAna.forEach(System.out::println);
        System.out.println();

        System.out.println("--- 5. Devolver libro 'The King's captive' por Berta (U1) ---");
        // Berta devuelve el libro.
        biblioteca.devolverLibro("U1", "ISBN-001");
        System.out.println();

        System.out.println("--- 6. Listar libros prestados de Berta despues de la devolucion ---");
        // Se comprueba que la lista de libros prestados de Berta esté vacía.
        librosAna = biblioteca.listarPrestados("U1");
        if (librosAna.isEmpty()) {
            System.out.println(" no tiene libros prestados.");
        } else {
            librosAna.forEach(System.out::println);
        }
        System.out.println();

        System.out.println("--- 7. Buscar por autor 'K. M. Shea' ---");
        // Se realiza una búsqueda por autor y se imprimen los resultados.
        List<Libro> librosBloch = biblioteca.buscarPorAutor("Shea");
        librosBloch.forEach(System.out::println);
        System.out.println();

        System.out.println("--- 8. Buscar por categoria 'Fantasia' ---");
        // Se realiza una búsqueda por categoría y se imprimen los resultados.
        List<Libro> librosSoftware = biblioteca.buscarPorCategoria("Fantasia");
        librosSoftware.forEach(System.out::println);
    }
}
