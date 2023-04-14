package co.edu.udes.Supermercado;


public class Producto {
    private int id;
    private String name;
    private Provedor provider;
    private double price;

    public Producto(int id, String name, Provedor provider, double price) {
        this.id = id;
        this.name = name;
        this.provider = provider;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Provedor getProvider() {
        return provider;
    }

    public void setProvider(Provedor provider) {
        this.provider = provider;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
 
}
