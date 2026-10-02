package logistica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainFlota {
    public static void main(String[] args) {
      Vehiculo [] flota = new Vehiculo[3];
      Camion camion = new Camion("AAA-111", "VOLKSWAGEN", 5000, 10);
      Furgoneta furgoneta = new Furgoneta("BBB-222", "PEUGEOT", 3000, true);
      MotoEnvios moto = new MotoEnvios("333-CCC", "ZANELLA", 850);
      flota[0] = camion;
      flota[1] = furgoneta;
      flota[2] = moto;

      double costoTotal = 0;
      System.out.println("=== Reporte de Operaciones de Flota ===\n");

      for (Vehiculo v : flota) {
          v.mostrarFicha();


          double costoViaje = v.calcularCostoViaje(150);


          System.out.println("Costo de viaje (150.0 km): $" + costoViaje);


          costoTotal += costoViaje;

          System.out.println("\n---------------------------------------------------------------------\n");
      }

      System.out.println("Costo total operativo de la flota: $" + costoTotal);


    }
}