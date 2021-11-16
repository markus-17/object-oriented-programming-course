import java.util.ArrayList;

public final class GeometricBodyController {
    // If you wonder why I put this here.
    // Making an empty private constructor prevents instantiation
    // by client code as it makes no sense to instantiate a static class.
    // Okey, yes you might be thinking, but there is no static classes in java.
    // Java has no way of making a top-level class static but you can simulate a static class.
    // And I really hope you are actually reading this code Mr. Popa xD xD xD xD xD xD xD
    private GeometricBodyController() {}

    static GeometricBody getBiggestSurfaceBody(ArrayList<GeometricBody> figures) {
        if(figures.size() == 0) {
            return null;
        }

        int biggestFigureId = 0;
        for(int i = 1; i < figures.size(); ++i) {
            if(figures.get(i).getSurface() > figures.get(biggestFigureId).getSurface()) {
                biggestFigureId = i;
            }
        }

        return figures.get(biggestFigureId);
    }

    static GeometricBody getBiggestVolumeBody(ArrayList<GeometricBody> figures) {
        if(figures.size() == 0) {
            return null;
        }

        int biggestFigureId = 0;
        for(int i = 1; i < figures.size(); ++i) {
            if(figures.get(i).getVolume() > figures.get(biggestFigureId).getVolume()) {
                biggestFigureId = i;
            }
        }

        return figures.get(biggestFigureId);
    }
}
