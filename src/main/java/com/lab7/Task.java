import java.lang.Math;
import java.util.ArrayList;

public class Task {
    public static void main(String[] args) {
        // Basic Level (mark 5 || 6)
        ArrayList<Figure> figures = new ArrayList<Figure>();
        figures.add(new Square(4));
        figures.add(new Rectangle(2, 8));
        figures.add(new Triangle(3, 4, 5));

        // Medium Level (mark 7 || 8)
        System.out.println(FigureController.getBiggestAreaFigure(figures));
        System.out.println(FigureController.getBiggestPerimeterFigure(figures));

        // Advanced Level (mark 9 || 10
        Figure circle = new Figure() {
            private double radius = 5;

            @Override
            public double getArea() {
                return Math.PI * this.radius * this.radius;
            }

            @Override 
            public double getPerimeter() {
                return 2 * Math.PI * this.radius;
            }

            @Override
            public String toString() {
                return "Circle { radius: " + radius + " }";
            }
        };

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        figures.add(circle);
        System.out.println(FigureController.getBiggestAreaFigure(figures));
    }
}
