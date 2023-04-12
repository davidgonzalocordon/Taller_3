
package co.edu.udes.taller_3.Cine;

public class Bodega {
    private Producto_Comida[] product_food; 
    private int[] quantity_product;
    private Trabajador worker; 

    public Bodega() {
    }

    public Bodega(Producto_Comida[] product_food, int[] quantity_product, Trabajador worker) {
        this.product_food = product_food;
        this.quantity_product = quantity_product;
        this.worker = worker;
    }

    public Producto_Comida[] getProduct_food() {
        return product_food;
    }

    public void setProduct_food(Producto_Comida[] product_food) {
        this.product_food = product_food;
    }

    public int[] getQuantity_product() {
        return quantity_product;
    }

    public void setQuantity_product(int[] quantity_product) {
        this.quantity_product = quantity_product;
    }

    public Trabajador getWorker() {
        return worker;
    }

    public void setWorker(Trabajador worker) {
        this.worker = worker;
    }
    
    
    
}
