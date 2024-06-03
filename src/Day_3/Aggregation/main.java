package Day_3.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        student s1 = new student("abc",21,"MCA");
        student s2 = new student("adele",22,"BSC");
        student s3 = new student("aria",23,"Poly");
        student s4 = new student("ally",24,"MCA");
        student s5 = new student("aria",25,"Poly");


        List<student> mca = new ArrayList<student>();
        mca.add(s1);
        mca.add(s4);


        List<student>bsc = new ArrayList<student>();
        bsc.add(s2);


        List<student>poly = new ArrayList<>();
        poly.add(s3);
        poly.add(s5);

        course course1 = new course("mca",mca);
        course course2 = new course("bsc",bsc);
        course course3 = new course("poly",poly);


        List<course>courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);

        college college1 = new college("abc",courses);
        //college college2 = new college("ade",courses);

        System.out.println(college1.getName());
        for(course c : courses)
        {
            System.out.println(c.getName());
            for(student s : c.getStudents())
            {
                System.out.println(s.getName() + " " + s.getAge() + " " + s.getCourse());

            }
        }

        System.out.println(college1.count());
    }
}
