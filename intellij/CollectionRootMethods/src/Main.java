import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add("ZZZ"));
        hashSet.add("YYY");
        hashSet.add("XXX");
        hashSet.add("CCC");
        hashSet.add("DDD");
        System.out.println(hashSet.add("ZZZ"));

        System.out.println(hashSet);
    }
}