//package U1.Clase11.MonjeCapuccino;
import java.util.ArrayList;

public class CarritoCompra {
    private ArrayList<Producto> listaProductos;

    public CarritoCompra(){
        this.listaProductos = new ArrayList<Producto>();
    }

    public void agregarProductoAlCarrito(Producto p){
        this.listaProductos.add(p);
    }

    public ArrayList<Producto> getListaProductos(){
        return this.listaProductos;
    }

    public void limpiarCarrito(){
        this.listaProductos.clear();
    }
}
