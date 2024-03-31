/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author acsor
 */
public class Serie extends Contenido {
    private int numTemporadas;
    private String director;
    private boolean enEmision;
    private String plataforma;

    public Serie(String titulo, String fechaPublicacion, String director, int numTemporadas, boolean enEmision, int calificacion, String clasificacionDeEdad, String sinopsis, String genero, String plataforma) {
        super(titulo, fechaPublicacion, director, calificacion, clasificacionDeEdad, sinopsis, genero);
        this.numTemporadas = numTemporadas;
        this.director = director;
        this.enEmision = enEmision;
        this.plataforma = plataforma;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isEnEmision() {
        return enEmision;
    }

    public void setEnEmision(boolean enEmision) {
        this.enEmision = enEmision;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + getTitulo() + '\'' +
                ", fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", director='" + director + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", enEmision=" + enEmision +
                ", calificacion=" + getCalificacion() +
                ", clasificacionDeEdad='" + getClasificacionDeEdad() + '\'' +
                ", sinopsis='" + getSinopsis() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}
