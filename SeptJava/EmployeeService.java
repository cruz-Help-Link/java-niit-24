import java.text.NumberFormat;
import java.util.Locale;

public class EmployeeService {
    public static void main(String[] args) {
        System.out.println("Employee service class");
        System.out.println("On line");
        String sent = "The bus is yellow";
        System.out.println(sent);

        NumberFormat nmf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        System.out.println(nmf.format(23000));  //23K
        System.out.println(nmf.format(45000000)); //45M
        // 560,000,000   //45,000
        String name; //r
        int num; //p

    }
}