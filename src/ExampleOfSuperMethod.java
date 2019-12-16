import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class SuperClass {

    String print(String str)
    {
        return ("Base " + str + "\n");
    }
}
public class ExampleOfSuperMethod extends SuperClass {

    @Override
    String print(String s)
    {
        // call the super method using double colon operator
        Function<String, String> func = super::print;

        String newValue = func.apply(s);
        newValue += "Child " + s + "\n";
        System.out.println(newValue);

        return newValue;
    }

    public static void main(String[] args)
    {
        List<String> list = new ArrayList();
        list.add("Java");
        list.add("Python");
        list.add("C#");

        // call the instance method using double colon operator
        list.forEach(new ExampleOfSuperMethod()::print);
    }
}