
package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CrearSilla {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Selection = 0;
        List<Silla> chairPremium = new ArrayList<Silla>();
        List<Silla> chair = new ArrayList<Silla>();
        String id_chair, room_id;
        boolean bought = false, premium = false;
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
                    System.out.println("Inserte la id de la silla: ");
                    id_chair = read.next();
                    System.out.println("Inserte la id de la sala:");
                    room_id = read.next();
                    System.out.println("la silla es premium? s/n ");
                    String decicion = read.next();
                    if (decicion.equals("s"))
                    {
                        premium = true;
                    }
                    System.out.println("la silla ya esta comprada? s/n ");
                    decicion=read.next();
                    if (decicion.equals("s"))
                    {
                        bought=true;
                    }
                    
                    Silla silla = new Silla(id_chair, room_id, bought, premium);

                    if (silla.isPremium())
                    {
                        chairPremium.add(silla);
                    } else
                    {
                        chair.add(silla);
                    }

                    System.out.println("Sillas premium");
                    for (Silla e : chairPremium)
                    {
                        System.out.println("-  silla #" + e.getId_chair() + " sala " + e.getRoom_id() + " es premuim, comprada: "+e.isBought());
                    }
                    System.out.println("sillas estandar");
                    for (Silla e : chair)
                    {
                        System.out.println("- silla #" + e.getId_chair() + " de la sala " + e.getRoom_id() + " la estandar, comprada: "+e.isBought());

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
                    System.out.println("Sillas premium");
                    for (Silla e : chairPremium)
                    {
                        System.out.println("-  silla #" + e.getId_chair() + " sala " + e.getRoom_id() + " es premuim, comprada: "+e.isBought());
                    }
                    System.out.println("sillas estandar");
                    for (Silla e : chair)
                    {
                        System.out.println("- silla #" + e.getId_chair() + " de la sala " + e.getRoom_id() + " la estandar, comprada: "+e.isBought());

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
