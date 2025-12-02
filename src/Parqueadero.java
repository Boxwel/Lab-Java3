import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tipoVehiculo;
        int hora;
        double costoBase = 0;
        final double recargo = 0.20;

        System.out.println("---Ingrese el tipo de vehiculo---");
        System.out.println("\nAUTO. MOTO, BICICLETA: ");
        tipoVehiculo = scanner.nextLine().toLowerCase();

        System.out.println("Hora de llegada (0-23): ");
        hora = scanner.nextInt();

        switch (tipoVehiculo) {
            case "auto":
                costoBase = 5000;
                break;

            case "moto":
                costoBase = 3000;
                break;

            case "bicicleta":
                costoBase = 1000;
                break;

            default:
                System.out.println("Tipo invalido, igual a 0");
                costoBase = 0;
        }

        double total = costoBase;

        if (hora > 20) {
            double aumento = total * recargo;
            total += aumento;
            System.out.println("Añadido recargo nocturno 20%: +" + aumento);
        }

        System.out.println("\nPago total: $" + total);
    }
}
