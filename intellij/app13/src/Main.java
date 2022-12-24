
abstract class A {
    int i = 10;
    int j = 20;
    A(){
        System.out.println("A-Con");
    }
}
class B extends A{
    int l = 30;
    int m = 40;

    B(){
        System.out.println("B-Con");
    }
}
public class Main {
    public static void main(String[] args) {
        B b = new B();

    }
}