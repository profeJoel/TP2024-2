import java.util.Scanner;

public class EjercicioPotencia {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int exp;
        double base, potencia;

        System.out.println("Ingrese la Base: ");
        base = lector.nextDouble();
        
        do{
            System.out.println("Ingrese el Exponente: ");
            exp = lector.nextInt();
        }while(exp <= 0);
    
        potencia = 1;
        /*while(exp>0){
            potencia = potencia * base;
            exp = exp - 1;
        }*/
        /*for(exp = exp; exp > 0; exp = exp - 1){
            potencia = potencia * base;
        }*/

        for(; exp > 0; exp--)
            potencia *= base;

        System.out.println("La potencia es: " + potencia);
    
    }
}
