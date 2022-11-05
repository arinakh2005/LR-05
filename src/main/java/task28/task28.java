package task28;
import java.util.*;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.lang.Thread.sleep;

public class task28 {
    public static final int MENU_ITEMS = 4;

    public static void main(String[] args) {
        out.println("\nTask 28");
        int chosenMenuItem;

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Pupkin Ivan Mykolayovych", "LT-01", new Date(10, 10, 2003), 92.57F));
        students.add(new Student("Antonov Anton Ivanovych", "LT-01", new Date(8, 1, 2002), 88.5F));
        students.add(new Student("Guk Taras Olehovych", "LT-01", new Date(15, 7, 2003), 72.7F));
        students.add(new Student("Gerasymenko Oleg Petrovych", "LT-01", new Date(21, 5, 2002), 96.7F));
        students.add(new Student("Zhuk Maksym Petrovych", "LT-01", new Date(19, 11, 2003), 87.23F));

        do {
            chosenMenuItem = showMenu();
            switch (chosenMenuItem) {
                case 1:
                    showAllStudents(students);
                    out.println("Please, press 'Enter' to continue...\n");
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine();
                    break;
                case 2:
                    addStudent(students, inputStudentInfo());
                    break;
                case 3:
                    Student studentForRemoving = findStudentByID(inputStudentID(), students);
                    if (studentForRemoving != null) removeStudent(students, studentForRemoving);
                    break;
                case 4:
                    out.println("Program was successfully finished!\n");
                    exit(0);
                    break;
            }
            clearConsole();
        } while (chosenMenuItem != 0);
    }

    public static Integer showMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosenMenuItem = 0;

        do {
            out.println("\nMenu:");
            out.println("1. Show all students");
            out.println("2. Add student");
            out.println("3. Remove student");
            out.println("4. Exit\n");
            out.print("Choose menu item (1-4): ");
            try {
                chosenMenuItem =  scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (chosenMenuItem < 0 || chosenMenuItem > MENU_ITEMS);

        return chosenMenuItem;
    }

    public static void showAllStudents(ArrayList<Student> students) {
        if (students.isEmpty()) {
            out.println("Empty student list!");
            return;
        }

        out.println("List of students: ");
        out.println("|-----------------------------------------------------------------------------|");
        System.out.format("|%4s |%30s |%6s | %15s | %12s|\n",
                "ID", "Fullname", "Group", "Date of Birth", "Average Mark");
        out.println("|-----------------------------------------------------------------------------|");

        for (Student student : students) {
            System.out.format("|%4s |%30s |%6s | %15s | %11s |\n",
                    student.getId(), student.getFullname(), student.getGroup(),
                    student.getDateOfBirth(), student.getAverageMark());
            out.println("|-----------------------------------------------------------------------------|");
        }
    }

    public static int inputStudentID() {
        Scanner scanner = new Scanner(System.in);
        out.println("Please, input student ID: ");
        int ID = scanner.nextInt();
        scanner.nextLine();

        return ID;
    }

    public static Student inputStudentInfo() {
        Scanner scanner = new Scanner(System.in);

        out.println("Please, input student fullname: ");
        String fullname = scanner.nextLine();

        out.println("Please, input student group: ");
        String group = scanner.nextLine();

        out.println("Please, input student dateOfBirth in format dd.MM.yyyy: ");
        String dateOfBirthStr = scanner.nextLine();
        Date dateOfBirth = new Date(dateOfBirthStr);

        out.println("Please, input student average mark: ");
        float averageMark = scanner.nextFloat();
        scanner.nextLine();

        return new Student(fullname, group, dateOfBirth, averageMark);
    }

    public static Student findStudentByID(int ID, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getId() == ID) {
                return student;
            }
        }

        out.println("Not found student with ID " + ID);
        return null;
    }

    public static ArrayList<Student> addStudent(ArrayList<Student> students, Student student) {
        students.add(student);
        out.println("Student was successfully added to list!");

        return students;
    }

    public static ArrayList<Student> removeStudent(ArrayList<Student> students, Student studentForRemoving) {
        for (Student student : students) {
            if (student.getId() == (studentForRemoving.getId())) {
                students.remove(student);
                out.printf("Student %s was successfully removed from list!\n", student.getFullname());
                break;
            }
        }
        return students;
    }

    public static void clearConsole() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; ++i) out.println();
    }
}
