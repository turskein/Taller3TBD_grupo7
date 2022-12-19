package grupo7.tbd.models;

import org.springframework.data.annotation.Id;

public class Emergencia {
    @Id
    private String id;
    private String intitucion;
    private String nombre;
    private String[] habilidad;
    private Location location;

    public Emergencia(String id, String intitucion, String nombre, String[] habilidad, Location location) {
        super();
        this.id = id;
        this.intitucion = intitucion;
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntitucion() {
        return intitucion;
    }

    public void setIntitucion(String intitucion) {
        this.intitucion = intitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String[] habilidad) {
        this.habilidad = habilidad;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    
}
