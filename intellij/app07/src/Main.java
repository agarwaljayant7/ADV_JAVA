import com.durgasoft.app07.entities.Branch;
import com.durgasoft.app07.entities.Student;

public class Main {
    public static void main(String[] args) {
       Branch branch = new Branch();
       branch.setBranchId("B-111");
       branch.setBranchName("Computer Science");

       Student student1 = new Student();
       student1.setSid("S-111");
       student1.setSname("AAA");
       student1.setSaddr("Hyd");
       student1.setBranch(branch);

        Student student2 = new Student();
        student2.setSid("S-222");
        student2.setSname("BBB");
        student2.setSaddr("Hyd");
        student2.setBranch(branch);

        Student student3 = new Student();
        student3.setSid("S-333");
        student3.setSname("CCC");
        student3.setSaddr("Hyd");
        student3.setBranch(branch);

        Student student4 = new Student();
        student4.setSid("S-444");
        student4.setSname("DDD");
        student4.setSaddr("Hyd");
        student4.setBranch(branch);

        student1.getStudentDetails();
        student2.getStudentDetails();
        student3.getStudentDetails();
        student4.getStudentDetails();
    }
}