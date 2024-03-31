/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author acsor
 */
public class Libro extends Contenido {
    private String ISBN;
    private String editorial;

    public Libro(String titulo, String fechaPublicacion, String autor, String ISBN, String editorial, int calificacion, String clasificacionDeEdad, String sinopsis, String genero) {
        super(titulo, fechaPublicacion, autor, calificacion, clasificacionDeEdad, sinopsis, genero);
        this.ISBN = ISBN;
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + getTitulo() + '\'' +
                ", fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", editorial='" + editorial + '\'' +
                ", calificacion=" + getCalificacion() +
                ", clasificacionDeEdad='" + getClasificacionDeEdad() + '\'' +
                ", sinopsis='" + getSinopsis() + '\'' +
                ", genero='" + getGenero() + '\'' +
                '}';
    }
}

