/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.Scanner;

public class CrearProducto {

    public static void main(String[] args) {
        ArrayList<Producto_Comida> productos = new ArrayList<Producto_Comida>();
        Scanner read = new Scanner(System.in);
        boolean ejecucion = true;

        while (ejecucion)
        {
            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Crear un nuevo producto de comida");
            System.out.println("2. Ver la lista de productos creados");
            System.out.println("3. Cerrar la ejecución");

            int opcion = read.nextInt();
            read.nextLine(); // Consume el salto de línea después de la entrada del usuario

            switch (opcion)
            {
                case 1:
                    System.out.println("Ingrese el nombre del producto:");
                    String nombre = read.nextLine();
                    System.out.println("Ingrese el precio del producto:");
                    int precio = read.nextInt();
                    read.nextLine(); // Consume el salto de línea después de la entrada del usuario
                    System.out.println("Ingrese el ID del producto:");
                    String id = read.nextLine();
                    System.out.println("Ingrese el tipo de producto (comida/bebida):");
                    String tipo = read.nextLine();
                    System.out.println("Ingrese el nombre del proveedor:");
                    String proveedor = read.nextLine();

                    Producto_Comida nuevoProducto = new Producto_Comida(nombre, precio, id, tipo, proveedor);
                    productos.add(nuevoProducto);
                    System.out.println("Producto creado con éxito.");
                    break;
                case 2:
                    System.out.println("Lista de productos creados:");
                    for (Producto_Comida producto : productos)
                    {
                        System.out.println("- Nombre: " + producto.getName());
                        System.out.println("    Precio: " + producto.getPrice());
                        System.out.println("    ID: " + producto.getId());
                        System.out.println("    Tipo: " + producto.getKind_of_product());
                        System.out.println("    Proveedor: " + producto.getName_supplier());
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Ejecución cerrada.");
                    ejecucion = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }

    }
}


