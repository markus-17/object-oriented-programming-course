public class Box {
    private double width;
    private double height;
    private double depth;

    public Box() {
        this.height = 1.0;
        this.width = 1.0;
        this.depth = 1.0;
    }
    
    public Box(double value) {
        if(value < 0) {
            throw new IllegalArgumentException("value cannot be negative");
        }

        this.height = value;
        this.width = value;
        this.depth = value;
    }
    
    public Box(double width, double height, double depth) {
        if(width < 0 || height < 0 || depth < 0) {
            throw new IllegalArgumentException("The measures of the box cannot be negative");
        }

        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getHeight() { return this.height; }
    public double getWidth() { return this.width; }
    public double getDepth() { return this.depth;  }
    
    public void setHeight(double height) { 
        if(height < 0) {
            throw new IllegalArgumentException("The height cannot have a negative value");
        }

        this.height = height;
    }

    public void setWidth(double width) { 
        if(width < 0) {
            throw new IllegalArgumentException("The width cannot have a negative value");
        }

        this.width = width;
    }

    public void setDepth(double depth) { 
        if(depth < 0) {
            throw new IllegalArgumentException("The depth cannot have a negative value");
        }

        this.depth = depth;
    }

    // Advanced Level (mark 9 || 10)
    public double getVolume() {
        return this.width * this.height * this.depth;
    }

    // Advanced Level (mark 9 || 10)
    public double getSurfaceArea() {
        return ( this.width * this.height + this.depth * this.width + this.height * this.depth ) * 2;
    }

    @Override
    public String toString() {
        return String.format("Box object with width=%.2f, height=%.2f and depth=%.2f", this.width, this.height, this.depth);
    }

    public static void main(String[] args) {
        // Basic Level (mark 5 || 6)
        Box box1 = new Box();
        Box box2 = new Box(3);
        Box box3 = new Box(2, 3, 4);

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        // Advanced Level (mark 9 || 10)
        System.out.println("The 3rd box has value = " + box3.getVolume());
        System.out.println("The 3rd box has surfaceArea = " + box3.getSurfaceArea());
    }
}
