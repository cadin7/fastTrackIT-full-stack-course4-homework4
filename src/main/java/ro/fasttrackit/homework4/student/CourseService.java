package ro.fasttrackit.homework4.student;

import java.util.List;

import static java.lang.Math.random;

public record CourseService(List<Course> courses) {
    public static String getCourseTextBox(Course course) {
        return """
                {
                    "course":"%s",
                    "semester":%d
                }
                """.formatted(course.course(), course.semester());
    }

    public Course getRandomCourse() {
        return courses.get((int) (random() * courses.size()));
    }
}
