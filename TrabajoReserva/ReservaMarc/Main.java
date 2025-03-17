import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Allotjament> allotjaments = new ArrayList<>();

        // Sol·licitar el nombre d'allotjaments a l'usuari
        System.out.print("Introdueix la quantitat d'allotjaments a registrar: ");
        int numAllotjaments = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numAllotjaments; i++) {
            System.out.println("\nSelecciona el tipus d'allotjament:");
            System.out.println("1. Apartament");
            System.out.println("2. Casa Rural");
            System.out.println("3. Habitació");
            System.out.print("Opció: ");
            int tipus = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Introdueix el nom de l'allotjament: ");
            String nom = scanner.nextLine();
            System.out.print("Introdueix el nombre de nits: ");
            int nits = scanner.nextInt();

            if (tipus == 1) {
                System.out.print("Nombre d'habitacions: ");
                int habitacions = scanner.nextInt();
                System.out.print("Té cuina? (true/false): ");
                boolean cuina = scanner.nextBoolean();
                allotjaments.add(new Apartament(nom, habitacions, nits, cuina));
            } else if (tipus == 2) {
                System.out.print("Té jardí? (true/false): ");
                boolean jardi = scanner.nextBoolean();
                System.out.print("Té piscina? (true/false): ");
                boolean piscina = scanner.nextBoolean();
                allotjaments.add(new CasaRural(nom, nits, jardi, piscina));
            } else if (tipus == 3) {
                System.out.print("Nombre de llits: ");
                int llits = scanner.nextInt();
                allotjaments.add(new Habitacio(nom, llits, nits));
            }
        }

        int opcio = 0;
        while (opcio != 5) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar Allotjaments Disponibles");
            System.out.println("2. Reservar Allotjament");
            System.out.println("3. Alliberar Allotjament");
            System.out.println("4. Cerca Personalitzada");
            System.out.println("5. Sortir");
            System.out.print("Selecciona una opció: ");
            opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    System.out.println("\nAllotjaments Disponibles:");
                    for (Allotjament a : allotjaments) {
                        if (a.isAvailable()) {
                            System.out.println(a.showInfo());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Introdueix el nom de l'allotjament a reservar: ");
                    String nomReservar = scanner.nextLine();
                    for (Allotjament a : allotjaments) {
                        if (a.getName().equalsIgnoreCase(nomReservar) && a.isAvailable()) {
                            a.reserve();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Introdueix el nom de l'allotjament a alliberar: ");
                    String nomAlliberar = scanner.nextLine();
                    for (Allotjament a : allotjaments) {
                        if (a.getName().equalsIgnoreCase(nomAlliberar) && !a.isAvailable()) {
                            a.liberate();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Cerca Personalitzada:");
                    System.out.println("1. Apartament amb cuina");
                    System.out.println("2. Casa rural amb jardí o piscina");
                    System.out.print("Selecciona una opció: ");
                    int subopcio = scanner.nextInt();
                    scanner.nextLine();
                    
                    if (subopcio == 1) {
                        for (Allotjament a : allotjaments) {
                            if (a instanceof Apartament) {
                                Apartament ap = (Apartament) a;
                                if (ap.isHaveKitchen()) {
                                    System.out.println(ap.showInfo());
                                }
                            }
                        }
                    } else if (subopcio == 2) {
                        for (Allotjament a : allotjaments) {
                            if (a instanceof CasaRural) {
                                CasaRural cr = (CasaRural) a;
                                if (cr.isHaveGarden() || cr.isHavePool()) {
                                    System.out.println(cr.showInfo());
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opcio no valida, intenta-ho novament.");
            }
        }

        scanner.close();
    }
}
