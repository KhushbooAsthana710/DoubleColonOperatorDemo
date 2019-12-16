import java.util.*;

class Test {
    String str=null;
    Test(String s)
    {
        this.str=s;
    }
    // instance function to be called
    void someFunction1()
    {
        System.out.println(this.str);
    }
}

class ExampleOfInstanceMethodOfArbitraryType {

    public static void main(String[] args)
    {
        List<Test> list = new ArrayList();
        list.add(new Test("Java"));
        list.add(new Test("Python"));
        list.add(new Test("C#"));

        // call the instance method using double colon operator
        list.forEach(Test::someFunction1);
    }
}
