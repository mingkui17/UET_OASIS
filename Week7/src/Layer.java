import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    /**
     * chuyen.
     *
     */

    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
        }
    }

    /**
     * chuyen.
     *
     */

    public String getInfo() {
        String s = "Layer of crazy shapes: \n";
        for (Object i : shapes) {
            s += i.toString() + "\n";
        }
        return s;
    }

    /**
     * chuyen.
     *
     */

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
        }
    }
}
