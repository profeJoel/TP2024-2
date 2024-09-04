//package U1.Clase9.EjercicioPolimorfismo;

//Subclase
public class Gato extends Animal{
    private String color;

    public Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }

    @Override
    public void haceSonido(){
        System.out.println(this.nombre + " hace Miau...");
    }
    
}
