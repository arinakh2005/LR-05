import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static task28.task28.*;
import task28.Date;
import task28.Student;

class Task28Test {
    @Test
    void addStudentToList() {
        out.println("Test should add user to list");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kononenko Anton Mykolayovych", "LP-02", new Date(11, 10, 2000), 72.57F));
        students.add(new Student("Petrov Ivan Ivanovych", "LP-02", new Date(18, 10, 2000), 98.3F));
        students.add(new Student("Pliskun Maksym Olehovych", "LP-03", new Date(25, 3, 2000), 82.17F));

        out.println("Before adding student");
        showAllStudents(students);
        Student newStudent = new Student("Kyrpa Petro Ivanovych", "LP-02", new Date(15, 9, 2000), 84.7F);

        ArrayList<Student> actualList = addStudent(students, newStudent);
        out.println("After adding student");
        showAllStudents(actualList);

        assertTrue(actualList.contains(newStudent));
    }

    @Test
    void removeStudentFromList() {
        out.println("Test should remove user from list");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Kononenko Anton Mykolayovych", "LP-02", new Date(11, 10, 2000), 72.57F));
        students.add(new Student("Petrov Ivan Ivanovych", "LP-02", new Date(18, 10, 2000), 98.3F));
        students.add(new Student("Pliskun Maksym Olehovych", "LP-03", new Date(25, 3, 2000), 82.17F));

        out.println("Before removing student");
        showAllStudents(students);
        Student studentForRemoving = findStudentByID(5, students);

        ArrayList<Student> actualList = removeStudent(students, studentForRemoving);
        out.println("After removing student");
        showAllStudents(actualList);

        assertFalse(actualList.contains(studentForRemoving));
    }
}
