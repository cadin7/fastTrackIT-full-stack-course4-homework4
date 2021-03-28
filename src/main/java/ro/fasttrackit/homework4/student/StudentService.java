package ro.fasttrackit.homework4.student;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;
import static java.lang.String.join;
import static java.lang.System.lineSeparator;
import static java.util.stream.Collectors.*;
import static ro.fasttrackit.homework4.student.CourseService.getCourseTextBox;

public class StudentService {
    private final List<Student> studentList;

    public StudentService(List<Student> studentList) {
        this.studentList = new ArrayList<>(studentList);
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getStudentsAvgGrade() {
        return studentList.stream()
                .collect(teeing(
                        mapping(Student::name, toList()),
                        averagingDouble(Student::grade),
                        (names, avgGrade) -> join(", ", names) +
                                " have an average grade of: " +
                                format("%.2f", avgGrade)));
    }

    public String getStudentCourse(Course course) {
        return studentList.stream()
                .map(student -> generateParticipationTextBlock(student, course))
                .collect(joining(lineSeparator()));
    }

    private String generateParticipationTextBlock(Student student, Course course) {
        return student.name() + " will participate to course " + getCourseTextBox(course);
    }
}
