import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        ListIterator listIterator = list.listIterator();

        /*
        while(listIterator.hasNext()){
            System.out.println(listIterator.nextIndex() + "===>" + listIterator.next());
        }
        System.out.println();
*/
        listIterator.previousIndex()
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previousIndex() + " " + listIterator.previous());
        }
    }
}