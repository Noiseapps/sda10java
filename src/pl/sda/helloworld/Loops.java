package pl.sda.helloworld;

public class Loops {

    public static void main(String[] args) {
//        returnTest();
//        System.out.println("--------------");
//        breakTest();
//        System.out.println("--------------");
//        continueTest();




    }

    static void returnTest() {
        for (int i = 0; i < 30; i++) {
            System.out.println("It's me, " + i);
            if (i > 0 && i % 5 == 0) {
                return;
            }
        }
        System.out.println("never gonna give you up");
    }

    static void breakTest() {
        for (int i = 0; i < 30; i++) {
            System.out.println("It's me, " + i);
            if (i > 0 && i % 5 == 0) {
                break;
            }
        }
        System.out.println("never gonna give you up");
    }

    static void continueTest() {
        for (int i = 0; i < 30; i++) {
            if (i > 0 && i % 5 == 0) {
                continue;
            }
            System.out.println("It's me, " + i);
        }
        System.out.println("never gonna give you up");
    }
}
