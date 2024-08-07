package cl.praxis.GestorLibros.dto;

public class Libro {
    private int nro_libro;
    private String Titulo;
    private String autor;
    private String tipo;
    private int edicion;

    public Libro() {
    }

    public Libro(int nro_libro, String Titulo, String autor, String tipo, int edicion) {
        this.nro_libro = nro_libro;
        this.Titulo = Titulo;
        this.autor = autor;
        this.tipo = tipo;
        this.edicion = edicion;
    }

    public int getNro_libro() {
        return nro_libro;
    }

    public void setNro_libro(int nro_libro) {
        this.nro_libro = nro_libro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
}
