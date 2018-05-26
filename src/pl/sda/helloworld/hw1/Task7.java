package pl.sda.helloworld.hw1;

public class Task7 {

    String[] letters = {"A", "B"};

    public static void main(String[] args) {
        char firstLetter = 'A';
        for (int i = 0; i < 120; i++) {
            System.out.println(firstLetter++);
        }




//        System.out.println(getRep("SDAcademy"));
//        System.out.println(getRep("FizzBuzz"));
//        System.out.println(getRep(null));
    }

    static String getRep(String word) {
        if(word != null && word.length() % 2 == 0) {
            return word.substring(0, word.length() / 2);
        } else {
            return null;
        }
    }
}
