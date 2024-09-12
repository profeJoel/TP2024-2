//package U1.Clase11.MonjeCapuccino;
import java.util.ArrayList;
import java.time.LocalDate;

public class CompraVenta {
    private ArrayList<Producto> listadoCompra;
    private double totalNeto;
    private double IVA;
    private double totalBruto;
    private Envio envio;
    private String fecha;

    public CompraVenta(ArrayList<Producto> productos, Envio envio){
        this.listadoCompra = new ArrayList<Producto>();
        this.listadoCompra = (ArrayList<Producto>) productos.clone();
        this.totalNeto = 0;
        for(Producto producto: this.listadoCompra){
            this.totalNeto += producto.precio;
        }
        this.envio = envio;
        this.IVA = (this.totalNeto + this.envio.getPrecio()) * 0.19;
        this.totalBruto = this.totalNeto + this.envio.getPrecio() + this.IVA;
        this.fecha = LocalDate.now().toString();// Es una funcion que devuelve la fecha actual y lo obligo a ser un string
    }
}
