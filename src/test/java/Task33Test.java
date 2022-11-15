import org.junit.jupiter.api.Test;
import task33.Computer;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task33Test {
    @Test
    void computersNotEquals() {
        Computer computer1 = new Computer("HP 12C5", 2.7, 3.5, 2, 4, 32);
        Computer computer2 = new Computer("HP 12C6", 2.7, 3.5, 4, 8, 64);

        boolean actual = computer1.equals(computer2);

        assertFalse(actual);
    }

    @Test
    void computersAreEqual() {
        Computer computer1 = new Computer("HP 12C5", 2.7, 3.5, 2, 4, 32);
        Computer computer2 = new Computer("HP 12C5", 2.7, 3.5, 2, 4, 32);

        boolean actual = computer1.equals(computer2);

        assertTrue(actual);
    }
}
