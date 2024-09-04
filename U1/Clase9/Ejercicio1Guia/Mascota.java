//package U1.Clase9.Ejercicio1Guia;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private String fechaNacimiento;

    public Mascota(String nombre, String especie, String raza, String fechaNacimiento){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String toString(){
        return "Mascota : " + this.nombre + " de especie " + this.especie + " y raza " + this.raza + " nacido el " + this.fechaNacimiento;
    }
}
