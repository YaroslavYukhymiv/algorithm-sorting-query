package task.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskTwo {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Square(4));
        shapes.add(new Rectangle(5, 8));
        shapes.add(new Circle(6));
        shapes.add(new Triangle(2, 3));

        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape shapeOne, Shape shapeTwo) {
                return Double.compare(shapeOne.area(), shapeTwo.area());
            }
        });

        System.out.println(shapes);
    }
}
