import java.util.Scanner;

public class ArregloImpar {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] vector;
        vector = new int[10];

        int i;
        for(i=0; i<10; i++){
            System.out.println("Ingrese el valor de la posicion " + i + ":");
            vector[i] = lector.nextInt();
        }

        System.out.println("Valores Impares");
        for(int valor : vector){
            if(valor%2==1)
                System.out.println("Valor impar: " + valor);
        }
    }
}
