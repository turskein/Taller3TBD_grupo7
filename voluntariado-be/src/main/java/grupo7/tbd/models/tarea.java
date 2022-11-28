package grupo7.tbd.models;

import org.springframework.data.annotation.Id;
import grupo7.tbd.models.Ranking;


public class Tarea {
    @Id
    private String id;
    private String nombre;
    private String[] habilidad;
    private String estado_tarea;
    private Ranking[] rankings;

    

    public Tarea(String id, String nombre, String[] habilidad, String estado_tarea, Ranking[] rankings) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.habilidad = habilidad;
        this.estado_tarea = estado_tarea;
        this.rankings = rankings;
    }

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

    public String getEstado_tarea() {
        return estado_tarea;
    }

    public void setEstado_tarea(String estado_tarea) {
        this.estado_tarea = estado_tarea;
    }

    public Ranking[] getRankings() {
        return rankings;
    }

    public void setRankings(Ranking[] rankings) {
        this.rankings = rankings;
    }
}
