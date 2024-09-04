//package U1.Clase9.EjercicioPolimorfismo;

public class Delfin extends Animal{
    private int cantAletas;

    public Delfin(String nombre, int cantAletas){
        super(nombre);
        this.cantAletas = cantAletas;
    }

    @Override
    public void haceSonido(){
        System.out.println(this.nombre + " hace Ahahahahahah...");
    }
}
