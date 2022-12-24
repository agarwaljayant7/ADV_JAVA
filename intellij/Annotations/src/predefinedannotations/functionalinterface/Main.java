package predefinedannotations.functionalinterface;


import java.lang.annotation.Inherited;

@FunctionalInterface
interface CRepository{
    public void persist(Object obj);
//    public void update(Object obj);
}
class CRepositoryImpl implements CRepository{

    @Override
    public void persist(Object obj) {
        System.out.println(obj.toString() + " Persisted Successfully");
    }
//
//    @Override
//    public void update(Object obj) {
//        System.out.println(obj.toString() + " Updated successfully");
//    }
}
public class Main {
    public static void main(String[] args) {

        CRepository repository = new CRepositoryImpl();
        repository.persist("Employee");
//        repository.update("Employee");

        }
    }
