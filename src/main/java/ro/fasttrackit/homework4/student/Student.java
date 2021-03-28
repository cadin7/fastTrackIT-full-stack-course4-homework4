package ro.fasttrackit.homework4.student;

import java.time.LocalDate;

import static java.lang.Math.random;
import static java.time.LocalDate.now;
import static java.time.LocalDate.ofYearDay;
import static java.time.Period.between;

public record Student(String name, LocalDate birthDate, int grade) {
    public Student(String name, int age, int grade) {
        this(name, getRandomBirthDate(age), grade);
    }

    private static LocalDate getRandomBirthDate(int age) {
        LocalDate tempDate = now().minusYears(age);
        int day = 1 + (int) (random() * tempDate.getDayOfYear());
        return ofYearDay(tempDate.getYear(), day);
    }

    public int getAge() {
        return between(this.birthDate, now()).getYears();
    }

}
