/*
public class Ejercicio7 {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Andrés", 20, "Ingeniería");
        est.presentarse();
    }
}

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

class Estudiante_____ Persona {  
    String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); 
        this.carrera = carrera;
    }

}
*/


//Corregido
public class Ejercicio7 {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Andrés", 20, "Ingeniería");
        est.presentarse();
    }
}

class Usuario {
    String nombre;
    int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

class Estudiante extends Usuario {  
    String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

   
}



