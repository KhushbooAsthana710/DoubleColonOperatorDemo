import java.util.function.Function;

public class ArrayConstructorReferenceExample {

    public static void main(String[] args)
    {
        Function<Integer, Employee[]> empCreator = Employee[]::new;
        Employee[] empArray = empCreator.apply(5);

        for(int i=0;i<5;i++)
        {
            empArray[i]=new Employee("TestName "+i,"TestGrade "+i);
        }
        for(Employee emp:empArray)
        {
            System.out.println(emp.toString());
        }
    }
}
