
package co.edu.udes.taller_3.Cine;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CrearSala {

    public static void main(String[] args) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        Scanner read = new Scanner(System.in);
        int Selection = 0;
        List<Sala> rooms = new ArrayList<Sala>();
        String  room_id, type_of_room, name_worker;
        int number_of_normal_chairs, number_of_premium_chairs, number_of_total_chairs;
        Date date_function=null; 
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
                    System.out.println("Inserte id de la sala: ");
                    room_id=read.next();
                    System.out.println("Inserte el total de sillas: ");
                    number_of_total_chairs=read.nextInt();
                    System.out.println("Inserte numero de sillas premium: ");
                    number_of_premium_chairs=read.nextInt();
                    number_of_normal_chairs=number_of_total_chairs-number_of_premium_chairs;
                    System.out.println("Insertar el tipo de sala estandar/3D/4D");
                    type_of_room=read.next(); 
                    System.out.println("Inserte la fecha de la funcion ");
                    String fechaTexto = read.next();
                    date_function = null;
                    boolean repetir = true;
                    do
                    {
                        System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
                        fechaTexto = read.next();

                        try
                        {
                            date_function = formatoFecha.parse(fechaTexto);
                            repetir = false;
                        } catch (ParseException e)
                        {
                            System.out.println("La fecha ingresada no tiene el formato correcto.");
                        }
                    } while (repetir);
                    System.out.println("Inserte el nombre del trabajador: ");
                    name_worker=read.next();
                    Trabajador worker=new Trabajador(name_worker);
                    Sala room=new Sala(room_id,number_of_normal_chairs,number_of_premium_chairs, number_of_total_chairs,type_of_room,date_function,worker.getName());
                    rooms.add(room);

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
                    
                    for (Sala e : rooms)
                    {
                        System.out.println("- sala #" + e.getId()+" tiene "+e.getNumber_of_total_chairs()+" sillas y de estas "+e.getNumber_of_premium_chairs()+" son premium"+" el encargado de esta sala es  "+e.getName_worker());
                    }
                    
                    break;
                case 2:
                    for (Sala e : rooms)
                    {
                        System.out.println("- sala #" + e.getId()+" es una sala"+ e.getType_of_room() +" tiene "+e.getNumber_of_total_chairs()+" sillas y de estas "+e.getNumber_of_premium_chairs()+" son premium"+" el encargado de esta sala es  "+e.getName_worker());
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
