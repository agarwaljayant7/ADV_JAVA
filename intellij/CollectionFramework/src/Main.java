import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

                Collection collection1 = new ArrayList();
                collection1.add("AAA");
                collection1.add("BBB");
                collection1.add("CCC");
                collection1.add("DDD");
                collection1.add("EEE");
                collection1.add("FFF");
                System.out.println(collection1);

                Collection collection2 = new ArrayList();
                collection2.add("BBB");
                collection2.add("CCC");
                collection2.add("DDD");
                collection2.add("EEE");
                System.out.println(collection2);

                System.out.println(collection2.retainAll(collection1));
                System.out.println(collection2);

                System.out.println(collection1.retainAll(collection2));
                System.out.println(collection1);
    }
}