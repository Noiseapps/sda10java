package pl.sda.helloworld.oop.shapes;

public abstract class Shape {

    abstract double area();

    abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                " area: " + area() +
                " perimeter: " + perimeter() +
                "}";
    }
}
