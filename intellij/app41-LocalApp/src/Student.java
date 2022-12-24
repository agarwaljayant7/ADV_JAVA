public class Student {

    private String sid;
    private String sname;
    private String saddr;
    private Course[] courses;

    public Student() {
    }

    public Student(String sid, String sname, String saddr, Course[] courses) {
        this.sid = sid;
        this.sname = sname;
        this.saddr = saddr;
        this.courses = courses;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSaddr() {
        return saddr;
    }

    public void setSaddr(String saddr) {
        this.saddr = saddr;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public void getStudentDetails(){
        System.out.println("Student Details ");
        System.out.println("--------------------------");
        System.out.println("Student Id      : " + sid);
        System.out.println("Student Name    : " + sname);
        System.out.println("Student Address : " + saddr);
        System.out.println();
        System.out.println("CID\tCNAME\tCCOST");
        System.out.println("------------------------");

        for(Course course : courses){
            System.out.print(course.getCid()+"\t");
            System.out.print(course.getCname()+"\t");
            System.out.print(course.getCost()+"\n");
        }

    }
}
