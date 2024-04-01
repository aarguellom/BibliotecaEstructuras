/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecavirtual;

import java.util.LinkedList;

public class BibliotecaVirtual {
    private LinkedList<Pelicula> peliculasVistas;
    private LinkedList<Pelicula> peliculas;
    private LinkedList<Juego> juegosJugados;
    private LinkedList<Serie> seriesVistas;
    private LinkedList<Libro> librosLeidos;

    public BibliotecaVirtual() {
        peliculasVistas = new LinkedList<>();
        peliculas = new LinkedList<>();
        juegosJugados = new LinkedList<>();
        seriesVistas = new LinkedList<>();
        librosLeidos = new LinkedList<>();
    }

    // Métodos para películas
    public void agregarPeliculaVista(Pelicula pelicula) {
        peliculasVistas.add(pelicula);
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void imprimirPeliculas() {
        imprimirContenidoVisto(peliculas, "Películas");
    }

    public void imprimirPeliculasVistas() {
        imprimirContenidoVisto(peliculasVistas, "Películas vistas");
    }

    // Métodos para juegos
    public void agregarJuego(Juego juego) {
        juegosJugados.add(juego);
    }

    public void imprimirJuegos() {
        imprimirContenidoVisto(juegosJugados, "Juegos");
    }

    // Métodos para series
    public void agregarSerie(Serie serie) {
        seriesVistas.add(serie);
    }

    public void imprimirSeries() {
        imprimirContenidoVisto(seriesVistas, "Series");
    }

    // Métodos para libros
    public void agregarLibro(Libro libro) {
        librosLeidos.add(libro);
    }

    public void imprimirLibros() {
        imprimirContenidoVisto(librosLeidos, "Libros");
    }

    // Métodos comunes para imprimir el contenido visto
    private <T extends Contenido> void imprimirContenidoVisto(LinkedList<T> lista, String mensaje) {
        if (lista.isEmpty()) {
            System.out.println("No hay " + mensaje.toLowerCase() + ".");
            return;
        }

        System.out.println(mensaje + ":");
        for (T contenido : lista) {
            System.out.println(contenido.getTitulo());
            System.out.println("Sinopsis: " + contenido.getSinopsis());
            System.out.println("Género: " + contenido.getGenero());
            System.out.println();
        }
    }

    // Métodos para actualizar una película
    public void actualizarPelicula(Pelicula peliculaAntigua, Pelicula peliculaNueva) {
        actualizarElemento(peliculasVistas, peliculaAntigua, peliculaNueva);
        actualizarElemento(peliculas, peliculaAntigua, peliculaNueva);
    }

    // Método para eliminar una película
    public void eliminarPelicula(Pelicula pelicula) {
        eliminarElemento(peliculasVistas, pelicula);
        eliminarElemento(peliculas, pelicula);
    }

    // Métodos para actualizar un juego
    public void actualizarJuego(Juego juegoAntiguo, Juego juegoNuevo) {
        actualizarElemento(juegosJugados, juegoAntiguo, juegoNuevo);
    }

    // Método para eliminar un juego
    public void eliminarJuego(Juego juego) {
        eliminarElemento(juegosJugados, juego);
    }

    // Métodos para actualizar una serie
    public void actualizarSerie(Serie serieAntigua, Serie serieNueva) {
        actualizarElemento(seriesVistas, serieAntigua, serieNueva);
    }

    // Método para eliminar una serie
    public void eliminarSerie(Serie serie) {
        eliminarElemento(seriesVistas, serie);
    }

    // Métodos para actualizar un libro
    public void actualizarLibro(Libro libroAntiguo, Libro libroNuevo) {
        actualizarElemento(librosLeidos, libroAntiguo, libroNuevo);
    }

    // Método para eliminar un libro
    public void eliminarLibro(Libro libro) {
        eliminarElemento(librosLeidos, libro);
    }

    // Método para actualizar un elemento en la lista enlazada
    private <T extends Contenido> void actualizarElemento(LinkedList<T> lista, T elementoAntiguo, T elementoNuevo) {
        int index = lista.indexOf(elementoAntiguo);
        if (index != -1) {
            lista.set(index, elementoNuevo);
        }
    }

    // Método para eliminar un elemento de la lista enlazada
    private <T extends Contenido> void eliminarElemento(LinkedList<T> lista, T elemento) {
        lista.remove(elemento);
    }
    
    public void imprimirPelicula(String titulo) {
    boolean encontrada = false;

    // Buscar la película en la pila peliculasVistas
    for (Pelicula pelicula : peliculasVistas) {
        if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
            System.out.println("Película Vista:");
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Sinopsis: " + pelicula.getSinopsis());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("Calificación: " + pelicula.getCalificacion());
            encontrada = true;
            break;
        }
    }

    // Buscar la película en la pila peliculas si no se encontró en peliculasVistas
    if (!encontrada) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Película:");
                System.out.println("Título: " + pelicula.getTitulo());
                System.out.println("Sinopsis: " + pelicula.getSinopsis());
                System.out.println("Género: " + pelicula.getGenero());
                System.out.println("Calificación: " + pelicula.getCalificacion());
                encontrada = true;
                break;
            }
        }
    }

    // Si no se encontró la película, mostrar un mensaje
    if (!encontrada) {
        System.out.println("La película '" + titulo + "' no se encontró en la biblioteca.");
    }
}

public static void main(String[] args) {
    BibliotecaVirtual biblioteca = new BibliotecaVirtual();

    int[] cantidadDatos = {5000000};
    for (int cantidad : cantidadDatos) {
        System.out.println("Probando con " + cantidad + " datos:");

        // Generar datos
        for (int i = 1; i <= cantidad; i++) {
            Pelicula pelicula = new Pelicula("Pelicula " + i, "01-01-2022", "Director " + i, 120, 8, "Apto", "Sinopsis " + i, "Acción", "Plataforma 1");
            biblioteca.agregarPeliculaVista(pelicula);
            biblioteca.agregarPelicula(pelicula);
            Juego juego = new Juego("Juego " + i, "01-01-2022", "Empresa " + i, 20, 8, "Apto", "Sinopsis " + i, "Aventura", "Plataforma 1");
            biblioteca.agregarJuego(juego);
            Serie serie = new Serie("Serie " + i, "01-01-2022", "Director " + i, 5, true, 9, "Apto", "Sinopsis " + i, "Drama", "Plataforma 1");
            biblioteca.agregarSerie(serie);
            Libro libro = new Libro("Libro " + i, "01-01-2022", "Autor " + i, "ISBN" + i, "Editorial " + i, 8, "Apto", "Sinopsis " + i, "Ficción");
            biblioteca.agregarLibro(libro);
        }

        long inicio = System.currentTimeMillis();
        biblioteca.imprimirPelicula("Pelicula 5000000");
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo para imprimir datos: " + (fin - inicio) + " ms");

        // Limpiar la biblioteca para la próxima iteración
        biblioteca = new BibliotecaVirtual();

        System.out.println(); // Separador entre iteraciones
    }
}
}

        
        
 

