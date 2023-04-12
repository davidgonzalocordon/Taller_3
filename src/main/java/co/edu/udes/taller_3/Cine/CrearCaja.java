package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearCaja {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Selection = 0, change_available;
        List<Caja> objet = new ArrayList<Caja>();
        String box_id;
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

                    System.out.println("Introdusca el ID de la caja: ");
                    box_id = read.next();
                    System.out.println("Introdusca el cambio disponible: ");
                    change_available = read.nextInt();
                    Caja box = new Caja(box_id, change_available);
                    objet.add(box);

                    for (Caja e : objet)
                    {
                        System.out.println("- N." + e.getBox_id() + "  cambio disponible " + e.getChange_available());
                    }

                    System.out.println("Porfavor Ecoja la accion que desea hacer: ");
                    System.out.println("1) Crear");
                    System.out.println("2) Lista");
                    System.out.println("3) Salir");
                    Selection = read.nextInt();

                    break;
                case 2:
                    for (Caja e : objet)
                    {
                        System.out.println("- N." + e.getBox_id() + " cambio disponible " + e.getChange_available());
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