package task.two;

public class Square implements Shape{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Area of square: " + area();
    }
}
