package cl.praxis.GestorLibros.repository;

import cl.praxis.GestorLibros.dto.Libro;

import java.util.List;

public interface LibroRepository {
    List<Libro> findAll();
    Libro findOne(int nro_libro);
    boolean update(Libro l);
    boolean create(Libro l);
    boolean delete(int nro_libro);
}
