
package co.edu.udes.taller_3.Cine;

class Silla {
    private String id_chair;
    private boolean bought;
    private boolean premium; 
    private Sala room; 

    public Silla() {
    }

    public Silla(String id_chair, boolean bought, boolean premium, Sala room) {
        this.id_chair = id_chair;
        this.bought = bought;
        this.premium = premium;
        this.room = room;
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
    
    
    
}
