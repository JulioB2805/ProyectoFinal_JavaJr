package biblioteca;

public class Libro {

    // 2. Declaración de atributos privados: encapsulan la información del libro
    private String titulo;
    private String autor;
    private Genero genero;

    // 3. Constructor: inicializa los atributos al crear un objeto Libro
    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    // 4. Métodos getter: permiten acceder a los atributos de forma controlada
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    // 5. Método toString sobrescrito: devuelve una representación en texto del objeto Libro
    @Override
    public String toString() {
        return "Título: " + titulo +
               " | Autor: " + autor +
               " | Género: " + genero;
    }
}
