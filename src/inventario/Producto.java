package inventario;

public class Producto {
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public void venderUnidades(int cantidad) {
        if (0 < cantidad) {
            if (cantidad <= stock) {
                stock = stock - cantidad;
                System.out.println("Venta de " + cantidad + " " + nombre + " exitosa, stock restante: " + stock + " unidades");
            }
            else System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre);
        }
        else System.out.println("Error: El valor ingresado debe ser mayor que 0");
    }

    public void reponerStock (int cantidad){
        if (0 < cantidad) {
            stock = stock + cantidad;
            System.out.println("Reposición registrada: +" + cantidad + " unidades. Stock actual: " + stock);
        }
        else System.out.println("Error: El valor ingresado debe ser mayor a 0");
    }

    public void actualizarPrecio (double precio) {
        double precioDesactualizado = this.precio;
        this.precio = precio;
        System.out.println("Precio actualizado de " + nombre + ": $" + precioDesactualizado + "-> $" + this.precio + "\n");
    }

    //Desafio de extension: aplicar descuento con validacion
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 100) {
            double precioAnterior = this.precio;
            this.precio = this.precio - (this.precio * porcentaje / 100);
            System.out.println("Descuento del " + porcentaje + "% aplicado a " + nombre + ". Precio anterior: $" + precioAnterior + " -> Nuevo precio: $" + this.precio + "\n");
        } else {
            System.out.println("Error: El porcentaje de descuento debe estar entre 0 y 100\n");
        }
    }



    public void mostrarFicha() {
        System.out.println("----- Ficha del producto -----" +
                "\nCodigo: " + codigo +
                "\nNombre: " + nombre +
                "\nPrecio: " + precio +
                "\nStock: " + stock +
                "\n---------------------------------\n");
    }
}
