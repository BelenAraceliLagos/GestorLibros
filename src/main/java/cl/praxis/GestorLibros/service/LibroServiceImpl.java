package cl.praxis.GestorLibros.service;

import cl.praxis.GestorLibros.dto.Libro;
import cl.praxis.GestorLibros.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroServiceImpl implements LibroService{

    LibroRepository repository;

    public LibroServiceImpl(LibroRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Libro> findAll() {
        return repository.findAll();
    }

    @Override
    public Libro findOne(int nro_libro) {
        return repository.findOne(nro_libro);
    }

    @Override
    public boolean update(Libro l) {
        return false;
    }

    @Override
    public boolean create(Libro l) {
        return false;
    }

    @Override
    public boolean delete(int nro_libro) {
        return false;
    }
}
