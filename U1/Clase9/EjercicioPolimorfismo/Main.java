//package U1.Clase9.EjercicioPolimorfismo;
//Ejemplo de Polimorfismo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Camilo");
        Gato gato1 = new Gato("Edo", "Blanco");
        Perro perro1 = new Perro("Copito", 30);
        Delfin delfin1 = new Delfin("Tiburoncin", 4);

        animal1.haceSonido();
        gato1.haceSonido();
        perro1.haceSonido();
        delfin1.haceSonido();
    }    
}
