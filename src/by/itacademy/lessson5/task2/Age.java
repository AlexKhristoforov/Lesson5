package by.itacademy.lessson5.task2;

public class Age {
    private long years;
    private long month;
    private long days;
    private long hours;
    private long minutes;

    public Age(long years, long month, long days, long hours, long minutes) {
        this.years = years;
        this.month = month;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "{" +
                years + " years, " +
                month + " month, " +
                +days + " days, "
                + hours + " hours, "
                + minutes + " minutes" +
                '}';
    }
}