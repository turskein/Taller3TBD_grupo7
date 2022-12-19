package grupo7.tbd.models;

public class Ranking {
    private String nombre;
    private int posicion;

    public Ranking(String nombre, int posicion) {
        super();
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
