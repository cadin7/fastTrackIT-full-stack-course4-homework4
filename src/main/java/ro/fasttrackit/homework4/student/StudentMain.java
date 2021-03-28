package ro.fasttrackit.homework4.student;

import java.util.List;

import static java.time.LocalDate.of;
import static java.util.List.of;
import static java.util.stream.IntStream.range;

public class StudentMain {
    public static void main(String[] args) {
        Student bob = new Student("Bob", of(1994, 11, 7), 9);
        Student adam = new Student("Adam", 23, 6);
        Student tyler = new Student("Tyler", 23, 7);
        Student clare = new Student("Clare", 19, 10);
        Student david = new Student("David", 29, 10);
        Student anna = new Student("Anna", 17, 10);

        printStudents(bob);
        printStudents(adam);

        StudentService studentService = new StudentService(
                of(bob, adam, tyler, clare, david, anna));

        System.out.println(studentService.getStudentsAvgGrade());

        List<Course> courses = of(
                new Course("Math 101", 2),
                new Course("FullStack 279", 12),
                new Course("Chemistry 56", 1)
        );

        System.out.println(studentService.getStudentCourse(
                new CourseService(courses).getRandomCourse()));

        range(0, studentService.getStudentList().size())
                .forEach(index -> System.out.println(
                        StudentGradeHelper.dispatch(
                                index,
                                studentService.getStudentList().get(index))));
    }

    private static void printStudents(Student student) {
        System.out.println(student);
        System.out.println(student.getAge());
    }
}