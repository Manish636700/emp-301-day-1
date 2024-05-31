package Day_1.Abstract;

abstract class Ab {
    Ab()
    {
        System.out.println("Ab");
    }
    void m1()
    {
        System.out.println("m1");
    }
    abstract void m2();
}
class Ab1 extends Ab {
    @Override
    void m2() {
        System.out.println("m2");
    }

    @Override
    void m1() {
        super.m1();
    }
}
class main{
    public static void main(String[] args) {
        Ab a = new Ab1();
        a.m1();
        a.m2();
    }
}