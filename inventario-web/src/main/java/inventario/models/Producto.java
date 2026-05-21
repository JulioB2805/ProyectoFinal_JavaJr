package inventario.models;

public class Producto {
    // Atributos
    Long codigoBarras;
    String descripcion;
    Integer stock;
    Double precio;

    // Constructor vacío
    public Producto() {
        super();
    }

    // Constructor con parámetros
    public Producto(Long codigoBarras, String descripcion, Integer stock, Double precio) {
        super();
        this.codigoBarras = codigoBarras;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters y Setters
    public Long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(Long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
