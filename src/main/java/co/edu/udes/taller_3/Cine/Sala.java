
package co.edu.udes.taller_3.Cine;

import java.util.Date;

public class Sala {
    private String id; 
    private int number_of_normal_chairs;
    private int number_of_premium_chairs;
    private int number_of_total_chairs;
    private String type_of_room;
    private Date date_function; 
    private String name_worker;

    public Sala() {
    }

    public Sala(String id, int number_of_normal_chairs, int number_of_premium_chairs, int number_of_total_chairs, String type_of_room, Date date_function, String name_worker) {
        this.id = id;
        this.number_of_normal_chairs = number_of_normal_chairs;
        this.number_of_premium_chairs = number_of_premium_chairs;
        this.number_of_total_chairs = number_of_total_chairs;
        this.type_of_room = type_of_room;
        this.date_function = date_function;
        this.name_worker = name_worker;
    }

    

    public Sala(String id) {
        this.id = id;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber_of_normal_chairs() {
        return number_of_normal_chairs;
    }

    public void setNumber_of_normal_chairs(int number_of_normal_chairs) {
        this.number_of_normal_chairs = number_of_normal_chairs;
    }

    public int getNumber_of_premium_chairs() {
        return number_of_premium_chairs;
    }

    public void setNumber_of_premium_chairs(int number_of_premium_chairs) {
        this.number_of_premium_chairs = number_of_premium_chairs;
    }

    public int getNumber_of_total_chairs() {
        return number_of_total_chairs;
    }

    public void setNumber_of_total_chairs(int number_of_total_chairs) {
        this.number_of_total_chairs = number_of_total_chairs;
    }

    public String getType_of_room() {
        return type_of_room;
    }

    public void setType_of_room(String type_of_room) {
        this.type_of_room = type_of_room;
    }

    public Date getDate_function() {
        return date_function;
    }

    public void setDate_function(Date date_function) {
        this.date_function = date_function;
    }


    public String getName_worker() {
        return name_worker;
    }

    public void setName_worker(String name_worker) {
        this.name_worker = name_worker;
    }
    
    
    
}
