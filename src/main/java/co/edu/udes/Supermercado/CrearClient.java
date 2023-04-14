package co.edu.udes.Supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearClient {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<Client>();
        boolean isRunning = true;

        while (isRunning)
        {
            System.out.println("Elija una opción:");
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Ver lista de clientes");
            System.out.println("3. Salir");
            int option = read.nextInt();

            switch (option)
            {
                case 1:
                    System.out.println("Ingrese el nombre del cliente:");
                    String name = read.next();
                    System.out.println("Ingrese el DNI del cliente:");
                    String dni = read.next();
                    System.out.println("Ingrese el correo electrónico del cliente:");
                    String email = read.next();
                    System.out.println("Ingrese los puntos del cliente:");
                    int puntos = read.nextInt();
                    Client newClient = new Client(name, dni, email, puntos);
                    clients.add(newClient);
                    System.out.println("Cliente creado exitosamente.");
                    break;
                case 2:
                    System.out.println("Lista de clientes:");
                    for (Client client : clients)
                    {
                        System.out.println(client.getName() + " - " + client.getDni() + " - " + client.getEmail() + " - " + client.getPuntos());
                    }
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }
        }

        System.out.println("Sesión cerrada.");
    }

}
