package pl.sda.helloworld;


public class Objects {

    public static void main(String[] args) {
        Car car1 = new Car("red", 5, true, 6, new Engine(1.9f, 200), 'D', "VW Passat");
        Car car2 = new Car("red", 5, true, 6, new Engine(1.9f, 200), 'D', "VW Passat");

        Engine engine = new Engine(1.8f, 250);
        Car car3 = new Car("green", 5, true, 6, engine, 'D', "VW Passat");
        Car car4 = new Car("black", 3, true, 6, engine, 'D', "Cinquecento"); // tokio drift

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));
//        System.out.println(engine.toString());
//        System.out.println(car2);
//        System.out.println(car3);
    }

    static class Engine {
        float capacity;
        int horsePower;

        public Engine(float capacity, int horsePower) {
            this.capacity = capacity;
            this.horsePower = horsePower;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Engine engine = (Engine) o;

            if (Float.compare(engine.capacity, capacity) != 0) return false;
            return horsePower == engine.horsePower;
        }

        @Override
        public int hashCode() {
            int result = (capacity != +0.0f ? Float.floatToIntBits(capacity) : 0);
            result = 31 * result + horsePower;
            return result;
        }
    }

    static class Car {
        String color;
        int doors;
        boolean hasAC;
        int gearsCount;

        Engine engine;
        char segment;
        String makeAndModel;

        public Car(String color, int doors, boolean hasAC, int gearsCount, Engine engine, char segment, String makeAndModel) {
            this.color = color;
            this.doors = doors;
            this.hasAC = hasAC;
            this.gearsCount = gearsCount;
            this.engine = engine;
            this.segment = segment;
            this.makeAndModel = makeAndModel;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "color='" + color + '\'' +
                    ", doors=" + doors +
                    ", hasAC=" + hasAC +
                    ", gearsCount=" + gearsCount +
                    ", engine=" + engine +
                    ", segment=" + segment +
                    ", makeAndModel='" + makeAndModel + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Car car = (Car) o;

            if (doors != car.doors) return false;
            if (hasAC != car.hasAC) return false;
            if (gearsCount != car.gearsCount) return false;
            if (segment != car.segment) return false;
            if (color != null ? !color.equals(car.color) : car.color != null) return false;
            if (engine != null ? !engine.equals(car.engine) : car.engine != null) return false;
            return makeAndModel != null ? makeAndModel.equals(car.makeAndModel) : car.makeAndModel == null;
        }

        @Override
        public int hashCode() {
            int result = color != null ? color.hashCode() : 0;
            result = 31 * result + doors;
            result = 31 * result + (hasAC ? 1 : 0);
            result = 31 * result + gearsCount;
            result = 31 * result + (engine != null ? engine.hashCode() : 0);
            result = 31 * result + (int) segment;
            result = 31 * result + (makeAndModel != null ? makeAndModel.hashCode() : 0);
            return result;
        }
    }
}
