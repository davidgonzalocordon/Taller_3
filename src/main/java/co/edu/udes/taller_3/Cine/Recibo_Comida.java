package co.edu.udes.taller_3.Cine;

class Recibo_Comida {

    private String receipt_id;
    private Producto_Comida product_food;
    private String[] name_product;
    private int[] quantity_per_product;
    private int[] value_per_product;
    private int full_value;
    private Cliente client;
    private Trabajador worker;
    private Caja box;

    public Recibo_Comida() {
    }

    public Recibo_Comida(String receipt_id, Producto_Comida product_food, String[] name_product, int[] quantity_per_product, int[] value_per_product, int full_value, Cliente client, Trabajador worker, Caja box) {
        this.receipt_id = receipt_id;
        this.product_food = product_food;
        this.name_product = name_product;
        this.quantity_per_product = quantity_per_product;
        this.value_per_product = value_per_product;
        this.full_value = full_value;
        this.client = client;
        this.worker = worker;
        this.box = box;
    }

    public String getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(String receipt_id) {
        this.receipt_id = receipt_id;
    }

    public String[] getName_product() {
        return name_product;
    }

    public void setName_product(String[] name_product) {
        this.name_product = name_product;
    }

    public int[] getQuantity_per_product() {
        return quantity_per_product;
    }

    public void setQuantity_per_product(int[] quantity_per_product) {
        this.quantity_per_product = quantity_per_product;
    }

    public int[] getValue_per_product() {
        return value_per_product;
    }

    public void setValue_per_product(int[] value_per_product) {
        this.value_per_product = value_per_product;
    }

    public int getFull_value() {
        return full_value;
    }

    public void setFull_value(int full_value) {
        this.full_value = full_value;
    }
    
}
