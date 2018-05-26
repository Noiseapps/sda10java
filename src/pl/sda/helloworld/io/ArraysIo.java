package pl.sda.helloworld.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraysIo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int elements;

        // prosimy użytkownika o podanie liczby elementów, dopóki nie poda liczby większej niż 0
        do {
            elements = readInt("Podaj liczbę elementów");
        } while (elements <= 0);

        int[] array = new int[elements];
        for (int i = 0; i < array.length; i++) {
            array[i] = readInt("Podaj liczbę # :" + (i+1));
        }

        System.out.println(sum(array));
        System.out.println(avg(array));
        System.out.println(max(array));
        System.out.println(min(array));
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    static double avg(int[] array) {
        int sum = sum(array);
        return sum / (double) array.length;
    }

    static int max(int[] array){
        int max = 0;
        for (int i : array) {
            if(i > max) {
                max = i;
            }
        }
        return max;
    }

    static int min(int[] array){
        int max = Integer.MAX_VALUE;
        for (int i : array) {
            if(i < max) {
                max = i;
            }
        }
        return max;
    }



    static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Podana wartość jest niepoprawna.");
                scanner.nextLine();
            }
        }
    }
}
