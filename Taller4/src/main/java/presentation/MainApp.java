package main.java.presentation;

import java.util.Scanner;

import main.java.data.UserRepository;
import main.java.logic.UserService;

// contiene la capa de presentación (interfaz por consola).

public class MainApp {

    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        UserService logic = new UserService(repo);
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n==== MENÚ ====");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpia buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.println(logic.registerUser(nombre));
                    break;

                case 2:
                    logic.showUsers();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
