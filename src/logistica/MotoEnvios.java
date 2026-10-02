package logistica;

public class MotoEnvios extends Vehiculo{
    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    public String tipoVehiculo() {
        return "MotoEnvio";
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return (costoBaseKm * distanciaKm) * 0.85;}

    @Override
    public void mostrarFicha() {
            System.out.println(
                    "Vehiculo: " + tipoVehiculo() + " | " +
                    "Patente: " + patente + " | " +
                    "Marca: " + marca + " | " +
                    "Mensajeria liviana");

    }
}
