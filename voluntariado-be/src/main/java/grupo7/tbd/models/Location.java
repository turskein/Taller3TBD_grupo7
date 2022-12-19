package grupo7.tbd.models;

public class Location {
    private String type;
    private double coordinates[];
    
    public Location(String type, double[] coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }

    public String getType() {
        return type;
    }
    public double[] getCoordinates() {
        return coordinates;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    
}
