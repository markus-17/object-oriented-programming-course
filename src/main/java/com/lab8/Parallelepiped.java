public class Parallelepiped implements GeometricBody {
    private double width;
    private double height;
    private double depth;
    
    public Parallelepiped(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getSurface() {
        return ( this.width * this.height + this.width * this.depth + this.height * this.depth ) * 2;
    }
    
    @Override 
    public double getVolume() {
        return this.width * this.depth * this.height;
    }

    @Override
    public String toString() {
        return "Parallelepiped { width: " + this.width +
                ", height: " + this.height +
                ", depth: " + this.depth +
                ", surface: " + this.getSurface() +
                ", volume: " + this.getVolume() + 
                " }";
    }
}
