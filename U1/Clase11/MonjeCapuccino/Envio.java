//package U1.Clase11.MonjeCapuccino;

public class Envio {
    private int nSeguimiento;
    private String descripcion;
    private String direccion;
    private double montoEnvio;
    private String fechaEstimada;

    public Envio(int nSeguimiento, String descripcion, String direccion, double montoEnvio, String fechaEstimada){
        this.nSeguimiento = nSeguimiento;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.montoEnvio = montoEnvio;
        this.fechaEstimada = fechaEstimada;
    }

    public double getPrecio(){
        return this.montoEnvio;
    }
}
