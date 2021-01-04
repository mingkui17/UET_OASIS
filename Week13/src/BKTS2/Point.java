public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * chuyen.
     *
     */

    public double distance(Point other) {
        double temp1 = (x - other.x) * (x - other.x);
        double temp2 = (y - other.y) * (y - other.y);
        return Math.sqrt(temp1 + temp2);
    }

    /**
     * chuyen.
     *
     */
    public String getInfo() {
        String s1 = String.format("%.2f", x);
        String s2 = String.format("%.2f", y);
        return "(" + s1 + "," + s2 + ")";
    }
}
