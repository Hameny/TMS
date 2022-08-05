package by.tms.java.lesson18.time_api;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Date {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2020,06,25);
        long daysBetweenNowAndSpecificDate = ChronoUnit.DAYS.between(specificDate, localDate);

        StringBuilder daysBetween = new StringBuilder();
        daysBetween.append("Between ").append(localDate).append(" and ").append(specificDate).append(" = ")
                .append(daysBetweenNowAndSpecificDate).append(" days.");
        System.out.println(daysBetween);


        long secondBetweenNowAndSpecificDate =
                Duration.between(specificDate.atStartOfDay(), localDate.atStartOfDay()).toSeconds();
        StringBuilder secondBetween = new StringBuilder();
        secondBetween.append("Between ").append(localDate).append(" and ").append(specificDate).append(" = ")
                .append(secondBetweenNowAndSpecificDate).append(" seconds.");
        System.out.println(secondBetween);
    }
}
