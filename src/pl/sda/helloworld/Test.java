package pl.sda.helloworld;

public class Test {


    public static double calculateDelta(double a, double b, double c) {
        double delta = (Math.pow(b, 2)) - 4 * a * c;
        System.out.println("Delta = " + delta);
        return delta;
    }

    public static void solveEquation(double a, double b, double c) {

        double delta = calculateDelta(a, b, c);

        if (delta < 0.0) {
            System.out.println("Równanie nie ma rozwiązania");
        } else if (delta == 0.0) {

            double x1 = -(b / (2 * a));

            System.out.println("Równanie ma jedno rozwiązanie");
            System.out.println("x1 = " + x1);
        } else {

            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);

            System.out.println("Równanie ma dwa rozwiązania");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }

    public static void main(String[] args) {
        solveEquation(-2, -8, 10);

        solveEquation(14, -8.3, 12);
    }
}
