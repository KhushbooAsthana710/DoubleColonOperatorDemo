import java.util.function.Function;

interface SMRExample
{
    public void method1();
}

public class ExampleOfStaticMethodReference {

    public static void method2()
    {
        System.out.println("This is static method reference example");
    }

    public static void main(String[] args)
    {
        // Using lambda expression
        SMRExample smrExample1 = () -> System.out.println("This is lambda expression example");
        smrExample1.method1();

        // Using double colon operator
        SMRExample smrExample2 = ExampleOfStaticMethodReference::method2;
        smrExample2.method1();


        //Function<Double, Double> square = (Double x) -> x * x;
        Function<Double, Double> square = MathOp::square;
        System.out.println(square.apply(23d));
    }

}

class MathOp {
    public static double square(double num){
        return Math.pow(num, 2);
    }
}
