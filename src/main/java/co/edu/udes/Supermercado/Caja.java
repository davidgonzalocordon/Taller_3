/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.Supermercado;

/**
 *
 * @author ASUS
 */
public class Caja {
    private Factura factura;
    private double cambioDisponible; 
    private Employ employ; 
    private String numCaja; 

    public Caja() {
    }

    public Caja(Factura factura, double cambioDisponible, Employ employ, String numCaja) {
        this.factura = factura;
        this.cambioDisponible = cambioDisponible;
        this.employ = employ;
        this.numCaja = numCaja;
    }

    public double getCambioDisponible() {
        return cambioDisponible;
    }

    public void setCambioDisponible(double cambioDisponible) {
        this.cambioDisponible = cambioDisponible;
    }

    public String getNumCaja() {
        return numCaja;
    }

    public void setNumCaja(String numCaja) {
        this.numCaja = numCaja;
    }

    
    
}
