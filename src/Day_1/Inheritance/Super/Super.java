package Day_1.Inheritance.Super;

class Super1{
    int age;
    String name;
    public Super1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    void display()
    {
        System.out.println(age+" "+name);
    }
}
class Super2 extends Super1{
    String work;
    public Super2(int age, String name, String work) {
        super(age, name);
        this.work = work;
    }
    void display()
    {
        System.out.println(super.age+" "+super.name+" "+work);
    }
}


public class Super {
    public static void main(String[] args) {
        Super1 s1 = new Super1(10, "John");
     s1.display();

     Super2 s2 = new Super2(11, "John1", "Doe");
     s2.display();
    }
}

