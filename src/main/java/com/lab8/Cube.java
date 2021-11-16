public class Cube implements GeometricBody {
    private double width;
    
    public Cube(double width) {
        this.width = width;
    }

    @Override
    public double getSurface() {
        return this.width * this.width * 6;
    }
    
    @Override 
    public double getVolume() {
        return this.width * this.width * this.width;
    }

    @Override
    public String toString() {
        return "Cube { width: " + this.width + 
                ", surface: " + this.getSurface() +
                ", volume: " + this.getVolume() + 
                " }";
    }
}
