import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List list = new ArrayList();
       list.add("AAA");
       list.add("BBB");
       list.add("CCC");
       list.add("DDDD");
       list.add("EEE");
        System.out.println(list);

        Iterator iterator = list.iterator();
//        Enumeration enumeration =


        while(iterator.hasNext()){
            String element = (String)iterator.next();
            System.out.println(element);
            if(element.equalsIgnoreCase("BBB")){
                iterator.remove();
            }
        }
        System.out.println(list);
        System.out.println(iterator.toString());
    }
}