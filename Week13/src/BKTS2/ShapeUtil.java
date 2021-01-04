import java.util.List;

public class ShapeUtil {
    /**
     * chuyen.
     *
     */

    public String printInfo(List<GeometricObject> shapes) {
        String s = "Circle:\n";
        for (GeometricObject i : shapes) {
            if (i instanceof Circle) {
                Circle c = (Circle) i;
                s += c.getInfo() + "\n";
            }
        }
        s += "Triangle:\n";
        for (GeometricObject i : shapes) {
            if (i instanceof Triangle) {
                Triangle tri = (Triangle) i;
                s += tri.getInfo() + "\n";
            }
        }
        return s;
    }
}
