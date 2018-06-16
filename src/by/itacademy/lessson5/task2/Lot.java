package by.itacademy.lessson5.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Lot implements Input, MiddleAge {
    private GetDate[] group;

    Lot(int size) {
        group = new Student[size];
    }

    public void input() throws ParseException {
        for (int i = 0; i < group.length; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Name:");
            String name = scan.nextLine();
            System.out.println("Surname:");
            String surname = scan.nextLine();
            System.out.println("Date dd-MM-yyyy:");
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            String dateInString = scan.nextLine();
            Date birthDate = format.parse(dateInString);
            group[i] = new Student(name, surname, birthDate);
        }
    }

    public void middleAge() {
        long sum = 0;
        for (int i = 0; i < group.length; i++) {
            sum += (group[i].getDate()).getTime();
        }
        Date averageDate = new Date(sum / group.length);
        LocalDateTime averageLocalDate = convertToLocalDateTime(averageDate);
        Age middleAge = getAge(averageLocalDate);
        System.out.println("Middle age: " + middleAge.toString());
    }

    private LocalDateTime convertToLocalDateTime(Date dateToConvert) {
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    private Age getAge(LocalDateTime birthDate) {
        LocalDateTime now = LocalDateTime.now();
        long years = ChronoUnit.YEARS.between(birthDate, now);
        now = now.minusYears(years);
        long month = ChronoUnit.MONTHS.between(birthDate, now);
        now = now.minusMonths(month);
        long days = ChronoUnit.DAYS.between(birthDate, now);
        now = now.minusDays(days);
        long hours = ChronoUnit.HOURS.between(birthDate, now);
        now = now.minusHours(hours);
        long minutes = ChronoUnit.MINUTES.between(birthDate, now);
        return new Age(years, month, days, hours, minutes);
    }
}
