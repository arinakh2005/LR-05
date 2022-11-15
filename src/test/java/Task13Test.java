import org.junit.jupiter.api.Test;
import task13.Square;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;
class Task13Test {

    @Test
    void calcArea() {
        out.println("should calculating the area of the square");

        Square square = new Square(6.25);
        double expected = 39.0625f;

        double actual = square.calcArea();

        assertEquals(expected, actual);
    }

    @Test
    void calcPerimeter() {
        out.println("should calculating the perimeter of the square");

        Square square = new Square(25);
        double expected = 100;

        double actual = square.calcPerimeter();

        assertEquals(expected, actual);
    }
}
