package by.itacademy.lessson5.task2;

import java.util.Date;

public class Student implements GetDate {
    private String name;
    private String surname;
    private Date birthDate;

    Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public Date getDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                " surname='" + surname + '\'' +
                " birthDate=" + birthDate +
                '}';
    }
}
