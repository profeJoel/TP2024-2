package com.biblioteca.taller.model;

public class Autor {
    private Long id;
    private String nombre;
    private String apellido;

    public void setId(long long1) {
        this.id = long1;
    }
    public void setNombre(String string) {
        this.nombre = string;
    }
    public void setApellido(String string) {
        this.apellido = string;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    // Getters y setters
}
