import java.util.Scanner;

public class EjercicioPotencia {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int exp;
        double base, potencia;

        System.out.println("Ingrese la Base: ");
        base = lector.nextDouble();
        System.out.println("Ingrese el Exponente: ");
        exp = lector.nextInt();
        if(exp<1){
            System.out.println("No es posible hacer la operacion");
        }
        else{
            potencia = 1;
            while(exp>0){
                potencia = potencia * base;
                exp = exp - 1;
            }
            System.out.println("La potencia es: " + potencia);
        }
    }
}
