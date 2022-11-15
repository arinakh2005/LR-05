import org.junit.jupiter.api.Test;
import task1.Hyperbola;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test {
    @Test
    void calcCoordinateXByY() {
        out.println("should calculating coordinate x by y");

        Hyperbola hyperbola = new Hyperbola();
        hyperbola.setY(0.1f);
        float expected = 10;

        hyperbola.calcXByY();

        assertEquals(expected, hyperbola.getX());
    }

    @Test
    void calcCoordinateYByX() {
        out.println("should calculating coordinate y by x");

        Hyperbola hyperbola = new Hyperbola();
        hyperbola.setX(2.5f);
        float expected = 0.4f;

        hyperbola.calcYByX();

        assertEquals(expected, hyperbola.getY());
    }
}
