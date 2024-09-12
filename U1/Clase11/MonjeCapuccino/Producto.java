//package U1.Clase11.MonjeCapuccino;

public class Producto {
    protected String SKU;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected int stock;

    public Producto(String SKU, String nombre, String descripcion, double precio, int stock){
        this.SKU = SKU;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
}
