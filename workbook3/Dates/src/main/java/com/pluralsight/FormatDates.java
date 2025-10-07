package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatDates {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy\n" +
                "yyyy/MM/dd\n" + "MMMM d, yyyy\n" + "EEEE, MMM d, yyyy HH:mm");
        String formattedDate = dateTime.format(formatter);
        System.out.println(formattedDate);

    }
}