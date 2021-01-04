public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    String getName() {
        return name;
    }

    void setName(String n) {
        name = n;
    }

    String getId() {
        return id;
    }

    void setId(String n) {
        id = n;
    }

    String getGroup() {
        return group;
    }

    void setGroup(String n) {
        group = n;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String n) {
        email = n;
    }

    public Student() {
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
        group = "K62CB";
    }

    public Student(Student s) {
        name = s.name;
        id = s.id;
        email = s.email;
        group = s.group;
    }

    String getInfo() {
        return name + " - " + id + " - " + group + " - " + email;
    }
}
