import java.util.Objects;

public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * chuyen.
     *
     */

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * chuyen.
     *
     */

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * chuyen.
     *
     */

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0
                && Double.compare(rectangle.length, length) == 0
                && Objects.equals(topLeft, rectangle.topLeft);
    }

    public int hashCode() {
        return Objects.hash(width, length, topLeft);
    }

    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString() + ",width=" + width + ",length="
                + length + ",color=" + color + ",filled=" + filled + ']';
    }
}