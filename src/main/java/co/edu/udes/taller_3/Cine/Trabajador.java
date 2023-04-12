package co.edu.udes.taller_3.Cine;

import java.util.Date;

public class Trabajador {

    private String name;
    private String schedule;
    private int salary;
    private String id;
    private String phone_number;

    public Trabajador() {
    }

    public Trabajador(String name, String horario, int salary, String id, String phone_number) {
        this.name = name;
        this.schedule = horario;
        this.salary = salary;
        this.id = id;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHorario() {
        return schedule;
    }

    public void setHorario(String horario) {
        this.schedule = horario;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    

}
