//package U1.Clase11.MonjeCapuccino;

public class Cafe extends Producto{

    private String tipo;
    private String origen;
    private String aroma;
    private int acidez;
    private String molienda;
    private String formato;
    private double cantidad;

    public Cafe(String SKU, String nombre, String descripcion, double precio, int stock, String tipo, String origen, String aroma, int acidez, String molienda, String formato, double cantidad){
        super(SKU, nombre, descripcion, precio, stock);
        this.tipo = tipo;
        this.origen = origen;
        this.aroma = aroma;
        this.acidez = acidez;
        this.molienda = molienda;
        this.formato = formato;
        this.cantidad = cantidad;
    }
    
}
