
package co.edu.udes.taller_3.Cine;

import java.util.Date;

class Recibo_Funcion {
    private String receipt_id;
    private String[] number_of_posts;
    private String id_room;
    private String id_chair;
    private String name_client;
    private String name_worker;
    private Date function;
    private String id_box;

    public Recibo_Funcion() {
    }

    public Recibo_Funcion(String receipt_id, String[] number_of_posts, String id_room, String id_chair, String name_client, String name_worker, Date function, String id_box) {
        this.receipt_id = receipt_id;
        this.number_of_posts = number_of_posts;
        this.id_room = id_room;
        this.id_chair = id_chair;
        this.name_client = name_client;
        this.name_worker = name_worker;
        this.function = function;
        this.id_box = id_box;
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

    public String getId_room() {
        return id_room;
    }

    public void setId_room(String id_room) {
        this.id_room = id_room;
    }

    public String getId_chair() {
        return id_chair;
    }

    public void setId_chair(String id_chair) {
        this.id_chair = id_chair;
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

    public Date getFunction() {
        return function;
    }

    public void setFunction(Date function) {
        this.function = function;
    }

    public String getId_box() {
        return id_box;
    }

    public void setId_box(String id_box) {
        this.id_box = id_box;
    }

   
}
