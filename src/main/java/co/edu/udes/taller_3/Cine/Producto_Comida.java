
package co.edu.udes.taller_3.Cine;

public class Producto_Comida {
    private String name;
    private int price;
    private String id;
    private String kind_of_product;
    private Proveedor supplier;

    public Producto_Comida() {
    }

    public Producto_Comida(String name, int price, String id, String kind_of_product, Proveedor proveedor) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.kind_of_product = kind_of_product;
        this.supplier = proveedor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind_of_product() {
        return kind_of_product;
    }

    public void setKind_of_product(String kind_of_product) {
        this.kind_of_product = kind_of_product;
    }

    
    
    
}
