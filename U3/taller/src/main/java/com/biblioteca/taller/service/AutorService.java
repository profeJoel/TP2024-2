package com.biblioteca.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.biblioteca.taller.model.Autor;

@Service
public class AutorService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Autor> getAllAutores() {
        String sql = "SELECT * FROM autores";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Autor autor = new Autor();
            autor.setId(rs.getLong("id"));
            autor.setNombre(rs.getString("nombre"));
            autor.setApellido(rs.getString("apellido"));
            return autor;
        });
    }

    public void agregarAutor(Autor autor) {
        String sql = "INSERT INTO autores (nombre, apellido) VALUES (?, ?)";
        jdbcTemplate.update(sql, autor.getNombre(), autor.getApellido());
    }

    // Métodos para actualizar y eliminar autores
}