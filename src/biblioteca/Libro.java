package biblioteca;
//La clase Libro esta declara como final con la intension de que no pueda ser heredada

public final class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;
    private int prestamosHistoricos;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo == null || titulo.trim().isEmpty()) {
            this.titulo = "Sin titulo";
            System.out.println("Titulo es invalido, Se uso 'Sin titulo' por defecto");

        }
        else this.titulo = titulo;

        if (autor == null || autor.trim().isEmpty()) {
            this.autor = "Autor desconocido";
            System.out.println("Nombre de autor invalido se uso 'Autor desconocido' por defecto");
        } else this.autor = autor;

        if (isbn == null || isbn.trim().isEmpty()) {
            this.isbn = "ISBN pendiente";
            System.out.println("ISBN invalido, se uso 'ISBN pendiente' por defecto");
        } else this.isbn = isbn;

        if (copiasDisponibles < 0) {
            copiasDisponibles = 0;
            System.out.println("Cantidad de copias disponibles invalidas, debe ser un valor superior o igual a 0");
        } else this.copiasDisponibles = copiasDisponibles;

        if (precioReposicion < 0) {
            this.precioReposicion = 15000;
            System.out.println("Precio de reposiscion invalido, se uso '$15000.0' por defecto");
        } else this.precioReposicion = precioReposicion;

        prestamosHistoricos = 0;
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 1, 15000.0);
    }

    public String getTitulo(){
    return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean setPrecioReposicion(double precio) {
        if (precio < 0) {
            return false;
        }
        else {
            double precioAnterior = this.precioReposicion;
            this.precioReposicion = precio;
            System.out.println("Precio de reposicion del libro '" + titulo + "' actualizado: $" + precioAnterior + "-> $" + precio);
            return true;
        }
    }

    public int getPrestamosHistoricos() {
        return prestamosHistoricos;
    }

    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            System.out.println("Prestamo registrado: " + titulo + ". Copias disponibles: " + copiasDisponibles);
            return true;
        }else{
            System.out.println("Error: no hay copias disponibles en este momento");
            return false;
        }
    }


    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolucion registrada: " + titulo + ". Copias disponibles: " + copiasDisponibles);
    }
    public void mostrarFicha() {
        System.out.println("----- Ficha de libro -----");
        System.out.println("Título:  " + titulo);
        System.out.println("Autor:   " + autor);
        System.out.println("ISBN:    " + isbn);
        System.out.println("Copias disponibles: " + copiasDisponibles);
        System.out.println("Precio de reposición: $" + precioReposicion);
        System.out.println("-----------------------");
    }

}


