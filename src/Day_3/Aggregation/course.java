package Day_3.Aggregation;

import java.util.List;

public class course {

    String name;
    private List<student> students;

    public course(String name, List<student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<student> getStudents() {
        return students;
    }

    public void setStudents(List<student> students) {
        this.students = students;
    }
}
