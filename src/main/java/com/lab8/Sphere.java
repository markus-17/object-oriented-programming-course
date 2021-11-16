import java.lang.Math;

public class Sphere implements GeometricBody {
    private double radius;
    
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4 * Math.PI * this.radius * this.radius;
    }
    
    @Override 
    public double getVolume() {
        return 4 * Math.PI * this.radius * this.radius * this.radius / 3;
    }

    @Override
    public String toString() {
        return "Sphere { radius: " + this.radius + 
                ", surface: " + this.getSurface() +
                ", volume: " + this.getVolume() + 
                " }";
    }
}
