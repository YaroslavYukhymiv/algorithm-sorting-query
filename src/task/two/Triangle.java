package task.two;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return ((base * height) / 2);
    }

    @Override
    public String toString() {
        return "Area of tringle: " + area();
    }
}
