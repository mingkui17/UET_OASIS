public class StudentManagement {
    Student [] students = new Student[100];
    int count = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equals(s2.getGroup())) {
            return true;
        } else {
            return false;
        }
    }

    public void addStudent(Student newStudent) {
        students[count] = newStudent;
        count++;
    }

    public String studentsByGroup() {
        String bygroup = "";
        boolean[] check = new boolean[count];
        for (int i = 0; i < count; i++) {
            check[i] = true;
        }
        for (int i = 0; i < count; i++) {
            if (check[i]) {
                bygroup += students[i].getGroup() + "\n";
                for (int j = i; j < count; j++) {
                    if (sameGroup(students[i], students[j])) {
                        bygroup += students[j].getInfo() + "\n";
                        check[j] = false;
                    }
                }
            }
        }
        return bygroup;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count; j++) {
                    students[j] = students[j + 1];
                }
                break;
            }
        }
        count--;
    }

    public static void main(String[] args) {
        //tudent s = new Student("Nguyen Van An", "17020001", "17020001@vnu.edu.vn");
        //s.setGroup("K62CC");
        //StudentManagement ss = new StudentManagement();
        //ss.addStudent(s);
    }
}
