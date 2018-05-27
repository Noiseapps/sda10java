package pl.sda.helloworld.notepad;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final Note[] notes = new Note[10];

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    private void start() {
        while (true) {

        }
    }

    private void addNote(Note note) {
        int index = canAddNote();
        if (index < 0) {
            System.out.println("Brak miejsca");
        } else {
            notes[index] = note;
        }
    }

    private void deleteNote(Note note) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i].equals(note)) {
                notes[i] = null;
            }
        }
    }

    private int canAddNote() {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == null) {
                return i;
            }
        }
        return -1;
    }

    private String readLine(String message) {
        while (true) {
            try {
                System.out.println(message);
                return scanner.nextLine();
            } catch (InputMismatchException ex) {
                System.out.println("Podana wartość jest niepoprawna.");
            }
        }
    }
}
