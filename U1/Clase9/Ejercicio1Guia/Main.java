//package U1.Clase9.Ejercicio1Guia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombreDueno, nombreMascota, ciudad, fechaNacimientoDueno, fechaNacimientoMascota, especie, raza;
        System.out.println("Ingrese nombre del dueno: ");
        nombreDueno = lector.nextLine();
        System.out.println("Ingrese ciudad del dueno: ");
        ciudad = lector.nextLine();
        System.out.println("Ingrese fecha de Nacimiento del dueno: ");
        fechaNacimientoDueno = lector.nextLine();
        System.out.println("Ingrese nombre de la mascota: ");
        nombreMascota = lector.nextLine();
        System.out.println("Ingrese fecha de Nacimiento de la mascota: ");
        fechaNacimientoMascota = lector.nextLine();
        System.out.println("Ingrese especie de la mascota: ");
        especie = lector.nextLine();
        System.out.println("Ingrese raza de la mascota: ");
        raza = lector.nextLine();

        Dueno dueno1 = new Dueno(nombreDueno, fechaNacimientoDueno, ciudad, new Mascota(nombreMascota, especie, raza, fechaNacimientoMascota));

        System.out.println("Datos Ingresados\n: " + dueno1);

    }
}
