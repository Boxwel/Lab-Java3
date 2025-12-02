import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        double valor;
        int cantidad;
        boolean membresia;

        final double descuentoMiembro = 0.10;     // 10%
        final double descuentoProductos = 0.05;   // 5%

        Scanner scanner = new Scanner(System.in);
        System.out.println("---SUPERMERCADO---");

        System.out.println("Ingrese valor producto: ");
        valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Ingrese cantidad productos: ");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        double total = valor * cantidad;

        System.out.println("Tiene membresía (si/no): ");
        String respuesta = scanner.nextLine().toLowerCase();
        membresia = respuesta.equals("si");

        if (membresia) {
            double descuento = total * descuentoMiembro;
            total -= descuento;
            System.out.println("Descuento por membresía: -" + descuento);
        }

        if (cantidad >= 10) {
            double descuento = total * descuentoProductos;
            total -= descuento;
            System.out.println("Descuento promocional por +10 productos: " + descuento);
        }

        System.out.println("\nTotal a pagar: " + total);
    }
}
