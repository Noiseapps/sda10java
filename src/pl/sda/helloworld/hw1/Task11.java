package pl.sda.helloworld.hw1;

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 22, 14, 51, 26, 457, 12, 85};

        Arrays.sort(items);

        int[][] sequences = new int[items.length][];

        int length = 1;
        int lastValue = items[0];
        int startIndex = 0;
        for (int i = 1; i < items.length; i++) {
            int item = items[i];
            if (item == lastValue + 1) {
                lastValue = item;
                length++;
            } else {
                sequences[i] = new int[length];
                int counter = 0;
                for (int j = startIndex; j < i; j++) {
                    sequences[i][counter++] = items[j];
                }
                lastValue = items[i];
                length = 1;
                startIndex = i;
            }
        }

        System.out.println(Arrays.deepToString(sequences));

        int longestArrayIndex = 0;
        int longestArrayLength = 0;
        for (int i = 0; i < sequences.length; i++) {
            if (sequences[i] != null && sequences[i].length > longestArrayLength) {
                longestArrayLength = sequences[i].length;
                longestArrayIndex = i;
            }
        }

        System.out.println("Najdłuższy ciąg: " + Arrays.deepToString(new int[][]{sequences[longestArrayIndex]}));
    }
}
