
package co.edu.udes.taller_3.Cine;

import java.util.Date;


class Pelicula {
    private String name;
    private String id;
    private String kind_of_movie;
    private String age_restriction;
    private Date release_date;
    private String name_supplier;

    public Pelicula() {
    }

    public Pelicula(String name, String id, String kind_of_movie, String age_restriction, Date duration, String name_supplier) {
        this.name = name;
        this.id = id;
        this.kind_of_movie = kind_of_movie;
        this.age_restriction = age_restriction;
        this.release_date = duration;
        this.name_supplier = name_supplier;
    }

    public Pelicula(String name, String id, String kind_of_movie, Date duration, String name_supplier) {
        this.name = name;
        this.id = id;
        this.kind_of_movie = kind_of_movie;
        this.release_date = duration;
        this.name_supplier = name_supplier;
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
        return release_date;
    }

    public void setDuration(Date duration) {
        this.release_date = duration;
    }
    
    
    
}
