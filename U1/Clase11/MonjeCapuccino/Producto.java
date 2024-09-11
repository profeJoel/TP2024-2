package U1.Clase11.MonjeCapuccino;

public class Producto {
    private String SKU;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(String SKU, String nombre, String descripcion, double precio, int stock){
        this.SKU = SKU;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
}
