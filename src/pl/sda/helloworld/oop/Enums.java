package pl.sda.helloworld.oop;

public class Enums {

    public static void main(String[] args) {
        doSth(Directions.NORTH);

//        final String s = "asdf";
//        s = "2103971";
//        String s1 = "asd";
//        s1 = "asld";

    }

    public static void doSth(Directions d) {
        switch (d) {
            case NORTH:
                break;
            case SOUTH:
                break;
            case WEST:
                break;
            case EAST:
                break;
        }
    }

    enum Directions {
        NORTH("N"), SOUTH("S"), WEST("W"), EAST("E");

        final String value;
        Directions(String value) {
            this.value = value;
        }
    }
}
