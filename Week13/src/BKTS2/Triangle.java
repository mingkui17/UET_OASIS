public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * chuyen.
     *
     */

    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        if (a + b <= c || a + c <= b || c + b <= a) {
            throw new RuntimeException();
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        double c1 = p1.getX() * (p2.getY() - p3.getY());
        double c2 = p2.getX() * (p3.getY() - p1.getY());
        double c3 = p3.getX() * (p1.getY() - p2.getY());
        return Math.abs(c1 + c2 + c3) / 2;
    }

    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
    }

    @Override
    public String getInfo() {
        return "Triangle[" + p1.getInfo() + "," + p2.getInfo()
                + "," + p3.getInfo() + "]";
    }
}
