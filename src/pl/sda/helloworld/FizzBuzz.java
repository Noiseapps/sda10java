package pl.sda.helloworld;

public class FizzBuzz {

    public static void main(String[] args) {
        long t1 = fizzBuzz1();
        long t2 = fizzBuzz2();
        System.out.println("T1: " + t1 + " T2: " + t2);
    }

    private static long fizzBuzz1() {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            StringBuilder sb = new StringBuilder();
            if(i % 3 == 0) { sb.append("Fizz"); }
            if(i % 5 == 0) { sb.append("Buzz"); }
            if(sb.length() == 0) { sb.append(i); }
            System.out.println(sb.toString());
        }

        long time = System.currentTimeMillis() - start;
//        System.out.println("FB1 Executed in : " + time);
        return time;
    }

    private static long fizzBuzz2() {
        long start = System.currentTimeMillis();

        for (int i = 1; i < 1000000; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
        long time = System.currentTimeMillis() - start;
//        System.out.println("FB1 Executed in : " + time);
        return time;
    }


}
