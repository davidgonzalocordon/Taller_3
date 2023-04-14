package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearBodega {

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Bodega> listaBodegas = new ArrayList<>();

            while (true)
            {
                System.out.println("1. Crear objeto Bodega");
                System.out.println("2. Ver lista de objetos Bodega");
                System.out.println("3. Cerrar ejecución");

                int opcion = scanner.nextInt();

                switch (opcion)
                {
                    case 1:
                        System.out.println("Ingrese nombre de trabajador:");
                        String nombreTrabajador = scanner.next();

                        System.out.println("Ingrese cantidad de productos:");
                        int cantidadProductos = scanner.nextInt();

                        String[] productos = new String[cantidadProductos];
                        int[] cantidades = new int[cantidadProductos];

                        for (int i = 0; i < cantidadProductos; i++)
                        {
                            System.out.println("Ingrese nombre del producto " + (i + 1) + ":");
                            String producto = scanner.next();
                            productos[i] = producto;

                            System.out.println("Ingrese cantidad del producto " + (i + 1) + ":");
                            int cantidad = scanner.nextInt();
                            cantidades[i] = cantidad;
                        }

                        Bodega nuevaBodega = new Bodega(productos, cantidades, nombreTrabajador);
                        listaBodegas.add(nuevaBodega);

                        System.out.println("Objeto Bodega creado exitosamente.");
                        break;

                    case 2:
                        if (listaBodegas.size() == 0)
                        {
                            System.out.println("No hay objetos Bodega creados.");
                        } else
                        {
                            System.out.println("Lista de objetos Bodega:");

                            for (Bodega bodega : listaBodegas)
                            {
                                System.out.println("- Trabajador: " + bodega.getName_worker());

                                for (int i = 0; i < bodega.getProduct_food().length; i++)
                                {
                                    System.out.println("-- Producto: " + bodega.getProduct_food()[i]);
                                    System.out.println("-- Cantidad: " + bodega.getQuantity_product()[i]);
                                }
                            }
                        }

                        break;

                    case 3:
                        System.out.println("Ejecución cerrada.");
                        return;

                    default:
                        System.out.println("Opción inválida.");
                        break;
                }
            }
        }
    }
}
