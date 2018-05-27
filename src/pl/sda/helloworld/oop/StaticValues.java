package pl.sda.helloworld.oop;

public class StaticValues {

    public static void main(String[] args) {
        InstanceCounter[] arr = new InstanceCounter[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = new InstanceCounter();
        }
        System.out.println("Created " + InstanceCounter.counter + " instances");

        for (InstanceCounter instanceCounter : arr) {
            System.out.println(instanceCounter);
        }
    }

    static class InstanceCounter {

        static int counter;

        public InstanceCounter() {
            counter++;
            System.out.println("Instances created: " + counter);
        }

        @Override
        public String toString() {
            return "InstanceCounter{" +
                    "counter=" + counter +
                    '}';
        }
    }
}
