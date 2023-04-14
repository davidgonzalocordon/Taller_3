
package co.edu.udes.Supermercado;

import java.util.ArrayList;
import java.util.Scanner;


public class CrearProveedor {
 static ArrayList<Provedor> proveedores = new ArrayList<>();

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear proveedor");
            System.out.println("2. Ver lista de proveedores");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = read.nextInt();
            read.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del proveedor: ");
                    String nombre = read.nextLine();
                    System.out.print("Ingrese la dirección del proveedor: ");
                    String direccion = read.nextLine();
                    System.out.print("Ingrese el teléfono del proveedor: ");
                    String telefono = read.nextLine();

                    Provedor proveedor = new Provedor(nombre, direccion, telefono);
                    proveedores.add(proveedor);

                    System.out.println("Proveedor creado exitosamente!");
                    break;
                case 2:
                    if (proveedores.isEmpty()) {
                        System.out.println("No hay proveedores creados aún");
                    } else {
                        System.out.println("Lista de proveedores:");
                        for (Provedor p : proveedores) {
                            System.out.println(p.getNombre() + " - " + p.getDireccion() + " - " + p.getTelefono());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Hasta pronto!");
                    System.exit(0);
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
