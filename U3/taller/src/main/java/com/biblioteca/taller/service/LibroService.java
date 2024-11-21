package com.biblioteca.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.biblioteca.taller.model.Libro;

@Service
public class LibroService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Libro> getAllLibros() {
        String sql = "SELECT * FROM libros";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Libro libro = new Libro();
            libro.setId(rs.getLong("id"));
            libro.setTitulo(rs.getString("titulo"));
            libro.setIsbn(rs.getString("isbn"));
            libro.setAutorId(rs.getLong("autor_id"));
            return libro;
        });
    }

    public void agregarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, isbn, autor_id) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, libro.getTitulo(), libro.getIsbn(), libro.getAutorId());
    }

    // Métodos para actualizar y eliminar libros
}