import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class SetExample {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList("Java","C#","Python"));
        Predicate<String> pred = set::contains;
        System.out.println(pred.test("C#"));
        System.out.println(pred.test("C++"));
    }
}
