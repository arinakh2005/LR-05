package task1;
import java.util.Scanner;
import static java.lang.System.exit;
import static java.lang.System.out;

public class task1 {
    public static final int MENU_ITEMS = 3;

    public static void main(String[] args) {
        out.println("\nTask 1");
        Scanner scanner = new Scanner(System.in);
        Hyperbola hyperbola = new Hyperbola();
        int chosenMenuItem;

        do {
            chosenMenuItem = showMenu();
            switch (chosenMenuItem) {
                case 1:
                    out.println("Please, enter y:");
                    float y;
                    try {
                        y = scanner.nextFloat();
                    } catch (Exception e) {
                        out.println("Incorrect input!\n");
                        break;
                    }
                    hyperbola.setY(y);
                    hyperbola.calcXByY();
                    out.println(hyperbola);
                    break;
                case 2:
                    out.println("Please, enter x:");
                    float x;
                    try {
                        x = scanner.nextFloat();
                    } catch (Exception e) {
                        out.println("Incorrect input!\n");
                        break;
                    }
                    hyperbola.setX(x);
                    hyperbola.calcYByX();
                    out.println(hyperbola);
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
            out.println("1. Calculate x by y");
            out.println("2. Calculate y by x");
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
