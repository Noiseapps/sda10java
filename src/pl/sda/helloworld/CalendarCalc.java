package pl.sda.helloworld;

import java.util.Calendar;

public class CalendarCalc {
    public static void main(String[] args) throws InterruptedException {
        while(true) {
            Calendar calendar = Calendar.getInstance();
            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
            int minute = calendar.get(Calendar.MINUTE);
            int hour = calendar.get(Calendar.HOUR_OF_DAY);
            int monthOfYear = calendar.get(Calendar.MONTH) + 1;
            int year = calendar.get(Calendar.YEAR);
            int seconds = calendar.get(Calendar.SECOND);

            String timeOfDay;
            if (hour < 6) {
                timeOfDay = "noc";
            } else if (hour < 10) {
                timeOfDay = "rano";
            } else if (hour < 12) {
                timeOfDay = "przedpołudnie";
            } else if (hour < 16) {
                timeOfDay = "popołudnie";
            } else if (hour < 20) {
                timeOfDay = "późne popołudnie";
            } else {
                timeOfDay = "wieczór";
            }
//            System.out.println(timeOfDay);

            int century = (int) Math.ceil(year / 100.0);

            float minutesFromMidnight = (hour * 60 + minute);
            float percentFromMidnight = (minutesFromMidnight * 100) / (24 * 60);
            int secondsTillMidnight = (24 * 60 * 60) - ((hour * 60 * 60) + (minute * 60) + seconds);

            System.out.println(hour + ":" + minute + ":" + seconds + " " + dayOfMonth + "/" + monthOfYear + "/" + year);
            Thread.sleep(1000);
//            System.out.println("Od północy mineło " + minutesFromMidnight + " minut");
//            System.out.println(percentFromMidnight); //zmienić to na procent z dwoma miejscami po przecinku
//            System.out.println("Do końca doby zostało " + secondsTillMidnight + " sekund");
        }
    }
}