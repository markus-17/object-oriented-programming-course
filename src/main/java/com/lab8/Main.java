import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Basic Level (mark 5 || 6)
        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();
        geometricBodies.add(new Cube(4));
        geometricBodies.add(new Sphere(3));
        geometricBodies.add(new Parallelepiped(3, 4, 5));

        // Medium Level (mark 7 || 8)
        System.out.println(GeometricBodyController.getBiggestSurfaceBody(geometricBodies));
        System.out.println(GeometricBodyController.getBiggestVolumeBody(geometricBodies));

        // Advance Level (mark 9 || 10)
        // Well, for this I had to change the abstract GeometricBody class from a class to an interface
        // and I did it.
        // The only thing I had to do in order to fix the errors was to ... implements interface
        // instead of ... extends AbastractClass
    }
}