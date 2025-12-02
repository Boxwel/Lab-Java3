import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String prenda;
        int cantidad;
        double precioBase = 0;
        final double descuento = 0.15;

        System.out.println("---Ingrese el tipo de prenda---");
        System.out.println("\nCAMISA, PANTALON, CHAQUETA: ");
        prenda = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese la cantidad a comprar: ");
        cantidad = scanner.nextInt();

        switch (prenda) {
            case "camisa":
                precioBase = 30000;
                break;

            case "pantalón":
            case "pantalon":
                precioBase = 50000;
                break;

            case "chaqueta":
                precioBase = 80000;
                break;

            default:
                System.out.println("Prenda invalida. Total = 0.");
                precioBase = 0;
        }

        double total = precioBase * cantidad;

        if (cantidad > 5) {
            double valorDescuento = total * descuento;
            total -= valorDescuento;
            System.out.println("Descuento del 15% aplicado: -" + valorDescuento);
        }

        System.out.println("\nPago total: $" + total);
    }
}
