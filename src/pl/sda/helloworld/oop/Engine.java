package pl.sda.helloworld.oop;

public class Engine {

    private double horsePower;
    private double capacity;

    public Engine(double horsePower, double capacity) {
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    public Engine(double capacity) {
        this(capacity * 200, capacity);
    }

    public Engine() {
        this(1.8);
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String engineSound() {
        return "brum brum";
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", capacity=" + capacity +
                '}';
    }
}
