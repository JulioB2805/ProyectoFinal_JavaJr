// Clase TestAlumno: prueba la creación de un objeto Alumno
public class TestAlumno {
    public static void main(String[] args) {
        // Crear una asignatura
        Asignatura asignatura = new Asignatura("Programación I", 5);

        // Crear un alumno con sus atributos
        Alumno alumno = new Alumno("Gustavo", 22, asignatura);

        // Imprimir los datos del alumno
        System.out.println("Alumno: " + alumno.getNombre() + 
                           ", Edad: " + alumno.getEdad() + 
                           ", Asignatura: " + alumno.getAsignatura().getNombre() + 
                           ", Créditos: " + alumno.getAsignatura().getCreditos());
    }
}
