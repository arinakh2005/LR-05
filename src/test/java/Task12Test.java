import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task12Test {

    @Test
    void addNumberToSet() {
        out.println("Test should add number to set");

        HashSet<Integer> set = new HashSet<>();
        set.add(-1);
        set.add(-2);
        set.add(-3);
        set.add(-4);
        set.add(-5);

        out.println("Before adding number");
        Task12.printSet(set);
        int newNumber = -10;

        HashSet<Integer> actualSet = Task12.addElemToSet(set, newNumber);
        out.println("After adding number");
        Task12.printSet(set);

        assertTrue(actualSet.contains(newNumber));
    }

    @Test
    void removeNumberFromSet() {
        out.println("Test should remove number from set");

        HashSet<Integer> set = new HashSet<>();
        set.add(-1);
        set.add(-2);
        set.add(-3);
        set.add(-4);
        set.add(-5);

        out.println("Before removing number");
        Task12.printSet(set);
        int numberForRemoving = -5;

        HashSet<Integer> actualSet = Task12.removeElemFromSet(set, numberForRemoving);
        out.println("After removing number");
        Task12.printSet(set);

        assertFalse(actualSet.contains(numberForRemoving));
    }
}
