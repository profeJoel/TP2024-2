//subclase
public class Profesor extends Persona{
    private String especialidad;

    public Profesor(String nombre, Rut rut, String especialidad){
        super(nombre, rut);
        this.especialidad = especialidad;
    }

    public String toString(){
        return "Profesor es : " + this.nombre + " (" + this.rut + ") de especialidad " + this.especialidad;
    }
}
