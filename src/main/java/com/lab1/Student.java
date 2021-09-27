class Student {
    public String name;
    public int age;
    public double finalMark;

    public Student(String name, int age, double finalMark) {
        this.name = name;
        this.age = age;
        this.finalMark = finalMark;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
