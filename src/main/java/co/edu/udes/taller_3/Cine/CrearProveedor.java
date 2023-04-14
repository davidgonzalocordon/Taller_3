package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearProveedor {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Selection = 0;
        List<Proveedor> objet = new ArrayList<Proveedor>();
        String name, id_food_received, name_move = null;
        boolean facture_food = false, facture_move = false;
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

                    System.out.println("Inserte la id del recibo: ");
                    id_food_received = read.next();

                    Proveedor proveedor = new Proveedor(name, id_food_received);
                    objet.add(proveedor);

                    for (Proveedor e : objet)
                    {
                        System.out.println("- " + e.getName() + ", id factura " + e.getId_food_received());
                    }

                    System.out.println("Porfavor Ecoja la accion que desea hacer: ");
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

                    break;
                case 2:
                    for (Proveedor e : objet)
                    {
                        System.out.println("- " + e.getName() + ", id factura " + e.getId_food_received());
                    }

                    System.out.println("Porfavor Ecoja la accion que desea hacer: ");
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

                    break;
                case 3:
                    System.out.println("Gracias Por Usar Este Software");
                    System.exit(0);
                    break;
            }

        } while (true);
    }
}
