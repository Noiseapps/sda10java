package pl.sda.helloworld.oop;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    enum Items {
        ROCK("r"), SCISSORS("s"), PAPER("p");

        static {
            ROCK.beats = SCISSORS;
            SCISSORS.beats = PAPER;
            PAPER.beats = ROCK;
        }

        Items beats;
        String key;

        Items(String key) {
            this.key = key;
        }

        static Items valueFor(String key) {
            for (Items items : values()) {
                if(items.key.equalsIgnoreCase(key)) return items;
            }
            return null;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int personScore = 0; int cpuScore = 0;
        int counter = 1;
        while(personScore < 3 && cpuScore < 3) {
            Items[] values = Items.values();
            int index = random.nextInt(values.length);
            Items randomItem = values[index];

            System.out.println("Runda " + counter++ + ": Wybierz swój element: ");
            String s = scanner.nextLine();
            Items userPicked = Items.valueFor(s);
            if(userPicked == null) continue;

            if(userPicked.beats == randomItem) {
                personScore++;
            } else if(randomItem.beats == userPicked) {
                cpuScore++;
            }
            System.out.printf("Wybrałeś %s, cpu wybrał %s. Wynik %d do %d\n", userPicked, randomItem, personScore, cpuScore);
        }
        if(personScore > cpuScore) {
            System.out.println("Gratulacje, wygrałeś");
        } else {
            System.out.println("Niestety... przegrałeś");
        }


    }
}
