class A{
    int i = 30;
    int j = 40;
}
class B extends A{
    int i = 30;
    int j = 40;
    B(int i , int j){
        System.out.println("Local vars : " + i + " " + j);
        System.out.println("Class vars : " + this.i + " " + this.j);
        System.out.println("Super vars : " + super.i + " " + super.j);
    }
}
public class Main {
    public static void main(String[] args) {
       B b = new B(30, 40);
    }
}