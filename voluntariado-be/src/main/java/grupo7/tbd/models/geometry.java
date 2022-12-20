package grupo7.tbd.models;

import java.util.List;

public class geometry {
    private String type;
    private List<double[][][]> coordinates;
    
    public geometry(String type, List<double[][][]> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<double[][][]> getCoordinates() {
        return coordinates;
    }
    public void setCoordinates(List<double[][][]> coordinates) {
        this.coordinates = coordinates;
    }
}
