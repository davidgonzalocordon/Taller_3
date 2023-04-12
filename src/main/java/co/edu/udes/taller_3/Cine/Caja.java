
package co.edu.udes.taller_3.Cine;

public class Caja {
private String box_id;
    private int change_available;
private Trabajador worker; 

    public Caja() {
    }

    public Caja(String box_id, int change_available, Trabajador worker) {
        this.box_id = box_id;
        this.change_available = change_available;
        this.worker = worker;
    }

    public Caja(String box_id, int change_available) {
        this.box_id = box_id;
        this.change_available = change_available;
    }
    
    public String getBox_id() {
        return box_id;
    }

    public void setBox_id(String box_id) {
        this.box_id = box_id;
    }

    public int getChange_available() {
        return change_available;
    }

    public void setChange_available(int change_available) {
        this.change_available = change_available;
    }



}
