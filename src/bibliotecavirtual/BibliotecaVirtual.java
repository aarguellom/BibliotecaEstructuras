/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecavirtual;


import java.util.Stack;

public class BibliotecaVirtual {
    private Stack<Pelicula> peliculasVistas;
    private Stack<Pelicula> peliculas;
    private Stack<Juego> juegosJugados;
    private Stack<Serie> seriesVistas;
    private Stack<Libro> librosLeidos;

    public BibliotecaVirtual() {
        peliculasVistas = new Stack<>();
        peliculas = new Stack<>();
        juegosJugados = new Stack<>();
        seriesVistas = new Stack<>();
        librosLeidos = new Stack<>();
    }

    // Métodos para películas
    public void agregarPeliculaVista(Pelicula pelicula) {
        peliculasVistas.push(pelicula);
    }
    
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.push(pelicula);
    }
    
    public void imprimirPeliculas() {
        imprimirContenidoVisto(peliculas, "Películas");
    }
    
    public void imprimirPeliculasVistas() {
        imprimirContenidoVisto(peliculasVistas, "Películas vistas");
    }

    // Métodos para juegos
    public void agregarJuego(Juego juego) {
        juegosJugados.push(juego);
    }
    
    public void imprimirJuegos() {
        imprimirContenidoVisto(juegosJugados, "Juegos");
    }

    // Métodos para series
    public void agregarSerie(Serie serie) {
        seriesVistas.push(serie);
    }
    
    public void imprimirSeries() {
        imprimirContenidoVisto(seriesVistas, "Series");
    }

    // Métodos para libros
    public void agregarLibro(Libro libro) {
        librosLeidos.push(libro);
    }
    
    public void imprimirLibros() {
        imprimirContenidoVisto(librosLeidos, "Libros");
    }

    // Métodos comunes para imprimir el contenido visto
    private <T extends Contenido> void imprimirContenidoVisto(Stack<T> stack, String mensaje) {
        if (stack.isEmpty()) {
            System.out.println("No hay " + mensaje.toLowerCase() + ".");
            return;
        }

        System.out.println(mensaje + ":");
        Stack<T> auxStack = new Stack<>();

        while (!stack.isEmpty()) {
            T contenido = stack.pop();
            System.out.println(contenido.getTitulo());
            System.out.println("Sinopsis: " + contenido.getSinopsis());
            System.out.println("Género: " + contenido.getGenero());
            System.out.println();
            auxStack.push(contenido);
        }

        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }

    // Métodos para actualizar un elemento en el stack
    private <T extends Contenido> void actualizarElemento(Stack<T> stack, T elementoAntiguo, T elementoNuevo) {
        Stack<T> auxStack = new Stack<>();
        while (!stack.isEmpty()) {
            T elemento = stack.pop();
            if (elemento.equals(elementoAntiguo)) {
                auxStack.push(elementoNuevo);
            } else {
                auxStack.push(elemento);
            }
        }
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }
    }

    // Métodos para eliminar un elemento del stack
    private <T extends Contenido> void eliminarElemento(Stack<T> stack, T elemento) {
        Stack<T> auxStack = new Stack<>();
        while (!stack.isEmpty()) {
            T item = stack.pop();
            if (!item.equals(elemento)) {
                auxStack.push(item);
            }
        }
        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
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

    public static void main(String[] args) {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();

        // Crear algunos ejemplos de contenido
        Pelicula pelicula1 = new Pelicula("Pelicula 1", "01-01-2022", "Director 1", 120, 8, "Apto", "Sinopsis 1", "Acción", "Plataforma 1");
        Juego juego1 = new Juego("Juego 1", "01-01-2022", "Empresa 1", 20, 8, "Apto", "Sinopsis 2", "Aventura", "Plataforma 1");
        Serie serie1 = new Serie("Serie 1", "01-01-2022", "Director 1", 5, true, 9, "Apto", "Sinopsis 3", "Drama", "Plataforma 1");
        Libro libro1 = new Libro("Libro 1", "01-01-2022", "Autor 1", "ISBN1", "Editorial 1", 8, "Apto", "Sinopsis 4", "Ficción");

        // Agregar contenido a la biblioteca
        biblioteca.agregarPeliculaVista(pelicula1);
        biblioteca.agregarPelicula(pelicula1);
        biblioteca.agregarJuego(juego1);
        biblioteca.agregarSerie(serie1);
        biblioteca.agregarLibro(libro1);
        
        // Crear una nueva instancia de Película con los datos actualizados
        Pelicula nuevaPelicula = new Pelicula("Nueva Película", "01-01-2023", "Nuevo Director", 150, 9, "Apto", "Nueva Sinopsis", "Aventura", "Nueva Plataforma");

        // Actualizar la película existente en la biblioteca
        biblioteca.actualizarPelicula(pelicula1, nuevaPelicula);

        // Eliminar el juego de la biblioteca
        biblioteca.eliminarJuego(juego1);

        // Imprimir el contenido visto antes de la actualización
        biblioteca.imprimirPeliculasVistas();
        biblioteca.imprimirPeliculas();
        biblioteca.imprimirJuegos();
        biblioteca.imprimirSeries();
        biblioteca.imprimirLibros();
    }
}