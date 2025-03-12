
package principioderesponsabilidadúnica;
import java.util.ArrayList;
import java.util.List;
class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}

class GestorLibros {
    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public List<Libro> obtenerLibros() {
        return libros;
    }
}

class GeneradorReportes {
    public void generarReporte(List<Libro> libros) {
        System.out.println("Reporte de Libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Quijote", "Santiago Jose Alberto", "123-456-789");
        Libro libro2 = new Libro("Cien años de serieda", "Gabriel García Márquez", "987-654-321");

        GestorLibros gestor = new GestorLibros();
        gestor.agregarLibro(libro1);
        gestor.agregarLibro(libro2);

        GeneradorReportes reportes = new GeneradorReportes();
        reportes.generarReporte(gestor.obtenerLibros());
    }
}
