
package co.edu.udes.taller_3.Cine;

import java.util.Date;

class Funcion {
    private String name_movie; 
    private String room_id;
    private Date star_time;
    private Date end_time;

    public Funcion() {
    }

    public Funcion(String name_movie, String room_id, Date star_time, Date end_time) {
        this.name_movie = name_movie;
        this.room_id = room_id;
        this.star_time = star_time;
        this.end_time = end_time;
    }

    public Date getStar_time() {
        return star_time;
    }

    public void setStar_time(Date star_time) {
        this.star_time = star_time;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public String getName_movie() {
        return name_movie;
    }

    public void setName_movie(String name_movie) {
        this.name_movie = name_movie;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    
    
    
}
