package com.biblioteca.taller.model;

public class Libro {
    private Long id;
    private String titulo;
    private String isbn;
    private Long autorId;  // Referencia al ID del autor

    public void setId(long long1) {
        this.id = long1;
    }
    public void setTitulo(String string) {
        this.titulo = string;
    }
    public void setIsbn(String string) {
        this.isbn = string;
    }
    public void setAutorId(long long1) {
        this.autorId = long1;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public String getIsbn() {
        return this.isbn;
    }
    public Long getAutorId() {
        return this.autorId;
    }
    
    // Getters y setters
}
