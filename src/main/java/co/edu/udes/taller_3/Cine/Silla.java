
package co.edu.udes.taller_3.Cine;

class Silla {
    private String id_chair;
    private boolean bought;
    private boolean premium; 
    private String room_id; 

    public Silla() {
    }

    public Silla(String id_chair,String room_id ,boolean bought , boolean premium) {
        this.id_chair = id_chair;
        this.bought = bought;
        this.premium = premium;
        this.room_id = room_id;
    }

    public String getId_chair() {
        return id_chair;
    }

    public void setId_chair(String id_chair) {
        this.id_chair = id_chair;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }
    
    
    
}
