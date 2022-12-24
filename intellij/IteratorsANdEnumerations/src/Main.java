import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vector vector = new Vector();
        vector.add("AAA");
        vector.add("BBBB");
        vector.add("CCCC");
        vector.add("DDD");
        vector.add("EEE");

        System.out.println(vector);
        Enumeration enumeration = vector.elements();
        while(enumeration.hasMoreElements()){
//        Enumeration enumeration1 = new Vector<>("AAA").elements();
//        it allows only read opetions while iterating, it does not allow remove or replace operaionts
//                it allows to read all the elemenets only in forward directions
//                not in backward direction
//                only first element to last elements
//                so this is clearly
//                It
            System.out.println(enumeration.nextElement());
            Thread.sleep(1000);
//        }
    }
}

/*

Enumeration - JDK 1.0
It is a legacy cursor
It is applicable for only legacy collection to read elements
java.uti.Enumeration
it's implementation class is provided by java internally
enumeration object
Collection object
enumeration object
to get enumeration obejct
java.util.enumeration
following method

public Enumeration elements()
Enumeration e = vector.elements();
where elements method will read all the elements from the vector and
all these elements must be stored in Enumeration object which are
ready to read or iterate
available to read
right sir
 */