//package U1.Clase8.EjercicioPersonas;

public class Funcionario extends Persona{
    private String cargo;

    public Funcionario(String nombre, Rut rut, String cargo){
        super(nombre, rut);
        this.cargo = cargo;
    }

    public String toString(){
        return "Funcionario es : " + this.nombre + " (" + this.rut + ") de cargo: " + this.cargo;
    }
}
