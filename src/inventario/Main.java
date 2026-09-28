package inventario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //INSTANCIACION Y ASIGNACION DE ESTADO DE LOS OBJETOS PRODUCTO
        Producto productoUno = new Producto();
        productoUno.codigo = "P-001";
        productoUno.nombre = "Pepitos";
        productoUno.stock = 25;
        productoUno.precio = 1500;

        Producto productoDos = new Producto();
        productoDos.codigo = "P-002";
        productoDos.nombre = "Oreo";
        productoDos.stock = 18;
        productoDos.precio = 2000;

        Producto productoTres = new Producto();
        productoTres.codigo = "P-003";
        productoTres.nombre = "Surtidas Bagley";
        productoTres.stock = 8;
        productoTres.precio = 2200;

        //Ejercitamos metodos de cada objeto
        productoUno.venderUnidades(5);
        productoUno.reponerStock(10);
        productoUno.actualizarPrecio(1450);
        productoUno.mostrarFicha();

        productoDos.venderUnidades(1);
        productoDos.reponerStock(3);
        productoDos.actualizarPrecio(1890);
        productoDos.mostrarFicha();

        productoTres.venderUnidades(12);
        productoTres.reponerStock(20);
        productoTres.actualizarPrecio(2000);
        productoTres.mostrarFicha();

        //Copiar una referencia
        Producto copia = productoUno;
        copia.stock = 50;
        System.out.println("Esta es la ficha de copia: ");
        copia.mostrarFicha();
        System.out.println("Este es el stock de " + productoUno.nombre + "(ProductoUno) luego de modificar el stock de copia: " + productoUno.stock+ "\n");

        productoDos.aplicarDescuento(20);

        // Desafío de extensión: Arreglo de 3 objetos recorrido con for
        Producto[] listaProductos = new Producto[3];
        listaProductos[0] = productoUno;
        listaProductos[1] = productoDos;
        listaProductos[2] = productoTres;

        System.out.println("\n=== RECORRIENDO EL ARREGLO DE PRODUCTOS ===");
        for (int i = 0; i < listaProductos.length; i++) {
            listaProductos[i].mostrarFicha();
            System.out.println();
        }


    }
}