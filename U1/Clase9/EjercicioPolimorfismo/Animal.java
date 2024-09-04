//package U1.Clase9.EjercicioPolimorfismo;

//SuperClase
public class Animal {
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    public void haceSonido(){
        System.out.println(this.nombre + " hace sonido...");
    }
}
