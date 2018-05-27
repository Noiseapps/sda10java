package pl.sda.helloworld.oop;

import java.util.Random;

public class OOPMain {

    public static void main(String[] args) {
        new Car(new Engine()).drive();
        new Car(new RacingEngine()).drive();
        new Car(new TruckEngine(false)).drive();


        System.out.println("--------");

        Engine engine = getEngine();
        if(engine instanceof TruckEngine) {
            System.out.println(((TruckEngine) engine).doTruckyThing());
        }
        System.out.println(engine.engineSound());
        System.out.println(engine.toString());
    }

    public static Engine getEngine() {
        if(new Random().nextInt() % 3 == 0) {
            return new RacingEngine();
        } else if (new Random().nextInt() % 3 == 1){
            return new TruckEngine(false);
        } else {
            return new Engine();
        }
    }
}
