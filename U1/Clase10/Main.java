//package U1.Clase10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa codelco = new Empresa("CODELCO", "01/04/1976");

        codelco.agregarColaborador(new Colaborador("Constanza Sandoval", "1234567-8", "Minera", new Contacto("Su casa", "constanza@codelco.cl", 123456789, 87654321)));

        codelco.getColaboradores().get(0).agregarCliente(new Cliente("0000000000-0", "Paulo Monsalve", new Contacto("Llanquihue", "paulo@loco.cl", 00000000001, 1000000000)));
        codelco.getColaboradores().get(0).agregarCliente(new Cliente("0000000000-1", "Yenifer", new Contacto("Bosquemar", "yeni@fer.cl", 00000000002, 2000000000)));

        System.out.println(codelco);
    }
}
