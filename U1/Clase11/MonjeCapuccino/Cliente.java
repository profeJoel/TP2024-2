//package U1.Clase11.MonjeCapuccino;
import java.util.ArrayList;

public class Cliente {
    private String rut;
    private String nombre;
    private String correo;
    private CarritoCompra carritoCompra;
    private ArrayList<CompraVenta> registroCompras;

    public Cliente(String rut, String nombre, String correo, CarritoCompra carritoCompra){
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.carritoCompra = carritoCompra;
        this.registroCompras = new ArrayList<CompraVenta>();
    }

    public void agregarRegistroCompra(CompraVenta c){
        this.registroCompras.add(c);
    }

    public void agregarProductoAlCarrito(Producto p){
        this.carritoCompra.agregarProductoAlCarrito(p);
    }

    public void comprar(){
        this.registroCompras.add(new CompraVenta(this.carritoCompra.getListaProductos(), new Envio(123456, "productos", "mi casita", 10000, "18/09/2024")));
        this.carritoCompra.limpiarCarrito();
    }
}
