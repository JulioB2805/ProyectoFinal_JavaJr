// Clase Persona: representa a una persona con nombre, edad y cédula
public class Persona {
    private String nombre;
    private int edad;
    private int cedula;

    // Constructor con validación de cédula
    public Persona(String nombre, int edad, int cedula) {
        this.nombre = nombre; // 1. Asigna el nombre recibido al atributo
        this.edad = edad;     // 2. Asigna la edad recibida al atributo

        // 3. Validación: la cédula debe ser mayor a 500000
        if (cedula > 500000) {
            this.cedula = cedula;
        } else {
            System.out.println("Error: la cédula debe ser mayor a 500000.");
            this.cedula = -1; // 4. Valor inválido si no cumple la condición
        }
    }

    // 5. Método para mostrar datos de la persona
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Cédula: " + cedula);
    }
}
