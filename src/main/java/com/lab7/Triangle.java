import java.lang.Math;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + this.c;
    }

    @Override 
    public double getArea() {
        double s = this.getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "Triangle { a: " + this.a + ", b: " + this.b + ", c: " + this.c + " }";
    }
}
