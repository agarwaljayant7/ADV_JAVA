import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add("AAA");
        linkedList.add("BBB");
        linkedList.add("CCCC");
        linkedList.add("DDD");
        System.out.println(linkedList);

        linkedList.addFirst("XXX");
        linkedList.addLast("YYY");
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

//        ArrayList arrayList = new ArrayList();
//        arrayList
//                .add("AAA");
//        arrayList.add("BBB");
//        arrayList.add("CCC");
//        arrayList.add("DDDD");
//        System.out.println(arrayList);
//
//        LinkedList linkedList = new LinkedList(arrayList);
////       LinkedList linkedList = new LinkedList();
//        System.out.println(linkedList);
//        System.out.println();
//
//        Set set = new HashSet();
//        set.add("XXX");
//        set.add("YYY");
//        set.add("ZZZ");
//        System.out.println(set);
//
//        LinkedList linkedList1 = new LinkedList(set);
//        System.out.println(linkedList1);
//        System.out.println();
//
//        Queue queue = new PriorityQueue();
//        queue.add(111);
//        queue.add(222);
//        queue.add(333);
//        queue.add(444);
//        System.out.println(queue);
//        LinkedList linkedList2 = new LinkedList(queue);
//        System.out.println(linkedList2);
//        System.out.println();
//
    }
}