
package co.edu.udes.Supermercado;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CrearEmploy {

   
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Employ> empleados = new ArrayList<>();
        
        while (true) {
            System.out.println("1. Crear nuevo empleado");
            System.out.println("2. Ver lista de empleados");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = read.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String name = read.next();
                    
                    System.out.print("Ingrese la fecha y hora de trabajo (yyyy-mm-dd hh:mm:ss): ");
                    String horarioStr = read.next();
                    Date horario = new Date(horarioStr);
                    
                    System.out.print("Ingrese el sueldo del empleado: ");
                    double sueldo = read.nextDouble();
                    
                    System.out.print("Ingrese el DNI del empleado: ");
                    String dni = read.next();
                    
                    System.out.print("Ingrese el número de teléfono del empleado: ");
                    String numeroTelefono = read.next();
                    
                    Employ empleado = new Employ(name, horario, sueldo, dni, numeroTelefono);
                    empleados.add(empleado);
                    break;
                    
                case 2:
                    System.out.println("Lista de empleados:");
                    for (Employ e : empleados) {
                        System.out.println("Nombre: " + e.getName());
                        System.out.println("Horario: " + e.getHorario());
                        System.out.println("Sueldo: " + e.getSueldo());
                        System.out.println("DNI: " + e.getDni());
                        System.out.println("Número de teléfono: " + e.getNumbre_celphone());
                        System.out.println();
                    }
                    break;
                    
                case 3:
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }

}
