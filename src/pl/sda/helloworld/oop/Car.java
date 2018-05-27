package pl.sda.helloworld.oop;

public class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        System.out.println(engine.engineSound());
    }
}
