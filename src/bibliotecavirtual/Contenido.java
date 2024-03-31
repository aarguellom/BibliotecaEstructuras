/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author acsor
 */
public class Contenido {
    private String titulo;
    private String fechaPublicacion;
    private String autor;
    private int calificacion; 
    private String clasificacionDeEdad;
    private String sinopsis;
    private String genero; 

    // Constructor
    public Contenido(String titulo, String fechaPublicacion, String autor, int calificacion, String clasificacionDeEdad, String sinopsis, String genero) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.calificacion = calificacion;
        this.clasificacionDeEdad = clasificacionDeEdad;
        this.sinopsis = sinopsis;
        this.genero = genero; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getAutor() {
        return autor;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getClasificacionDeEdad() {
        return clasificacionDeEdad;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setClasificacionDeEdad(String clasificacionDeEdad) {
        this.clasificacionDeEdad = clasificacionDeEdad;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}
