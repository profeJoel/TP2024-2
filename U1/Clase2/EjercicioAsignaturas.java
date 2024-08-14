package U1.Clase2;
import java.util.Scanner;

public class EjercicioAsignaturas {
    public static void main(String[] args) {
        int semestre;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el semestre que cursa: ");
        semestre = lector.nextInt();

        switch(semestre){
            case 4:
                System.out.println("TP, IE, EDO, TE, TO, Ingles");
                break;
            case 3:
                System.out.println("Algebra, Geometria, IICI, Coms, Ingles, Ed.F, Quimica");
                break;
            default:
                System.out.println("Semestre no valido");
                break;
        }
    }    
}
