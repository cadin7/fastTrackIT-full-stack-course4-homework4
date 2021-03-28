package ro.fasttrackit.homework4.student;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.joining;

public class StudentEventDispatcher {
    private final Map<Predicate<Integer>, Function<Student, String>> studentHelper = new HashMap<>();

    public StudentEventDispatcher() {
        studentHelper.put(index -> index < 3, student -> graduation(student, "1st grade"));
        studentHelper.put(index -> index == 3, student -> graduation(student, "5th grade"));
        studentHelper.put(index -> index > 3, student -> graduation(student, "7th grade"));
    }

    private String graduation(Student student, String gradeCategory) {
        return student.name() + ": " + gradeCategory;
    }

    public String dispatch(int index, Student student) {
        return studentHelper.entrySet()
                .stream()
                .filter(entry -> entry.getKey().test(index))
                .map(entry -> entry.getValue().apply(student))
                .collect(joining(lineSeparator()));
    }
}
