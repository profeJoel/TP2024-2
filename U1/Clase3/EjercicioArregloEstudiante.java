import java.util.Scanner;

public class EjercicioArregloEstudiante {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        //declaracion del arreglo
        String[] estudiante;
        estudiante = new String[5];
        //desde 0 hasta 4

        //ingreso de datos
        for(int i=0; i<5; i++){
            System.out.println("Ingrese el nombre del estudiante " + i + ":");
            estudiante[i] = lector.next();
        }

        //impresion de datos
        System.out.println("Listado de Estudiantes:");
        /*for(int i=0; i<5; i++){
            System.out.println("> estudiante " + i + ": " + estudiante[i]);
        }*/
        for(String nombre : estudiante){
            System.out.println("> estudiante : " + nombre);
        }
    }
}
