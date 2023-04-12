
package co.edu.udes.taller_3.Cine;

class Recibo_Funcion {
    private String receipt_id;
    private String[] number_of_posts;
    private Sala room;
    private Silla chair;
    private Cliente client;
    private Trabajador worker;
    private Funcion function;
    private Caja box;

    public Recibo_Funcion() {
    }

    public Recibo_Funcion(String receipt_id, String[] number_of_posts, Sala room, Silla chair, Cliente client, Trabajador worker, Funcion function, Caja box) {
        this.receipt_id = receipt_id;
        this.number_of_posts = number_of_posts;
        this.room = room;
        this.chair = chair;
        this.client = client;
        this.worker = worker;
        this.function = function;
        this.box = box;
    }

    public String getReceipt_id() {
        return receipt_id;
    }

    public void setReceipt_id(String receipt_id) {
        this.receipt_id = receipt_id;
    }

    public String[] getNumber_of_posts() {
        return number_of_posts;
    }

    public void setNumber_of_posts(String[] number_of_posts) {
        this.number_of_posts = number_of_posts;
    }

}
