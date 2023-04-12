/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.Supermercado;

/**
 *
 * @author ASUS
 */
public class Client {
    private String name;  
    private String dni; 
    private String Email; 
    private int Puntos; 

    public Client() {
    }

    public Client(String name, String dni, String Email, int Puntos) {
        this.name = name;
        this.dni = dni;
        this.Email = Email;
        this.Puntos = Puntos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }
    
    
    
}
