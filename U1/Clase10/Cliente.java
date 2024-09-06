//package U1.Clase10;

public class Cliente {
    private String rut;
    private String nombre;
    private Contacto contacto;

    public Cliente(String rut, String nombre, Contacto contacto){
        this.rut = rut;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    public String toString(){
        return "Cliente " + this.nombre + " (" + this.rut+") y su contacto: " + this.contacto;
    }
}
