package co.edu.udes.Supermercado;

import java.util.Date;

public class Producto {
    private double price; 
    private String codigo_barras; 
    private String name; 
    private Date vencimiento; 
    private boolean disponibilidad; 
    private Date expedicion; 

    public Producto() {
    }

    public Producto(double price, String codigo_barras, String name, Date vencimiento, boolean disponibilidad, Date expedicion) {
        this.price = price;
        this.codigo_barras = codigo_barras;
        this.name = name;
        this.vencimiento = vencimiento;
        this.disponibilidad = disponibilidad;
        this.expedicion = expedicion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(String codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Date getExpedicion() {
        return expedicion;
    }

    public void setExpedicion(Date expedicion) {
        this.expedicion = expedicion;
    }
    
    
    
}
