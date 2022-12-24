import com.jayant.entities.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args)throws Exception {
        Class cls = Employee.class;
        Method[] methods = cls.getDeclaredMethods();
        for(Method method : methods){
            System.out.println("Name      : " + method.getName());
            System.out.println("Modifiers : " + Modifier.toString(method.getModifiers()));
            System.out.println("Return type : " + method.getReturnType());
            Class[] classes = method.getParameterTypes();
            System.out.print("Parameter Type : ");
            for(Class cl : classes){

                System.out.print(cl.getName() + " ");
            }
            System.out.println();
            Class[] classes1 = method.getExceptionTypes();
            for(Class cl : classes1){
                System.out.print("Exception Type : " + cl.getName() + " ");
            }
            System.out.println("---------------------------");
        }
//        Class cls = Employee.class;
//        Constructor[] cons = cls.getConstructors();
//        for(Constructor con : cons){
//            System.out.println("Name           :  " + con.getName());
//            Class[] classes = con.getParameterTypes();
//            System.out.print("Param Types    : ");
//            for(Class cl : classes){
//                System.out.print(cl.getName() + " ");
//            }
//            System.out.println();
//            System.out.println("Modifiers     : " + Modifier.toString(con.getModifiers()));
//            Class[] classes1 = con.getExceptionTypes();
//            for(Class cl : classes1) {
//                System.out.println("Exception type   : " + cl.getName());
//            }
//            for(Class cl : classes1){
//                System.out.println(cl.getName() + " ");
//            }
//            System.out.println();
//            System.out.println("---------------------------------");
//        }
    }
}