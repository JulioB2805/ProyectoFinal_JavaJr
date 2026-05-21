/*
public class Ejercicio6 {
	 public static void main(String []args) {
		 Producto prod = new Producto();
		 prod.setNombre("Mouse");
		 System.out.println("Producto: "+ prod.getNombre());
	 }

}

class Producto { 
	private String nombre;
	
	public void setNombre(____) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		_____nombre;
	}
}
*/

//Corregido
public class Ejercicio6 {
     public static void main(String []args) {
         Producto prod = new Producto();
         prod.setNombre("Mouse");
         System.out.println("Producto: " + prod.getNombre());
     }
}

class Producto { 
    private String nombre;
    
    // Método setter: recibe un parámetro y lo asigna al atributo
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Método getter: devuelve el valor del atributo nombre
    public String getNombre() {
        return nombre;
    }
}

