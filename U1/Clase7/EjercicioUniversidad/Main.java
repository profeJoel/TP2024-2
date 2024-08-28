import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre, dv, carrera;
        int run, generacion;

        System.out.println("Ingrese Nombre Completo:");
        nombre = lector.nextLine();
        //System.out.println("Ingrese RUT:");
        //rut = lector.nextLine();

        System.out.println("Ingrese RUN:");
        run = lector.nextInt();
        carrera = lector.nextLine();
        System.out.println("Ingrese Dv:");
        dv = lector.nextLine();
        System.out.println("Ingrese Carrera:");
        carrera = lector.nextLine();
        System.out.println("Ingrese generacion:");
        generacion = lector.nextInt();

        System.out.println("Estudiante es : " + nombre + " (" + run + "-" +dv + ") de " + carrera + " " + generacion);

        // Instanciar un estudiante
        Rut r1 = new Rut(run, dv); 
        Estudiante estudiante1; //Crea la variable (objeto)
        estudiante1 = new Estudiante(nombre, r1, carrera, generacion);//inicializa el objeto

        System.out.println(estudiante1);
        /*estudiante1.nombre = nombre;
        estudiante1.rut = rut;
        estudiante1.carrera = carrera;
        estudiante1.generacion = generacion;*/
        //System.out.println("Estudiante es : " + estudiante1.nombre + " (" + estudiante1.rut + ") de " + estudiante1.carrera + " " + estudiante1.generacion);
        


    }
}
