//package U1.Clase7.EjercicioUniversidad;

class Estudiante {
    //Definir los atributos
    private String nombre;
    private Rut rut;
    private String carrera;
    private int generacion;

    //Comportamiento / Metodos
    public Estudiante(String nombre, Rut rut, String carrera, int generacion){
        //this hace referencia a el mismo objeto y hace referencia a la propiedad de la variable
        this.nombre = nombre;
        this.rut = rut;
        this.carrera = carrera;
        this.generacion = generacion;
    }

    public String toString(){
        return "Estudiante es : " + this.nombre + " (" + this.rut + ") de " + this.carrera + " " + this.generacion;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
}
