import java.util.ArrayList;

//package U1.Clase10;

public class Empresa {
    private String nombre;
    private String fechaFundacion;
    private ArrayList<Colaborador> colaboradores;

    public Empresa(String nombre, String fechaFundacion){
        this.nombre = nombre;
        this.fechaFundacion = fechaFundacion;
        this.colaboradores = new ArrayList<Colaborador>();
    }

    public void agregarColaborador(Colaborador nuevoColaborador){
        this.colaboradores.add(nuevoColaborador);
    }

    public ArrayList<Colaborador> getColaboradores(){
        return this.colaboradores;
    }

    public String toString(){
        String salida = "Empresa: " + this.nombre + " fundada el " + this.fechaFundacion + " y sus colaboradores son:";
        for(Colaborador colaborador : this.colaboradores){
            salida += "\n- " + colaborador;
        }
        return salida;
    }
}
