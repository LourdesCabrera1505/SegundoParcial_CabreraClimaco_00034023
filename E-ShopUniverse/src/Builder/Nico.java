package Builder;

public class Nico {
    private String username;
    private String nombre_empresa;

    public  Nico() {


    }

    public Nico(String username, String nombre_empresa) {
        this.username = username;
        this.nombre_empresa = nombre_empresa;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }
}
