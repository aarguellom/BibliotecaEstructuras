/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecavirtual;

/**
 *
 * @author acsor
 */
public class Juego extends Contenido {
    private int duracion;
    private String empresa;
    private String plataforma;

    public Juego(String titulo, String fechaPublicacion, String empresa, int duracion, int calificacion, String clasificacionDeEdad, String sinopsis, String genero, String plataforma) {
        super(titulo, fechaPublicacion, empresa, calificacion, clasificacionDeEdad, sinopsis, genero);
        this.duracion = duracion;
        this.empresa = empresa;
        this.plataforma = plataforma;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "titulo='" + getTitulo() + '\'' +
                ", fechaPublicacion='" + getFechaPublicacion() + '\'' +
                ", empresa='" + empresa + '\'' +
                ", duracion=" + duracion +
                ", calificacion=" + getCalificacion() +
                ", clasificacionDeEdad='" + getClasificacionDeEdad() + '\'' +
                ", sinopsis='" + getSinopsis() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }
}

