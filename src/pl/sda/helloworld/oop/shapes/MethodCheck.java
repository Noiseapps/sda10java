package pl.sda.helloworld.oop.shapes;

public class MethodCheck {

    int value;

    public MethodCheck(int value) {
        this.value = value;
    }

    void test() {
        System.out.println(this.value);
        System.out.println(this.getValue());
    }

    public static void main(String[] args) {
        new MethodCheck(10).test();
    }

    public final int getValue() {
        return value;
    }
}
