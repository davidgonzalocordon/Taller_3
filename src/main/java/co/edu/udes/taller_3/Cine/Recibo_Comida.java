package co.edu.udes.taller_3.Cine;

class Recibo_Comida {

    private String receipt_id;
    private String[] name_product;
    private int[] quantity_per_product;
    private int[] value_per_product;
    private int full_value;
    private String name_client;
    private String name_worker;
    private String id_box;

    public Recibo_Comida() {
    }

    public Recibo_Comida(String receipt_id, String[] name_product, int[] quantity_per_product, int[] value_per_product, int full_value, String name_client, String name_worker, String id_box) {
        this.receipt_id = receipt_id;
        this.name_product = name_product;
        this.quantity_per_product = quantity_per_product;
        this.value_per_product = value_per_product;
        this.full_value = full_value;
        this.name_client = name_client;
        this.name_worker = name_worker;
        this.id_box = id_box;
    }

    public Recibo_Comida(String receipt_id) {
        this.receipt_id = receipt_id;
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


    public String getName_client() {
        return name_client;
    }

    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    public String getName_worker() {
        return name_worker;
    }

    public void setName_worker(String name_worker) {
        this.name_worker = name_worker;
    }

    public String getId_box() {
        return id_box;
    }

    public void setId_box(String id_box) {
        this.id_box = id_box;
    }
    
}
