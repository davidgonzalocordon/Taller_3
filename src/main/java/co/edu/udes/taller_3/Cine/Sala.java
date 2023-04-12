
package co.edu.udes.taller_3.Cine;

public class Sala {
    private String id; 
    private int number_of_normal_chairs;
    private int number_of_premium_chairs;
    private int number_of_total_chairs;
    private String type_of_room;
    private Funcion function; 
    private Silla chair; 
    private Trabajador worker;

    public Sala() {
    }

    public Sala(String id, int number_of_normal_chairs, int number_of_premium_chairs, int number_of_total_chairs, String type_of_room, Funcion function, Silla chair) {
        this.id = id;
        this.number_of_normal_chairs = number_of_normal_chairs;
        this.number_of_premium_chairs = number_of_premium_chairs;
        this.number_of_total_chairs = number_of_total_chairs;
        this.type_of_room = type_of_room;
        this.function = function;
        this.chair = chair;
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
    
    
    
}
