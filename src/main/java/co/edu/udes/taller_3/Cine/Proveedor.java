
package co.edu.udes.taller_3.Cine;

class Proveedor {
    private String name;
    private Recibo_Comida food_received;
    private String movie_rights;

    public Proveedor() {
    }

    public Proveedor(String name, Recibo_Comida recivo_comida, String derechos_peliculas) {
        this.name = name;
        this.food_received = recivo_comida;
        this.movie_rights = derechos_peliculas;
    }

    public Proveedor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Recibo_Comida getRecivo_comida() {
        return food_received;
    }

    public void setRecivo_comida(Recibo_Comida recivo_comida) {
        this.food_received = recivo_comida;
    }

    public String getDerechos_peliculas() {
        return movie_rights;
    }

    public void setDerechos_peliculas(String derechos_peliculas) {
        this.movie_rights = derechos_peliculas;
    }
    
    
    
}
