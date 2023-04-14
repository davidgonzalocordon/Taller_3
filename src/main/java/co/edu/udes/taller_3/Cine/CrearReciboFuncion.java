/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class CrearReciboFuncion {

    static ArrayList<Recibo_Funcion> listaRecibos = new ArrayList<>();
    Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion;

        do
        {
            System.out.println("1. Crear recibo de comida");
            System.out.println("2. Ver listado de recibos de comida");
            System.out.println("3. Salir");
            opcion = read.nextInt();

            switch (opcion)
            {
                case 1:
                    crearRecibo();
                    break;
                case 2:
                    verRecibos(listaRecibos);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }

    static void crearRecibo() {
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce el ID del recibo:");
        String receipt_id = read.nextLine();

        System.out.println("Introduce el número de posts:");
        String[] number_of_posts = read.nextLine().split(",");

        System.out.println("Introduce el ID de la habitación:");
        String id_room = read.nextLine();

        System.out.println("Introduce el ID de la silla:");
        String id_chair = read.nextLine();

        System.out.println("Introduce el nombre del cliente:");
        String name_client = read.nextLine();

        System.out.println("Introduce el nombre del trabajador:");
        String name_worker = read.nextLine();

        System.out.println("Introduce la fecha de la función (en formato dd/MM/yyyy HH:mm:ss):");
        Date function = new Date(read.nextLine());

        System.out.println("Introduce el ID de la caja:");
        String id_box = read.nextLine();

        Recibo_Funcion recibo = new Recibo_Funcion(receipt_id, number_of_posts, id_room, id_chair, name_client, name_worker, function, id_box);
        listaRecibos.add(recibo);
    }

    private static void verRecibos(List<Recibo_Funcion> listaRecibos) {
        if (listaRecibos.size() == 0)
        {
            System.out.println("No hay recibos para mostrar.");
        } else
        {
            System.out.println("Recibos:");
            for (Recibo_Funcion recibo : listaRecibos)
            {
                System.out.println(recibo.getReceipt_id());
            }
        }
    }

}
