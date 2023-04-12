package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrearTabajador {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Selection = 0, salary;
        List<Trabajador> objet = new ArrayList<Trabajador>();
        String name, schedule, id, phone_number;

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
                    System.out.println("Introdusca el horario: ");
                    schedule = read.next();
                    System.out.println("Introdusca el Salario: ");
                    salary = read.nextInt();
                    System.out.println("Introdusca el ID: ");
                    id = read.next();
                    System.out.println("Introdusca el Numero de Telefono: ");
                    phone_number = read.next();

                    Trabajador employ = new Trabajador(name, schedule, salary, id, phone_number);
                    objet.add(employ);
                    for (Trabajador e : objet)
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
                    for (Trabajador e : objet)
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
