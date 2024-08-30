import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        String nombre, carrera, especialidad, cargo, dv, basura;
        int run, generacion;
        Rut rut;

        Estudiante estudiante1;
        Profesor profesor1;
        Funcionario funcionacio1;

        //Estudiante
        System.out.println("Ingrese nombre estudiante: ");
        nombre = lector.nextLine();
        System.out.println("Ingrese run: ");
        run = lector.nextInt();
        System.out.println("Ingrese dv: ");
        basura = lector.nextLine();
        dv = lector.nextLine();
        System.out.println("Ingrese Carrera: ");
        carrera = lector.nextLine();
        System.out.println("Ingrese Generacion: ");
        generacion = lector.nextInt();

        estudiante1 = new Estudiante(nombre, new Rut(run, dv), carrera, generacion);

        //Estudiante
        System.out.println("Ingrese nombre profesor: ");
        basura = lector.nextLine();
        nombre = lector.nextLine();
        System.out.println("Ingrese run: ");
        run = lector.nextInt();
        System.out.println("Ingrese dv: ");
        basura = lector.nextLine();
        dv = lector.nextLine();
        System.out.println("Ingrese Especialidad: ");
        especialidad = lector.nextLine();

        profesor1 = new Profesor(nombre, new Rut(run, dv), especialidad);

        //Funcionario
        System.out.println("Ingrese nombre funcionario: ");
        nombre = lector.nextLine();
        System.out.println("Ingrese run: ");
        run = lector.nextInt();
        System.out.println("Ingrese dv: ");
        basura = lector.nextLine();
        dv = lector.nextLine();
        System.out.println("Ingrese Cargo: ");
        cargo = lector.nextLine();

        funcionacio1 = new Funcionario(nombre, new Rut(run, dv), cargo);

        System.out.println(estudiante1);
        System.out.println(profesor1);
        System.out.println(funcionacio1);

        estudiante1.habla();
        profesor1.habla();
        funcionacio1.habla();

    }
}
