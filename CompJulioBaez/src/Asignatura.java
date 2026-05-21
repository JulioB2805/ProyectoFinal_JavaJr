// Clase Asignatura: representa una materia que cursa el alumno
public class Asignatura {
    private String nombre;
    private int creditos;

    // Constructor vacío
    public Asignatura() {}

    // Constructor con parámetros
    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }

    // Métodos GET y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}
