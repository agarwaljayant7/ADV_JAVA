import com.durgasoft.app18.entities.CraftLoan;
import com.durgasoft.app18.entities.GoldLoan;
import com.durgasoft.app18.entities.Loan;
import com.durgasoft.app18.entities.StudyLoan;

public class Main {
    public static void main(String[] args){
        Loan goldLoan = new GoldLoan();
        System.out.println("Gold loan IR  : " + goldLoan.getIR());

        Loan studyLoan = new StudyLoan();
        System.out.println("Study loan    : " + studyLoan.getIR());

        Loan craftLoan = new CraftLoan();
        System.out.println("Craft loan    : " + craftLoan.getIR());


    }
}
/* Rules and regulations to  method overriding:

 Sir why super class types are not compatible with subclass types
 */