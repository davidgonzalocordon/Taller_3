
package co.edu.udes.taller_3.Cine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CrearFuncion {

    public static void main(String[] args) {
        SimpleDateFormat formatoFechaHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Scanner read = new Scanner(System.in);
        int Selection = 0, change_available;
        List<Funcion> objet = new ArrayList<Funcion>();
        String name_move, room_id;
        Date start_date = null, end_date = null;
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
                    ;
                    System.out.println("Inserte el nombre de la pelicula: ");
                    name_move = read.next();
                    Pelicula move = new Pelicula(name_move);
                    System.out.println("Inserte la id de la sala: ");
                    room_id = read.next();
                    Sala room = new Sala(room_id);
                    while (start_date == null)
                    {
                        System.out.println("Ingrese la fecha y hora de inicio en formato dd/MM/yyyy HH:mm:");
                        String fechaInicioTexto = read.nextLine();

                        // Convertir la entrada del usuario a un objeto de tipo Date
                        try
                        {
                            start_date = formatoFechaHora.parse(fechaInicioTexto);
                        } catch (ParseException e)
                        {
                            System.out.println("La fecha y hora de inicio ingresadas no tienen el formato correcto.");
                            // e.printStackTrace();
                        }
                    }

                    while (end_date == null)
                    {
                        System.out.println("Ingrese la fecha y hora de salida en formato dd/MM/yyyy HH:mm:");
                        String fechaSalidaTexto = read.nextLine();

                        // Convertir la entrada del usuario a un objeto de tipo Date
                        try
                        {
                            end_date = formatoFechaHora.parse(fechaSalidaTexto);
                        } catch (ParseException e)
                        {
                            System.out.println("La fecha y hora de salida ingresadas no tienen el formato correcto.");
                            // e.printStackTrace();
                        }
                    }

                    Funcion funcion = new Funcion(move.getName(), room.getId(), start_date, end_date);

                    objet.add(funcion);
                    for (Funcion e : objet)
                    {
                        System.out.println("- la funcion de la pelicula " + e.getName_movie() + " empieza el " + e.getStar_time() + " y termina " + e.getEnd_time() + " en la sala " + e.getRoom_id());
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
                    for (Funcion e : objet)
                    {
                        System.out.println("- la funcion de la pelicula " + e.getName_movie() + " empieza el " + e.getStar_time() + " y termina " + e.getEnd_time() + " en la sala " + e.getRoom_id());
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
