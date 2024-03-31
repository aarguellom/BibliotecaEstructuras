/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author acsor
 */
public class Pelicula extends Contenido {
    private int duracion;
    private String director;
    private String plataforma;

    public Pelicula(String titulo, String fechaPublicacion, String director, int duracion, int calificacion, String clasificacionDeEdad, String sinopsis, String genero, String plataforma) {
        super(titulo, fechaPublicacion, director, calificacion, clasificacionDeEdad, sinopsis, genero);
        this.duracion = duracion;
        this.director = director;
        this.plataforma = plataforma;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + getTitulo() + '\'' +
                ", fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion +
                ", calificacion=" + getCalificacion() +
                ", clasificacionDeEdad='" + getClasificacionDeEdad() + '\'' +
                ", sinopsis='" + getSinopsis() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
