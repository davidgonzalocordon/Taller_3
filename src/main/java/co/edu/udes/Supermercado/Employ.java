package co.edu.udes.Supermercado;

import java.util.Date;

public class Employ {
    private String name; 
    private Date horario; 
    private double sueldo; 
    private String dni; 
    private String numbre_celphone; 

    public Employ() {
    }

    public Employ(String name, Date horario, double sueldo, String dni, String numbre_celphone) {
        this.name = name;
        this.horario = horario;
        this.sueldo = sueldo;
        this.dni = dni;
        this.numbre_celphone = numbre_celphone;
    }

    public Employ(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumbre_celphone() {
        return numbre_celphone;
    }

    public void setNumbre_celphone(String numbre_celphone) {
        this.numbre_celphone = numbre_celphone;
    }

}
