package Task3;

import java.time.LocalDateTime;
import java.time.Month;

public class SimpleDateTime {

    static void ageCount(LocalDateTime myBrthd){
        LocalDateTime todayDate = LocalDateTime.now();

        System.out.println(myBrthd);
        int years = todayDate.getYear() - myBrthd.getYear();
        int months = todayDate.getMonthValue() - myBrthd.getMonthValue();
        int days = todayDate.getDayOfMonth() - myBrthd.getDayOfMonth();
        int hours = todayDate.getHour() - myBrthd.getHour();
        int minutes = todayDate.getMinute() - myBrthd.getMinute();
        int seconds = todayDate.getSecond() - myBrthd.getSecond();
        System.out.println("I was born " + years+ " years, "+ months+ " months, "+ days+ " days, "
                + hours+" hours, "+ minutes+" minutes, "+seconds+" seconds ago");


    }

    public static void main(String[] args) {


        LocalDateTime myBrthd = LocalDateTime.of(1980,1,14,0,5);
        System.out.println();
        ageCount(myBrthd);


    }
}
