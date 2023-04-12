/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearCliente {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Selection = 0;
        List<Cliente> objet = new ArrayList<Cliente>();
        String name, id, phone_number;
        boolean targeta_cine = false;
        System.out.println("Bienvenido porfavor Escoja una de las tres acciones: ");
        System.out.println("1) Crear");
        System.out.println("2) Lista");
        System.out.println("3) Salir");
        Selection = read.nextInt();
        if (Selection > 3 || Selection < 1)
        {
            do
            {
                System.out.println("Porfavor Escoja una opcion Valida: ");
                System.out.println("1) Crear");
                System.out.println("2) Lista");
                System.out.println("3) Salir");
                Selection = read.nextInt();
            } while (Selection > 3 || Selection < 1);
        }
        do
        {
            switch (Selection)
            {
                case 1:
                    System.out.println("Introdusca el nombre: ");
                    name = read.next();
                    System.out.println("Introdusca el ID: ");
                    id = read.next();
                    System.out.println("Introdusca el Numero de Telefono: ");
                    phone_number = read.next();
                    System.out.println("El cliente tiene la tarjeta del cine? s/n:");
                    String respuesta = read.next();
                    if (respuesta.equals("s"))
                    {
                        targeta_cine = true;
                    }
                    Cliente client = new Cliente(name, id, phone_number, targeta_cine);
                    objet.add(client);

                    for (Cliente e : objet)
                    {
                        System.out.println("- " + e.getName());
                    }

                    System.out.println("Porfavor Ecoja la accion que desea hacer: ");
                    System.out.println("1) Crear");
                    System.out.println("2) Lista");
                    System.out.println("3) Salir");
                    Selection = read.nextInt();

                    break;
                case 2:
                    for (Cliente e : objet)
                    {
                        System.out.println("- " + e.getName());
                    }

                    System.out.println("Porfavor Ecoja la accion que desea hacer: ");
                    System.out.println("1) Crear");
                    System.out.println("2) Lista");
                    System.out.println("3) Salir");
                    Selection = read.nextInt();

                    break;
                case 3:
                    System.out.println("Gracias Por Usar Este Software");
                    System.exit(0);
                    break;
            }
        } while (true);
    }

}
