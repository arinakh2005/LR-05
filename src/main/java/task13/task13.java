package task13;
import java.util.Scanner;
import static java.lang.System.exit;
import static java.lang.System.out;

public class task13 {
    public static final int MENU_ITEMS = 3;

    public static void main(String[] args) {
        out.println("\nTask 13");
        Scanner scanner = new Scanner(System.in);
        Square square = new Square();
        int chosenMenuItem;
        double side;

        do {
            chosenMenuItem = showMenu();
            switch (chosenMenuItem) {
                case 1:
                    out.println("Please, enter the side:");
                    try {
                        side = scanner.nextDouble();
                        scanner.nextLine();
                    } catch (Exception e) {
                        out.println("Incorrect input!\n");
                        break;
                    }
                    square.setSide(side);
                    double area = square.calcArea();
                    out.println(square);
                    out.printf("Area = %.2f\n", area);
                    break;
                case 2:
                    out.println("Please, enter the side:");
                    try {
                        side = scanner.nextDouble();
                        scanner.nextLine();
                    } catch (Exception e) {
                        out.println("Incorrect input!\n");
                        break;
                    }
                    square.setSide(side);
                    double perimeter = square.calcPerimeter();
                    out.println(square);
                    out.printf("Perimeter = %.2f\t", perimeter);
                    break;
                case 3:
                    out.println("Program was successfully finished!\n");
                    exit(0);
                    break;
            }
        } while (chosenMenuItem != 0);
    }

    public static Integer showMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosenMenuItem = 0;

        do {
            out.println("\nMenu:");
            out.println("1. Calculate the area");
            out.println("2. Calculate the perimeter");
            out.println("3. Exit\n");
            out.print("Choose menu item (1-3): ");
            try {
                chosenMenuItem =  scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (chosenMenuItem < 0 || chosenMenuItem > MENU_ITEMS);

        return chosenMenuItem;
    }
}
