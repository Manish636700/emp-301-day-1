package Day_3.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class college {

    String name;
    private List<course> course;
    public college(String name, List<course> course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<course> getCourse() {
        return course;
    }

    public void setCourse(List<course> course) {
        this.course = course;
    }

    public int count()
    {
        int studentcollege=0;
        List<student> students;

        for(course c:course)
        {
            students=c.getStudents();
            for (student s: students)
            {
                studentcollege++;
            }
        }
        return studentcollege;
    }
}
