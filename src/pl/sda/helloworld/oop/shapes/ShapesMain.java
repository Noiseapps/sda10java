package pl.sda.helloworld.oop.shapes;

public class ShapesMain {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Circle(90),
                new Rectangle(1, 2),
                new Rectangle(20, 12),
                new Square(7)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString() + " area: " + shape.area() + ", perimeter: " + shape.perimeter());
        }

    }
}
