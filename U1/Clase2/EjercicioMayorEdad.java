package U1.Clase2;
import java.util.Scanner;

public class EjercicioMayorEdad{
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad");
        edad = lector.nextInt();

        if(edad >= 18){
            System.out.println("Es Mayor de edad, se puede tomar una cervecita...");
        }
        else{
            System.out.println("Es menor de edad, vaya a acostarse...");
        }
    }
}