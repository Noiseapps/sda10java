package pl.sda.helloworld.io;

import javax.smartcardio.Card;

public class StringFormat {

    public static void main(String[] args) {


        // %s - String / char
        // %d - int/ long / short / byte/
        // %f - float / double

        StringFormat stringFormat = new StringFormat();
        String blah = String.format("Dla tablicy : %h, %d", stringFormat, stringFormat.hashCode());
        System.out.println(blah);

        System.out.printf("Cześć, %s", "blah");
    }
}
