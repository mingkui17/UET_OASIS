import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point p) {
        return Math.sqrt((pointX - p.pointX) * (pointX - p.pointX)
                + (pointY - p.pointY) * (pointY - p.pointY));
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
        Point point = (Point) o;
        return Double.compare(point.pointX, pointX) == 0
                && Double.compare(point.pointY, pointY) == 0;
    }

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * chuyen.
     *
     */

    public String toString() {
        pointX = (double) Math.round(pointX * 10) / 10;
        pointX = (double) Math.round(pointX * 10) / 10;
        return "(" + pointX + "," + pointY + ")";
    }
}
