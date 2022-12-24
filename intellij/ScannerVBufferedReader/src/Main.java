
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(100, "Jayant");
        Employee e2 = new Employee(101, "Sagar");

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(e1);
        arrayList.add(e2);

        Collections.sort(arrayList, (o1, o2) -> o1.getEno() > o2.getEno() ? 1 : o1.getEno() < o2.getEno() ? -1 : 0 );
        System.out.println(arrayList);

    }
}
class Employee{
    private int eno;
    private String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public String toString() {
        return (eno+":"+ename);
    }
}