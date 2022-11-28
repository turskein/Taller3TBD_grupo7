package grupo7.tbd.models;

import org.springframework.data.annotation.Id;

public class voluntario {
    @Id
    private String id;
    private String nombre;
    private String[] habilidad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
