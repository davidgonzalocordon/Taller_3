
package co.edu.udes.Supermercado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CrearProducto {

    public class ProductoApp {

        private static ArrayList<Producto> productos = new ArrayList<>();
        private static Scanner read = new Scanner(System.in);

        public static void main(String[] args) {
            int opcion = 0;

            do
            {
                mostrarMenu();
                opcion = read.nextInt();
                read.nextLine(); // Consumir la nueva línea después de la entrada del usuario

                switch (opcion)
                {
                    case 1:
                        crearProducto();
                        break;
                    case 2:
                        mostrarProductos();
                        break;
                    case 3:
                        System.out.println("¡Adiós!");
                        break;
                    default:
                        System.out.println("Opción inválida");
                }

            } while (opcion != 3);
        }

        private static void mostrarMenu() {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear un nuevo producto");
            System.out.println("2. Mostrar la lista de productos");
            System.out.println("3. Salir");
        }

        private static void crearProducto() {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = read.nextLine();

            System.out.println("Ingrese el precio del producto:");
            double precio = read.nextDouble();
            read.nextLine(); // Consumir la nueva línea después de la entrada del usuario

            System.out.println("Ingrese el código de barras del producto:");
            String codigo = read.nextLine();

            System.out.println("Ingrese la fecha de vencimiento del producto (dd/mm/aaaa):");
            String fechaVencimientoString = read.nextLine();
            Date fechaVencimiento = parseFecha(fechaVencimientoString);

            System.out.println("¿El producto está disponible? (S/N):");
            String respuesta = read.nextLine();
            boolean disponible = respuesta.equalsIgnoreCase("S");

            System.out.println("Ingrese la fecha de expedición del producto (dd/mm/aaaa):");
            String fechaExpedicionString = read.nextLine();
            Date fechaExpedicion = parseFecha(fechaExpedicionString);

            Producto producto = new Producto(precio, codigo, nombre, fechaVencimiento, disponible, fechaExpedicion);
            productos.add(producto);

            System.out.println("El producto ha sido creado satisfactoriamente.");
        }

        private static void mostrarProductos() {
            System.out.println("Lista de productos:");
            for (Producto producto : productos)
            {
                System.out.println(producto);
            }
        }

        private static Date parseFecha(String fechaString) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            try
            {
                Date fecha = formatter.parse(fechaString);
                return fecha;
            } catch (ParseException e)
            {
                System.out.println("Formato de fecha inválido. Se asignará la fecha actual.");
                return new Date();
            }
        }

    }
}
