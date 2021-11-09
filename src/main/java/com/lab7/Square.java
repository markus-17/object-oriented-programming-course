public class Square extends Figure {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.width;
    }

    @Override
    public double getPerimeter() {
        return this.width * 4;
    }

    @Override
    public String toString() {
        return "Square { width: " + this.width + " }";
    }
}