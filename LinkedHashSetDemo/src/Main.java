import java.util.*;

// Insertion order is followed , and remaining same as HashSet
public class Main {
    public static void main(String[] args) {

    HashSet hashSet = new HashSet();
    hashSet.add("AAA");
    hashSet.add("BBB");
    hashSet.add("FFF");
    hashSet.add("CCC");
    hashSet.add("EEE");

        System.out.println(hashSet);

    LinkedHashSet linkedHashSet = new LinkedHashSet();
    linkedHashSet.add("AAA");
    linkedHashSet.add("BBB");
    linkedHashSet.add("FFF");
    linkedHashSet.add("CCC");
    linkedHashSet.add("EEE");
        System.out.println(linkedHashSet);

    }
}