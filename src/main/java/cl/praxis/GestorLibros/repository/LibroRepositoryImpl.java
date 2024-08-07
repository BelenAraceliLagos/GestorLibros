package cl.praxis.GestorLibros.repository;

import cl.praxis.GestorLibros.dto.Libro;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LibroRepositoryImpl implements LibroRepository{

    JdbcTemplate template;

    public LibroRepositoryImpl(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public List<Libro> findAll() {
        String sql = "select * from libros";
        return template.query(sql, new BeanPropertyRowMapper<>(Libro.class));
    }

    @Override
    public Libro findOne(int nro_libro) {
        String sql = "select * from libros where nro_libro = ?";

        return template.queryForObject(sql, new Object[]{nro_libro}, new BeanPropertyRowMapper<>(Libro.class));
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
