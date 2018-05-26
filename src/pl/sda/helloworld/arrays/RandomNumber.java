package pl.sda.helloworld.arrays;

import java.util.Arrays;
import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        Random r = new Random();

        int N = 10;
        double[] items = new double[N];

        for (int i = 0; i < N; i++) {
            items[i] = r.nextDouble() * N;
        }

//        for (double item : items) {
//            System.out.print(item + ", ");
//        }
//        System.out.println();
        System.out.println(Arrays.deepToString(new double[][] {items}));
    }
}
