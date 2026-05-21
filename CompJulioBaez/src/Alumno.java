// Clase Alumno: representa a un estudiante con sus datos personales y asignatura
public class Alumno {
    private String nombre;
    private int edad;
    private Asignatura asignatura;

    // Constructor vacío
    public Alumno() {}

    // Constructor con parámetros
    public Alumno(String nombre, int edad, Asignatura asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
    }

    // Métodos GET y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
