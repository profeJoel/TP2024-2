//package U1.Clase11.MonjeCapuccino;

public class Insumo extends Producto{

    private String tipo;
    private int cantidad;

    public Insumo(String SKU, String nombre, String descripcion, double precio, int stock, String tipo, int cantidad){
        super(SKU, nombre, descripcion, precio, stock);
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
}
