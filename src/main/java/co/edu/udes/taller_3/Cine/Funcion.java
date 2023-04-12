
package co.edu.udes.taller_3.Cine;

import java.util.Date;

class Funcion {
    private Pelicula movie; 
    private Sala room;
    private Date star_time;
    private Date end_time;
    private Date date; 

    public Funcion() {
    }

    public Funcion(Pelicula movie, Sala room, Date star_time, Date end_time, Date date) {
        this.movie = movie;
        this.room = room;
        this.star_time = star_time;
        this.end_time = end_time;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
