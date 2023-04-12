
package co.edu.udes.taller_3.Cine;

class Cliente {
    private String name;
    private String id;
    private String phone_number;
    private boolean targeta_cine;
    private Recibo_Funcion receipt_function;
    private Recibo_Comida receipt_food;

    public Cliente() {
    }

    public Cliente(String name, String id, String phone_number, boolean premiun) {
        this.name = name;
        this.id = id;
        this.phone_number = phone_number;
        this.targeta_cine = premiun;
    }

    Cliente(String name, String id, String phone_number, boolean targeta_cine, Recibo_Funcion receipt_function) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isPremiun() {
        return targeta_cine;
    }

    public void setPremiun(boolean premiun) {
        this.targeta_cine = premiun;
    }
    
    
    
}
