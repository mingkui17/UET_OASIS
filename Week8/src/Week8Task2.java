import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Week8Task2 {
    public int nullPointerEx() throws NullPointerException {
        Week8Task2 w = null;
        return w.arrayIndexOutOfBoundsEx();
    }

    public int arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[2];
        return a[6];
    }

    /**
     * chuyen.
     *
     */

    public int arithmeticEx() {
        int a = 2;
        int b = 0;
        return a / b;
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        FileReader file = new FileReader("aaa.txt");
    }

    public void ioEx() throws IOException {
        FileReader file = new FileReader("aaa.txt");
    }

    /**
     * chuyen.
     *
     */

    public String nullPointerExTest() {
        try {
            nullPointerEx();
            return "Không có lỗi";
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
    }

    /**
     * chuyen.
     *
     */

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
            return "Không có lỗi";
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
    }

    /**
     * chuyen.
     *
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
            return "Không có lỗi";
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
    }

    /**
     * chuyen.
     *
     */

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
            return "Không có lỗi";
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
    }

    /**
     * chuyen.
     *
     */

    public String ioExTest() {
        try {
            ioEx();
            return "Không có lỗi";
        } catch (Exception e) {
            return "Lỗi IO";
        }
    }
}
