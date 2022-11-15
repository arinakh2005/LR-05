package task1;
import java.util.Objects;

/**
 * The class serves to store data about a curve of the second order - <strong>Hyperbola</strong>
 * with properties <b>x</b> and <b>y</b>.
 * @author Arina Kholodnytska
 * @version 1.0
 */

public class Hyperbola implements Curve {
    private float x;
    private float y;

    /**
     * Class constructor
     * @see Hyperbola #Hyperbola(float x, float y)
     */
    public Hyperbola() {
        this.x = 1;
        this.y = 1;
    }

    /**
     * Class constructor. Creates a hyperbola with the specified values
     * @param x coordinate x
     * @param y coordinate y
     * @see Hyperbola #Hyperbola()
     */
    public Hyperbola(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void calcYByX() {
        this.y = (1.0f / this.x);
    }

    public void calcXByY() {
        this.x = (1.0f / this.y);
    }

    /**
     * Get the {@link Hyperbola y} coordinate of the hyperbola
     * @return coordinate x
     */
    public float getX() {
        return x;
    }

    /**
     * Set the {@link Hyperbola x} coordinate of the hyperbola
     * @param x coordinate x
     */
    public void setX(float x) {
        this.x = x;
    }

    /**
     * Get the {@link Hyperbola y} coordinate of the hyperbola
     * @return coordinate y
     */
    public float getY() {
        return y;
    }

    /**
     * Set the {@link Hyperbola y} coordinate of the hyperbola
     * @param y coordinate y
     */
    public void setY(float y) {
        this.y = y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Hyperbola that = (Hyperbola) obj;

        if (x != that.x) return false;
        return y == that.y;
    }

    /**
     * Transform object data to string:
     * "Point x: {@link Hyperbola x} + Point y: {@link Hyperbola y}
     */
    @Override
    public String toString() {
        return String.format("Point x: %.2f;\tPoint y: %.2f", this.x, this.y);
    }
}
