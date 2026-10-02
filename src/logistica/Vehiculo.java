package logistica;

public abstract class Vehiculo {
    protected String patente;
    protected String marca;
    protected double costoBaseKm;

    public Vehiculo(String patente, String marca, double costoBaseKm) {
        this.patente = patente;
        this.marca = marca;
        this.costoBaseKm = costoBaseKm;
    }

    public double calcularCostoViaje(double distanciaKm) {
        return costoBaseKm * distanciaKm;
    }

    public double calcularCostoViaje(double distanciaKm, double peajes) {
        return calcularCostoViaje(distanciaKm) + peajes;
    }

    public void mostrarFicha() {

    }


}
