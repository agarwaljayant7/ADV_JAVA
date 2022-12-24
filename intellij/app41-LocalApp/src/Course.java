

public class Course {

    private String cid;
    private String cname;
    private int cost;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Course() {

    }

    public Course(String cid, String cname, int cost) {
        this.cid = cid;
        this.cname = cname;
        this.cost = cost;
    }
}
