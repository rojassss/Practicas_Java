package logistica;

public class Furgoneta extends Vehiculo{
    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    public String isTieneRefrigeracion() {
        if (tieneRefrigeracion) return "Si";else return "no";
    }

    public String tipoVehiculo() {
        return "Furgoneta";
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        if (tieneRefrigeracion) {return costoBaseKm * distanciaKm + 5000;}
        else return costoBaseKm * distanciaKm;
    }

    @Override
    public void mostrarFicha() {
        System.out.println(
                "Vehiculo: " + tipoVehiculo() +  " | " +
                "Patente: " + patente + " | " +
                "Marca: " + marca + " | " +
                "Refrigerado: " + isTieneRefrigeracion());

    }


}
