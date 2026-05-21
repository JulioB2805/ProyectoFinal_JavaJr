package biblioteca;

import java.util.ArrayList;
import java.util.List; // 2. Importa la interfaz List para manejar colecciones de libros

public class Biblioteca {

    // 3. Declaración de la lista de libros: almacena todos los objetos Libro
    private List<Libro> libros;

    // 4. Constructor: inicializa la lista como un ArrayList vacío
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // 5. Método para agregar un libro a la colección
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para listar todos los libros registrados
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros registrados en la biblioteca.");
        } else {
            System.out.println("Listado de libros:");
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}
