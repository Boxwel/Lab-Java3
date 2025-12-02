import java.util.Scanner;

public class Veterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoAnimal;
        int edad;
        String veterinario = "";
        boolean vacunaAdicional = false;

        System.out.println("---Ingresa el tipo de animal---");
        System.out.println("\nPERRO, GATO, AVE, OTRO");
        tipoAnimal = sc.nextLine().toLowerCase();

        System.out.println("Edad del animal: ");
        edad = sc.nextInt();

        switch (tipoAnimal) {
            case "perro":
                veterinario = "veterinario canino";
                if (edad > 5) vacunaAdicional = true;
                break;

            case "gato":
                veterinario = "veterinario felino";
                if (edad > 5) vacunaAdicional = true;
                break;

            case "ave":
                veterinario = "veterinario de animales exóticos";
                break;

            case "otro":
                veterinario = "veterinario general";
                break;

            default:
                System.out.println("Medico general porque no se reconoce el animal");
                veterinario = "veterinario general";
        }

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Veterinario asignado: " + veterinario);

        if (vacunaAdicional) {
            System.out.println("Necesita vacuna adicional.");
        } else {
            System.out.println("No necesita vacuna adicional.");

        }
    }
}
