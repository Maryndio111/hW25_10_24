import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(1,"Dariev", 35,9000),
                new Employee(2,"Richter", 45,2000),
                new Employee(3,"Tsalman", 50,2500)
        };
        Arrays.sort(employees);
        for (Employee employee:employees){
            System.out.println(employee);
        }

    }
}