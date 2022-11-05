import static java.lang.System.exit;
import static java.lang.System.out;
import static java.lang.Thread.sleep;
import java.util.*;

public class Task12 {
    public static final int MENU_ITEMS = 5;
    public static final int MAX_NUMBERS_IN_SET = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("\nTask 12");
        int chosenMenuItem;

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(-1);

        do {
            chosenMenuItem = showMenu();
            switch (chosenMenuItem) {
                case 1:
                    printSet(set);
                    out.println("Please, press 'Enter' to continue...\n");
                    scanner.nextLine();
                    break;
                case 2:
                    printSet(sortSet(set));
                    break;
                case 3:
                    out.print("Please, input number: ");
                    try {
                        int numberForAdding = scanner.nextInt();
                        addElemToSet(set, numberForAdding);
                    } catch (Exception e) {
                        scanner.nextLine();
                        out.println("Invalid input data!");
                        break;
                    }
                    break;
                case 4:
                    out.print("Please, input number: ");
                    try {
                        int numberForRemoving = scanner.nextInt();
                        scanner.nextLine();
                        removeElemFromSet(set, numberForRemoving);
                    } catch (Exception e) {
                        scanner.nextLine();
                        out.println("Invalid input data!");
                        break;
                    }
                    break;
                case 5:
                    out.println("Program was successfully finished!\n");
                    exit(0);
                    break;
            }
            clearConsole();
        } while (chosenMenuItem != 0);
    }

    public static <T extends Collection<Integer>> void printSet(T set) {
        if (set.isEmpty()) {
            out.println("You haven't added any numbers yet!\n");
        } else {
            out.print("Set of numbers: ");
            out.println(set);
        }
    }

    private static <T extends Collection<Integer>> TreeSet<Integer> sortSet(T set) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<Integer>(set);
        treeSet.addAll(set);

        out.print("Please, choose order: (d - descending, a - ascending): ");
        String chosenOrder = scanner.nextLine();

        if (chosenOrder.equals("d")) return (TreeSet<Integer>) treeSet.descendingSet();

        return treeSet;
    }

    public static HashSet<Integer> addElemToSet(HashSet<Integer> set, int elem) {
        if (set.contains(elem)) {
            out.printf("Number %d already exist in set!\n", elem);
        } else {
            if (isSizeExceeded(set)) return set;

            set.add(elem);
            out.println("Successfully added!");
        }

        return set;
    }

    public static HashSet<Integer> removeElemFromSet(HashSet<Integer> set, int elem) {
        if (set.contains(elem)) {
            set.remove(elem);
            out.println("Successfully removed!");
        } else {
            out.printf("Number %d doesn't exist in set!\n", elem);
        }

        return set;
    }

    private static <T extends Collection<Integer>> boolean isSizeExceeded(T set) {
        if (set.size() >= MAX_NUMBERS_IN_SET) {
            out.println("Set size exceeded");
            return true;
        } else {
            return false;
        }
    }

    public static Integer showMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosenMenuItem = 0;

        do {
            out.println("\nMenu:");
            out.println("1. Show numbers");
            out.println("2. Show sorted numbers");
            out.println("3. Add number");
            out.println("4. Delete number");
            out.println("5. Exit\n");
            out.print("Choose menu item (1-5): ");
            try {
                chosenMenuItem =  scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (chosenMenuItem < 0 || chosenMenuItem > MENU_ITEMS);

        return chosenMenuItem;
    }

    public static void clearConsole() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; ++i) {
            out.println();
        }
    }
}
