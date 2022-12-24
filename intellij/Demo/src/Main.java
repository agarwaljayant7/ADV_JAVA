
interface I{
    int x = 10;
    void m1();
    void m2();
    void m3();
}

class A implements I{
    public void m1() {
        System.out.println("m1-A");
    }
    public void m2() {
        System.out.println("m2-A");
    }
    public void m3() {
        System.out.println("m3-A");
    }

    public void m4(){
        System.out.println("m4-A");
    }
}
public class Main {
    public static void main(String[] args) {
       I i = new A();
       i.m1();
       i.m2();
       i.m3();
//       i.m4();

       A a  = new A();
       a.m1();
       a.m2();
       a.m3();
       a.m4();

        System.out.println(I.x);
        System.out.println(i.x);
        System.out.println(A.x);
        System.out.println(a.x);
    }
}