//package U1.Clase9.EjercicioPolimorfismo;

public class Perro extends Animal{
    private int tamano;

    public Perro(String nombre, int tamano){
        super(nombre);
        this.tamano = tamano;
    }

    @Override
    public void haceSonido(){
        System.out.println(this.nombre + " hace Guau...");
    }
}
