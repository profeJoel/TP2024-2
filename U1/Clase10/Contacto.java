//package U1.Clase10;

public class Contacto {
    private String direccion;
    private String email;
    private int telFijo;
    private int telMovil;
    
    public Contacto(String direccion, String email, int telFijo, int telMovil){
        this.direccion = direccion;
        this.email = email;
        this.telFijo = telFijo;
        this.telMovil = telMovil;
    }

    public String toString(){
        return "direccion: " + this.direccion + " <"+this.email+">, telefono fijo: " + this.telFijo + " y telefono movil: " + this.telMovil;
    }
}
