//Esta es la SUPERCLASE (clase padre)
public class Persona {
    protected String nombre;
    protected Rut rut;

    public Persona(String nombre, Rut rut){
        this.nombre = nombre;
        this.rut = rut;
    }

    public String toString(){
        return this.nombre + " (" + this.rut + ")";
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void habla(){
        System.out.println("Hola, mi nombre es " + this.nombre);
    }
}
