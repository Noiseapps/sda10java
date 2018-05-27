package pl.sda.helloworld.oop.shapes;

public class Triangle extends Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {

        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    double perimeter() {
        return base + height + (Math.sqrt(base * base + height * height));
    }
}
