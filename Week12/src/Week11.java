import java.util.Comparator;
import java.util.List;

public class Week11 {
    /**
     * chuyen.
     *
     */

    public static <T> List<T> sortGeneric(List<T> arr) {
        if (arr.get(0) instanceof Person) {
            arr.sort(new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {
                    if (o1 instanceof Person && o2 instanceof Person) {
                        Person x = (Person) o1;
                        Person y = (Person) o2;

                        int com = x.getName().compareTo(y.getName());
                        if (com > 0) {
                            return +1;
                        } else if (com < 0) {
                            return -1;
                        }
                        
                        if (x.getAge() > y.getAge()) {
                            return +1;
                        } else if (x.getAge() < y.getAge()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                    return 0;
                }
            });
        } else {
            arr.sort(null);
        }
        return arr;
    }
}
