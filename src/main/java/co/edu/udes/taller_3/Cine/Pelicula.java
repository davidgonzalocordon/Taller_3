
package co.edu.udes.taller_3.Cine;

import java.util.Date;


class Pelicula {
    private String name;
    private String id;
    private String kind_of_movie;
    private String age_restriction;
    private Date duration;
    private Proveedor supplier;

    public Pelicula() {
    }

    public Pelicula(String name, String id, String kind_of_movie, String age_restriction, Date duration, Proveedor supplier) {
        this.name = name;
        this.id = id;
        this.kind_of_movie = kind_of_movie;
        this.age_restriction = age_restriction;
        this.duration = duration;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind_of_movie() {
        return kind_of_movie;
    }

    public void setKind_of_movie(String kind_of_movie) {
        this.kind_of_movie = kind_of_movie;
    }

    public String getAge_restriction() {
        return age_restriction;
    }

    public void setAge_restriction(String age_restriction) {
        this.age_restriction = age_restriction;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }
    
    
    
}
