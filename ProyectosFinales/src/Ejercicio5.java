/*
public class Ejercicio5 {
	public static void main(String []args) {
		Persona p = new Persona("Laura", 28);
		System.out.println("Nombre: " + p.nombre + ", Edad: " + p.edad);
	}
}
class Persona{
	String nombre;
	int edad;
	
	public Persona(_____, _______) {
		this.nombre = nombre;
		this.edad = edad;
	}

}
*/

//Corregido
public class Ejercicio5 {
    public static void main(String []args) {
        Persona p = new Persona("Laura", 28);
        System.out.println("Nombre: " + p.nombre + ", Edad: " + p.edad);
    }
}

class Persona {
    String nombre;
    int edad;

    // Constructor corregido: recibe los parámetros nombre y edad
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}
