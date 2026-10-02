package logistica;

public class Camion extends Vehiculo{
    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;

    }

    public String tipoVehiculo() {
        return "Camion";
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (distanciaKm * costoBaseKm) * (1 + capacidadToneladas * 0.05);
    }



    @Override
    public void mostrarFicha() {
        System.out.println(
                "Vehiculo: " + tipoVehiculo() +  " | " +
                "Patente: " + patente + " | " +
                "Marca: " + marca + " | " +
                "Toneladas: " + capacidadToneladas);

    }


}
