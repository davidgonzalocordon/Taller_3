/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.Supermercado;

import java.util.Date;

/**
 *
 * @author ASUS
 */
class Factura {
    private Producto[] product;
    private Employ employ; 
    private Client client; 
    private int[] n_products;
    private Date fecha_venta; 

    public Factura() {
    }

    public Factura(Producto[] product, Employ employ, Client client, int[] n_products, Date fecha_venta) {
        this.product = product;
        this.employ = employ;
        this.client = client;
        this.n_products = n_products;
        this.fecha_venta = fecha_venta;
    }

    public void setN_products(int[] n_products) {
        this.n_products = n_products;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }
    
    
    
}
