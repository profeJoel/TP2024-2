import java.util.ArrayList;

//package U1.Clase10;

public class Colaborador {
    private String nombre;
    private String rut;
    private String cargo;
    private Contacto contacto;
    private ArrayList<Cliente> clientes;

    public Colaborador(String nombre, String rut, String cargo, Contacto contacto){
        this.nombre = nombre;
        this.rut = rut;
        this.cargo = cargo;
        this.contacto = contacto;
        this.clientes = new ArrayList<Cliente>();
    }

    public void agregarCliente(Cliente nuevoCliente){
        this.clientes.add(nuevoCliente);
    }

    public String toString(){
        String salida = "";
        salida += "Colaborador: " + this.nombre + " (" +this.rut+") cargo: " + this.cargo +" y contacto: " +this.contacto;
        // la variable cliente tomara el valor de cada una de las posiciones dentro del ArrayList clientes y se entregara el String de cada informacion.
        for(Cliente cliente: this.clientes){
            salida += "\n" + cliente;
        }
        return salida;
    }
}
