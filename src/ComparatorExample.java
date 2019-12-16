import java.util.*;
import java.util.Arrays;

class Employee {
    private String name;
    private String grade;

    public Employee(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String toString()
    {
        return "Name: "+name+" Grade: "+grade;
    }
    public static int compareByGrade(Employee a, Employee b) {
        return a.getGrade().compareTo(b.getGrade());
    }
}
public class ComparatorExample {
    private static List<Employee> getDummyEmployees() {
        return Arrays.asList(new Employee("Neha", "C"),
                new Employee("Pooja", "F"),
                new Employee("Mayank", "B"),
                new Employee("Pravin", "D"),
                new Employee("Sumit", "A"),
                new Employee("Pravendre", "E")
        );
    }

    public static void main(String[] args)
    {
        List<Employee> employeeList = getDummyEmployees();

        // Using anonymous class
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getGrade().compareTo(e2.getGrade());
            }
        });
        System.out.println("Sorted by Grades using Anonymous class: "+employeeList);

        // Using Lambda expression
        employeeList.sort((Employee a, Employee b) -> {
                    return a.getGrade().compareTo(b.getGrade());
                });
        System.out.println("Sorted by Grades using Lambda expression: "+employeeList);

        //Using Double Colon Operator
        employeeList.sort(Employee::compareByGrade);
        System.out.println("Sorted by Grades using Double Colon Operator: "+employeeList);


        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println("Sorted by Names: "+employeeList);
    }
}
