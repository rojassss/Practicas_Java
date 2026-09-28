package biblioteca;


public class MainBiblioteca {
    public static void main(String[] args) {
        Libro libroUno = new Libro("El principito", "Antoine de Saint-Exupéry", "978-84-7888-719-4", 1, 20000.0);
        Libro libroDos = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", "978-0307474728");
        Libro libroTres = new Libro("Rayuela", "Julio Cortazar", "978-8437604572", 2, 8000.0);

        //Cargado con valores invalidos a aproposito para forzar errores
        Libro libroCuatro = new Libro("", "Jorge Luis Borges", "978-9500415309");
        System.out.println("Titulo del libroCuatro: " + libroCuatro.getTitulo());
        libroCuatro.setPrecioReposicion(-1000);
        System.out.println(libroCuatro.getPrecioReposicion());

        //Agotando las copias del libroTres
        System.out.println();
        libroTres.prestar();
        libroTres.prestar();
        libroTres.prestar();

        //Mostrar ficha de los 3 libros
        libroUno.mostrarFicha();
        libroDos.mostrarFicha();
        libroTres.mostrarFicha();

        //Realizar un prestamo
        libroUno.prestar();
        libroUno.prestar();
        libroUno.devolver();
        libroUno.setPrecioReposicion(70000);



    }
}