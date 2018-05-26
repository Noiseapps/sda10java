package pl.sda.helloworld.io;

import java.util.Calendar;
import java.util.Scanner;

public class IO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cześć, podaj swoje imię: ");
        String name = scanner.nextLine();

        System.out.println("Cześć " + name);

        int day = scanner.nextInt();
        System.out.println("" + day);
    }
}
