package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrearPelicula {

    public static void main(String[] args) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Scanner read = new Scanner(System.in);
        int Selection = 0, change_available;
        List<Pelicula> objet = new ArrayList<Pelicula>();
        String name_move, id, kind_of_movie, age_restriction, name_proveedor;
        boolean have_age_restriction = false;
        Date release_date;
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
                    System.out.println("Inserte el nombre de la pelicula: ");
                    name_move = read.next();
                    System.out.println("Inserte la id de la pelicula:");
                    id = read.next();
                    System.out.println("Inserte el tipo de pelicula: ");
                    kind_of_movie = read.next();
                    System.out.println("Tiene Restriccion de edad? s/n");
                    String decision = read.next();
                    if (decision.equals("s"))
                    {
                        have_age_restriction = true;
                        System.out.println("Innserte apartir de los cuantos años lo pueden ver las personas");
                        age_restriction = read.next();
                    }
                    System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
                    String fechaTexto = read.next();

                    release_date = null;
                    boolean repetir = true;
                    do
                    {
                        System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
                        fechaTexto = read.next();

                        try
                        {
                            release_date = formatoFecha.parse(fechaTexto);
                            repetir = false;
                        } catch (ParseException e)
                        {
                            System.out.println("La fecha ingresada no tiene el formato correcto.");
                        }
                    } while (repetir);

                    System.out.println("Inserte el nombre del proveedor: ");
                    name_proveedor = read.next();

                    Proveedor proveedor = new Proveedor(name_proveedor);
                    Pelicula move = new Pelicula(name_move, id, kind_of_movie, release_date, name_proveedor);
                    objet.add(move);
                    for (Pelicula e : objet)
                    {
                        System.out.println("- " + e.getName() + "  se estrena el  " + formatoFecha.format(e.getDuration()) + " es una lepicula de " + e.getKind_of_movie());
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
                    for (Pelicula e : objet)
                    {
                        System.out.println("- " + e.getName() + "  se estrena el  " + formatoFecha.format(e.getDuration()) + " es una lepicula de " + e.getKind_of_movie());
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
