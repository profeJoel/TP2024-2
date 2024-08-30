//esta es una SUBCLASE (clase hijo)
//extends indica la herencia de la superclase a esta subclase
public class Estudiante extends Persona{
    //Definir los atributos
    private String carrera;
    private int generacion;

    //Comportamiento / Metodos
    public Estudiante(String nombre, Rut rut, String carrera, int generacion){
        //this hace referencia a el mismo objeto y hace referencia a la propiedad de la variable
        //metodo super permite acceder a los datos de la superclase
        super(nombre, rut);
        this.carrera = carrera;
        this.generacion = generacion;
    }

    public String toString(){
        return "Estudiante es : " + this.nombre + " (" + this.rut + ") de " + this.carrera + " " + this.generacion;
    }
}
