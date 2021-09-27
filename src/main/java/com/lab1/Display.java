class Display {
    public String color;
    public String diagonal;
    public String resolution;

    public Display(String color, String diagonal, String resolution) {
        this.color = color;
        this.diagonal = diagonal;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return  "{ color=" + this.color + 
                ", diagonal=" + this.diagonal +
                ", resolution=" + this.resolution + " }";
    }
}
