//package U1.Clase9.Ejercicio1Guia;

public class Dueno {
    private String nombre;
    private String fechaNacimiento;
    private String ciudad;
    private Mascota mascota;

    public Dueno(String nombre, String fechaNacimiento, String ciudad, Mascota mascota){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
        this.mascota = mascota;
    }

    public String toString(){
        return "Dueno: " + this.nombre + " nacido el " + this.fechaNacimiento + " de la ciudad " + this.ciudad + " que tiene a " + this.mascota;
    }
}
