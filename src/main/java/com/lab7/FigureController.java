import java.util.ArrayList;

public final class FigureController {
    // If you wonder why I put this here.
    // Making an empty private constructor prevents instantiation
    // by client code as it makes no sense to instantiate a static class.
    // Okey, yes you might be thinking, but there is no static classes in java.
    // Java has no way of making a top-level class static but you can simulate a static class.
    // And I really hope you are actually reading this code Mr. Popa xD xD xD xD xD xD xD
    private FigureController() {}

    static Figure getBiggestAreaFigure(ArrayList<Figure> figures) {
        if(figures.size() == 0) {
            return null;
        }

        int biggestFigureId = 0;
        for(int i = 1; i < figures.size(); ++i) {
            if(figures.get(i).getArea() > figures.get(biggestFigureId).getArea()) {
                biggestFigureId = i;
            }
        }

        return figures.get(biggestFigureId);
    }

    static Figure getBiggestPerimeterFigure(ArrayList<Figure> figures) {
        if(figures.size() == 0) {
            return null;
        }

        int biggestFigureId = 0;
        for(int i = 1; i < figures.size(); ++i) {
            if(figures.get(i).getPerimeter() > figures.get(biggestFigureId).getPerimeter()) {
                biggestFigureId = i;
            }
        }

        return figures.get(biggestFigureId);
    }
}
