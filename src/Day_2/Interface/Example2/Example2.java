package Day_2.Interface.Example2;

import java.util.Scanner;

interface A
{
    void input();
    void output();
}
class B implements A
{
    String name;
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }
    public void output() {
        System.out.println(name);
    }
}
class C implements A
{
    String name;

    @Override
    public void input() {
        name = "onlineclass";
    }
    public void output() {
        System.out.println(name);
    }
}

public class Example2 {
    public static void main(String[] args) {
        B b = new B();
        b.input();
        b.output();


        C c = new C();
        c.input();
        c.output();
    }
}
