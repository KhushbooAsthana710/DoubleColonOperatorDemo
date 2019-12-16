interface IMRExample
{
    public void method1();
}

public class ExampleOfInstanceMethodReference {

    public void method2()
    {
        System.out.println("This is instance method reference example");
    }

    public static void main(String[] args)
    {
        // Using lambda expression
        IMRExample imrExample1 = () -> System.out.println("This is lambda expression example");
        imrExample1.method1();

        // Using double colon operator
        ExampleOfInstanceMethodReference exOfIMR =new ExampleOfInstanceMethodReference();
        IMRExample smrExample2 = exOfIMR::method2;
        smrExample2.method1();
    }

}
