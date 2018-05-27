package pl.sda.helloworld.oop.shapes;

public class Square extends Rectangle {

    Square(double a) {
        super(a, a);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
