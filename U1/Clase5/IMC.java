import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double peso, estatura, imc;

        do{
            System.out.println("Ingrese su peso (en Kg): ");
            peso = lector.nextDouble();
        }while(peso<=0 || peso >=600);

        do{
            System.out.println("Ingrese su estatura (en M): ");
            estatura = lector.nextDouble();
        }while(estatura<=0 || estatura>=2.5);

        imc = peso / (estatura * estatura);
        System.out.println("Su IMC es " + imc);

        if(imc < 18.5){
            System.out.println("Su categoria es BAJO PESO");
        }
        else{
            if(imc < 24.9){
                System.out.println("Su categoria es NORMAL");
            }
            else{
                if(imc < 29.9){
                    System.out.println("Su categoria es SOBREPESO"); 
                }
                else{
                    if(imc < 34.9){
                        System.out.println("Su categoria es OBESIDAD I");
                    }
                    else{
                        if(imc < 39.9){
                            System.out.println("Su categoria es OBESIDAD II");
                        }
                        else{
                            System.out.println("Su categoria es OBESIDAD III");
                        }
                    }
                }
            }
        }

    }
}
