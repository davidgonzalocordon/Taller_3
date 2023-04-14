
package co.edu.udes.Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CrearFactura {

    
   static ArrayList<Factura> recibos = new ArrayList<>();
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
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
                    verRecibos(recibos);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }

    static void crearRecibo() {
        System.out.println("Ingrese el ID del recibo:");
        String receipt_id = read.next();

        System.out.println("Ingrese el nombre del cliente:");
        String name_client = read.next();

        System.out.println("Ingrese el nombre del trabajador:");
        String name_worker = read.next();

        System.out.println("Ingrese el ID de la caja:");
        String id_box = read.next();

        System.out.println("Ingrese el número de productos en el recibo:");
        int num_productos = read.nextInt();

        String[] name_product = new String[num_productos];
        int[] quantity_per_product = new int[num_productos];
        int[] value_per_product = new int[num_productos];
        int full_value = 0;
        for (int i = 0; i < num_productos; i++)
        {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            name_product[i] = read.next();

            System.out.println("Ingrese la cantidad de " + name_product[i] + ":");
            quantity_per_product[i] = read.nextInt();

            System.out.println("Ingrese el valor de " + name_product[i] + ":");
            value_per_product[i] = read.nextInt()*quantity_per_product[i];
            full_value = full_value + value_per_product[i];
        }

        Factura recibo = new Factura(receipt_id, name_product, quantity_per_product, value_per_product, full_value, name_client, name_worker, id_box);
        recibos.add(recibo);
        System.out.println("Recibo creado correctamente");
    }

    private static void verRecibos(List<Factura> recibos) {
        if (recibos.size() == 0)
        {
            System.out.println("No hay recibos registrados.");
            return;
        }
        for (Factura recibo : recibos)
        {
            System.out.println("Recibo ID: " + recibo.getReceipt_id());
            System.out.println("Productos:");
            for (int i = 0; i < recibo.getName_product().length; i++)
            {
                System.out.println(" - " + recibo.getName_product()[i] + " (Cantidad: " + recibo.getQuantity_per_product()[i] + ", Valor: " + recibo.getValue_per_product()[i] + ")");
            }
            System.out.println("Valor total: " + recibo.getFull_value());
            System.out.println("Cliente: " + recibo.getName_client());
            System.out.println("Trabajador: " + recibo.getName_worker());
            System.out.println("Caja: " + recibo.getId_box());
            System.out.println("----------");
        }
    }
    
}
