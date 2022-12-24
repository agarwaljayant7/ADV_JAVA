import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

//    @Override
//    public int compare(Object s1, Object s2) {
//        return -s1.toString().compareTo(s2.toString());
//    }@Override
//    public int compare(Object s1, Object s2) {
//        return -s1.toString().compareTo(s2.toString());
//    }

    @Override
    public int compare(Object o1 , Object o2){
        return (Integer.parseInt(o1.toString()) > Integer.parseInt(o2.toString())) ? -1 :
                (Integer.parseInt(o1.toString()) < Integer.parseInt(o2.toString())) ? 1 : 0;
    }
}
