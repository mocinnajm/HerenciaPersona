import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<allotjament> alojamientos = new ArrayList<>();

        // Solicitar el número de alojamientos al usuario
        System.out.print("Ingrese la cantidad de alojamientos a registrar: ");
        int numAlojamientos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numAlojamientos; i++) {
            System.out.println("\nSeleccione el tipo de alojamiento:");
            System.out.println("1. Apartamento");
            System.out.println("2. Casa Rural");
            System.out.println("3. Habitación");
            System.out.print("Opción: ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Ingrese el nombre del alojamiento: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la capacidad: ");
            int capacidad = scanner.nextInt();
            System.out.print("¿Está disponible? (true/false): ");
            boolean disponible = scanner.nextBoolean();

            if (tipo == 1) {
                System.out.print("Número de habitaciones: ");
                int habitaciones = scanner.nextInt();
                System.out.print("¿Tiene cocina? (true/false): ");
                boolean cocina = scanner.nextBoolean();
                alojamientos.add(new Apartament(nombre, capacidad, disponible, habitaciones, cocina));
            } else if (tipo == 2) {
                System.out.print("¿Tiene jardín? (true/false): ");
                boolean jardin = scanner.nextBoolean();
                System.out.print("¿Tiene piscina? (true/false): ");
                boolean piscina = scanner.nextBoolean();
                alojamientos.add(new CasaRural(nombre, capacidad, disponible, jardin, piscina));
            } else if (tipo == 3) {
                System.out.print("Ingrese el precio por noche: ");
                double precio = scanner.nextDouble();
                System.out.print("Ingrese el número de noches: ");
                int noches = scanner.nextInt();
                System.out.print("Número de camas: ");
                int camas = scanner.nextInt();
                alojamientos.add(new Habitacio(nombre, capacidad, disponible, precio, noches, camas));
            }
        }

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar Alojamientos Disponibles");
            System.out.println("2. Reservar Alojamiento");
            System.out.println("3. Liberar Alojamiento");
            System.out.println("4. Búsqueda Personalizada");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nAlojamientos Disponibles:");
                    for (allotjament a : alojamientos) {
                        if (a.isDisponile()) {
                            System.out.println(a.MostarInfo());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del alojamiento a reservar: ");
                    String nombreReservar = scanner.nextLine();
                    for (allotjament a : alojamientos) {
                        if (a.getNom().equalsIgnoreCase(nombreReservar) && a.isDisponile()) {
                            a.reservar();
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del alojamiento a liberar: ");
                    String nombreLiberar = scanner.nextLine();
                    for (allotjament a : alojamientos) {
                        if (a.getNom().equalsIgnoreCase(nombreLiberar) && !a.isDisponile()) {
                            a.liberar();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Búsqueda Personalizada:");
                    System.out.println("1. Apartamento con cocina");
                    System.out.println("2. Casa rural con jardín o piscina");
                    System.out.print("Seleccione una opción: ");
                    int subopcion = scanner.nextInt();
                    scanner.nextLine();

                    if (subopcion == 1) {
                        for (allotjament a : alojamientos) {
                            if (a instanceof Apartament) {
                                Apartament ap = (Apartament) a;
                                if (ap.isTeCuina()) {
                                    System.out.println(ap.Mostarinfo());
                                }
                            }
                        }
                    } else if (subopcion == 2) {
                        for (allotjament a : alojamientos) {
                            if (a instanceof CasaRural) {
                                CasaRural cr = (CasaRural) a;
                                if (cr.isTeJardin() || cr.isTePiscina()) {
                                    System.out.println(cr.mostrarInfo());
                                }
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        }

        scanner.close();
    }
}
