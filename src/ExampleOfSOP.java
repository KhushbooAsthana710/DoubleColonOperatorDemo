import java.util.stream.Stream;

public class ExampleOfSOP {

    public static void main(String[] args) {
        // Created Stream of String
        Stream<String> stream
                = Stream.of("Java",
                "C#",
                "Python",
                "C",
                "C++",
                "Ruby");

        // Print the stream using lambda expression
        //stream.forEach(s -> System.out.println(s));

        // Print the stream using double colon operator
        stream.forEach(System.out::println);
    }

}
