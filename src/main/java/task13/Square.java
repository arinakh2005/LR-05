package task13;

/**
 * The class serves to store data about a <strong>Square</strong>
 * @author Arina Kholodnytska
 * @version 1.0
 */
public class Square implements Figure {
    private double side;

    /**
     * Class constructor
     * @see Square #Square(double side)
     */
    public Square() {
        this.side = 1;
    }

    /**
     * Class constructor. Creates a square with the specified values
     * @param side the side of square
     * @see Square #Square()
     */
    public Square(double side) {
        if (!isValidSide(side)) return;

        this.side = side;
    }

    public double calcArea() {
        return Math.pow(this.side, 2);
    }

    public double calcPerimeter() {
        return this.side * 4;
    }

    private boolean isValidSide(double side) {
        boolean isPositiveNumber = side > 0;

        if (!isPositiveNumber) System.out.println("Incorrect side value!");

        return isPositiveNumber;
    }

    /**
     * Get the {@link Square side} of the square
     * @return the side of square
     */
    public double getSide() {
        return side;
    }

    /**
     * Set the {@link Square side} of the square
     * @param side of square
     */
    public void setSide(double side) {
        if (isValidSide(side)) {
            this.side = side;
        } else {
            this.side = 0;
        }
    }

    @Override
    public int hashCode() {
        return (int) (31 * side);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Transform object data to string:
     * "Side of square = {@link Square side}
     */
    @Override
    public String toString() {
        return String.format("Side of square = %.2f", this.side);
    }
}
