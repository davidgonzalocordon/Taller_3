
package co.edu.udes.Supermercado;

public class Bodega {
    private Producto[] producto;
    private int[] catidadProducto; 
    private Employ employ; 

    public Bodega() {
    }

    public Bodega(Producto[] producto, int[] catidadProducto, Employ employ) {
        this.producto = producto;
        this.catidadProducto = catidadProducto;
        this.employ = employ;
    }

    public int[] getCatidadProducto() {
        return catidadProducto;
    }

    public void setCatidadProducto(int[] catidadProducto) {
        this.catidadProducto = catidadProducto;
    }
    
    
    
}
