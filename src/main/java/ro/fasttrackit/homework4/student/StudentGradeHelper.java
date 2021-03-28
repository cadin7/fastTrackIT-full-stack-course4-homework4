package ro.fasttrackit.homework4.student;

public class StudentGradeHelper {
    private static String graduation(Student student, String gradeCategory) {
        return student.name() + ": " + gradeCategory;
    }

    public static String dispatch(int index, Student student) {
        return switch (index) {
            case 0, 1, 2 -> graduation(student, "1st grade");
            case 3 -> graduation(student, "5th grade");
            default -> graduation(student, "7th grade");
        };
    }
}
