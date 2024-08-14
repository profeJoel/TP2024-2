import java.util.Scanner;

public class EjercicioFuncionPotencia {

    static double calcularPotencia(double b, int e){
        double p = 1;
        if(e<0){
            System.out.println("No es posible calcular la potencia...\n");
            return -1;
        }
        else{
            for(;e>0;e--)
                p *= b;
            return p;
        }
    }

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
        /* 
        potencia = 1;
        /*while(exp>0){
            potencia = potencia * base;
            exp = exp - 1;
        }*/
        /*for(exp = exp; exp > 0; exp = exp - 1){
            potencia = potencia * base;
        }*/

        /* 
        for(; exp > 0; exp--)
            potencia *= base;
        */
        System.out.println("La potencia es: " + calcularPotencia(base, exp));
    
    }
}
//          https://github.com/profeJoel/TP2024-2
