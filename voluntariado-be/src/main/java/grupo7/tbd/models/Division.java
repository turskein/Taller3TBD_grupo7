package grupo7.tbd.models;

import org.springframework.data.annotation.Id;

public class Division {
    @Id
    private String id;
    private String type;
    private properties properties;
    private geometry geometry;

    public Division(String id, String type, grupo7.tbd.models.properties properties,
            grupo7.tbd.models.geometry geometry) {
        this.id = id;
        this.type = type;
        this.properties = properties;
        this.geometry = geometry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public properties getProperties() {
        return properties;
    }

    public void setProperties(properties properties) {
        this.properties = properties;
    }

    public geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(geometry geometry) {
        this.geometry = geometry;
    }
    
    
}
